<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인 폼 화면</title>
	<!-- Bootstrap CDN -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body class="text-center" id="loginForm">
        
<main class="form-signin w-50 mt-5 m-auto" >
      <%-- <form:form action="loginProc" modelAttribute="member" method="post"> // path="user_id" --%>
      <form:form action="loginProc" method="post">
        <h1 class="h3 mb-3 fw-normal">Please sign in</h1>
    
		<!-- 아이디 -->
        <div class="form-floating">
          <input name="user_id" type="text" class="form-control" id="floatingInput" placeholder="user_id" />
          <label for="floatingInput">아이디</label>
        </div>
		<!-- 비밀번호 -->
        <div class="form-floating">
          <input name="password" type="password" class="form-control" id="floatingPassword" placeholder="Password" />
          <label for="floatingPassword">비밀번호</label>
        </div>
    
        <button class="w-100 btn btn-lg btn-warning" type="submit">로그인</button>
        <p class="mt-5 mb-3 text-muted">&copy; 2022-08-21</p>
      </form:form>
    </main>    
</body>
</body>
</html>