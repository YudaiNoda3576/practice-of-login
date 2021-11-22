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
 * Servlet implementation class RepoServlet
 */
@WebServlet("/AlbumServlet")
public class AlbumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AlbumServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LoginService loginService = new LoginService();
		// JSPから、ユーザーIDとパスワードの取得
		String user_id = request.getParameter("user-id");
		String password = request.getParameter("password");

		// UserBeanの取得
		UserBean userBean = loginService.checkLogin(user_id, password);

		// UserBeanをセッションにセット
		HttpSession session = request.getSession(true);
		session.setAttribute("userBean", userBean);
		// ページの転送
		request.getRequestDispatcher("/WEB-INF/album.jsp").forward(request, response);
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
