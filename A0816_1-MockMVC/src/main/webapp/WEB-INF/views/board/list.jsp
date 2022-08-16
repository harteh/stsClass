<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@include file="../includes/header.jsp" %>

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Tables</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                DataTables Advanced Tables
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <table width="100%" class="table table-striped table-bordered table-hover" 
                		id="dataTables-example">
                    <thead>
                        <tr>
                            <th>글번호</th>
                            <th>제목</th>
                            <th>글쓴이</th>
                            <th>등록날짜</th>
                            <th>수정날짜</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${list }" var="bo">
                        <tr class="odd gradeX">
                            <td>${bo.bnum }</td>
                            <td>${bo.title }</td>
                            <td>${bo.writer }</td>
                            <td class="center">
                            	<fmt:formatDate value="${bo.redate }" pattern="yy-MM-dd"/>
                            </td>
                            <td class="center">
                            	<fmt:formatDate value="${bo.updatedate }" pattern="yy-MM-dd"/>
                            </td>
                        </tr>
                     	</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>





<%@include file="../includes/footer.jsp" %>