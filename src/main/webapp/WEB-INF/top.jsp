<%@ page language="java" contentType="text/html;
	charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
</head>
<body>
	<h1>Sign in success</h1>
	<div>
		ユーザーID：
		<c:out value="${userBean.user_id}" />
	</div>
	<div>
		ユーザー名：
		<c:out value="${userBean.user_name}" />
	</div>
	
	  <p class="album">
 		 <a href="AlbumServlet">Member's Album</a>
  	　</p>
  	
  	  <p class="logout">
 		 <a href="LogoutServlet">Logout</a>
  	　</p>
</body>
</html>