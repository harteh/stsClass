<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원전체목록</title>
</head>
<body>

<h1>회원목록 불러오기 테스트</h1>
	<table class="table table-striped table-bordered table-hover">
		<c:forEach items="${list}" var="mem">
			<tr>
				<td><c:out value="${mem.user_id}" /></td>
				<td><c:out value="${mem.nickname }" /></td>
				<td><c:out value="${mem.password}" /></td>
			</tr>
		</c:forEach>
	</table>




</body>
</html>