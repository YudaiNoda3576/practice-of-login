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
	<h1 style="color: red;">Sign in failed</h1>
	<!-- 判定フラグ -->
	<c:if test="${userBean.status == 1}" var="flg" />

	<%--IDが存在しない時(ステータス1の場合) --%>
	<c:if test="${flg}">
		<p>
			ユーザーID： <strong><c:out value="${userBean.user_id}" /></strong>
			は存在しません。<br />
		</p>
	</c:if>

	<%-- パスワード間違いの時(ステータス2の場合) --%>
	<c:if test="${!flg}">
		<p>
			<strong>パスワードが間違っています。</strong><br /> 
		</p>
	</c:if>

	<a href="javascript:history.back();">戻る</a>

</body>
</html>