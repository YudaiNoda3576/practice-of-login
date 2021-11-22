package dao;

import domain.UserBean;

public class UserDao {
	/**
	 * ユーザーIDからUserBeanを取得
	 * 
	 * @param user_id ユーザーID
	 * @return UserBean ユーザーBean
	 */
	public UserBean getUser(String user_id) {
		UserBean userBean = new UserBean();
		
		switch (user_id) {
		case "001":// user_id=001の場合
			userBean.setUser_id(user_id);
			userBean.setUser_name("前田");
			userBean.setPassword("pass");
			userBean.setPhonenumber("090-0000-1111");
			userBean.setAddress("佐賀県杵島郡大町町福母3-2-2 パークハイツ福母 9F");
			userBean.setRole("member");
			break;
		case "002":// user_id=002の場合
			userBean.setUser_id(user_id);
			userBean.setUser_name("鈴木");
			userBean.setPassword("pass2");
			userBean.setPhonenumber("090-5561-1174 ");
			userBean.setAddress("三重県四日市市前田町9-1-9");
			userBean.setRole("member");
			break;
		case "100":// user_id=100の場合
			userBean.setUser_id(user_id);
			userBean.setUser_name("佐藤");
			userBean.setPassword("pass3");
			userBean.setPhonenumber("070-2968-0125 ");
			userBean.setAddress("香川県綾歌郡綾川町萱原8-3-3");
			userBean.setRole("admin");
			break;
		default:// ユーザーIDが存在しない場合
			userBean.setUser_id(user_id);
			userBean.setStatus(1);
		}

		return userBean;
	}

}
