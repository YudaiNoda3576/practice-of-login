package model;

import dao.UserDao;
import domain.UserBean;

public class LoginService {
	/**
	 * @param user_id  ユーザーID
	 * @param password パスワード
	 * @return UserBean
	 */
	public UserBean checkLogin(String user_id, String password) {
		UserDao userDao = new UserDao();
		UserBean userBean = new UserBean();

		// UserBeanの取得
		userBean = userDao.getUser(user_id);

		// ID存在チェック
		// status: 0:OK, 1:不在, 2:NG
		if (userBean.getStatus() == 1) {
			return userBean;
		} else {
			// パスワードのチェック
			if (userBean.getPassword().equals(password)) {
				userBean.setStatus(0);
			} else {
				userBean.setStatus(2); 
			}
			return userBean;
		}
	}
}
