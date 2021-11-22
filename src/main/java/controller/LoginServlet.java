package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.UserBean;
import model.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// JSPから、ユーザーIDとパスワードの取得
		String user_id = request.getParameter("user-id");
		String password = request.getParameter("password");

		// 取得の確認
		System.out.println("ユーザーID:" + user_id);
		System.out.println("パスワード:" + password);

		LoginService loginService = new LoginService();

		// UserBeanの取得
		UserBean userBean = loginService.checkLogin(user_id, password);
		
	    //UserBeanをセッションにセット
	    HttpSession session = request.getSession(true);
	    session.setAttribute("userBean", userBean);

		// ログイン失敗の場合は、失敗ページへ
		if (userBean.getStatus() != 0) {
			// 失敗ページの転送
			request.getRequestDispatcher("/WEB-INF/login-failed.jsp").forward(request, response);

			return;
		}
		// ログイン完了ページへ転送
		request.getRequestDispatcher("/WEB-INF/top.jsp").forward(request, response);

		return;

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
