<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>API 카카오</title>
<!-- Bootstrap CDN -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
	
    <script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
	
	
</head>
<body class="text-center mt-5">
	<h3>API로 카카오 로그인하기</h3>
	
	<!-- 로그인 버튼 부분 -->
	<main class="form-signin w-50 m-auto ">
		<!-- 로고 사진 -->
		<img class="mb-4 mt-5" 
			src="https://tistory4.daumcdn.net/tistory/3192802/attach/a49822bfbe0e42a2a46187dfb6f14dfa" 
			alt="" width="222" height="227">
		<a id="custom-login-btn" class="btn btn-lg" 
			href="https://kauth.kakao.com/oauth/authorize
			?response_type=code&client_id=e90605fb64b5ed5eeffcf586eb651d12
			&redirect_uri=http://localhost:8080/login">
				    
				    
			<img
			  src="/resources/kakao_login_medium_narrow.png"
			  width="222"
			  alt="카카오 로그인 버튼"
			/>
		</a>

		<!-- 로그아웃 -->
    	<a href="http://developers.kakao.com/logout" class="w-50 btn btn-outline-secondary">Logout</a>	
	</main>
	
</body>
</html>