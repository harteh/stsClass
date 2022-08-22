<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인 임시 메인</title>
	<!-- Bootstrap CDN -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
	
</head>
<body class="text-center mt-5">
	<main class="form-signin w-50 m-auto ">
		<h1>임시 메인 화면</h1>
		<p> ${user_id }  ${nickname } </p>
		<p> ${sessionScope.user_id }  ${sessionScope.nickname } </p>
		<p> ${message }  </p>
		
		
		<a href="login" class="w-75 btn btn-lg btn-warning">로그인</a><br><br>
		<a href="join" class="w-75 btn btn-lg btn-warning">회원가입</a><br><br>
	</main>
</body>
</html>