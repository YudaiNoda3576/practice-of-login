<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member's album</title>
</head>
<body>
	<h2>
		<c:out value="${userBean.user_name}" />
		さんのアルバム
	</h2>
	<ul class="gallery_list">
		<!-- 1枚目の画像 -->
		<li class="gallery_item"><a
			href="https://cdn.pixabay.com/photo/2016/04/20/19/47/wolves-1341881_960_720.jpg"
			data-lightbox="snow" data-title="1枚目の画像"> <img
				src="https://cdn.pixabay.com/photo/2016/04/20/19/47/wolves-1341881_960_720.jpg"
				alt="">
		</a></li>
		<!-- 2枚目の画像 -->
		<li class="gallery_item"><a
			href="https://cdn.pixabay.com/photo/2017/01/14/12/59/iceland-1979445_960_720.jpg"
			data-lightbox="snow" data-title="2枚目の画像"> <img
				src="https://cdn.pixabay.com/photo/2017/01/14/12/59/iceland-1979445_960_720.jpg"
				alt="">
		</a></li>
		<!-- 3枚目の画像 -->
		<li class="gallery_item"><a
			href="https://cdn.pixabay.com/photo/2017/08/02/14/26/winter-landscape-2571788_960_720.jpg"
			data-lightbox="snow" data-title="3枚目の画像"> <img
				src="https://cdn.pixabay.com/photo/2017/08/02/14/26/winter-landscape-2571788_960_720.jpg"
				alt="">
		</a></li>
	</ul>
</body>
</html>