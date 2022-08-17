<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="../includes/header.jsp"%>
<div class="row">
   <div class="col-lg-12">
      <h1 class="page-header">Board Read</h1>
   </div>
   <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
   <div class="col-lg-12">
      <div class="panel panel-default">
         <div class="panel-heading">조회</div>
         <!-- /.panel-heading -->
         <div class="panel-body">

            <div class="form-group">
               <label>글번호</label> 
               <input class="form-control" name="bnum"
                  readonly="readonly" value='<c:out value="${board.bnum}"/>'>
            </div>

            <div class="form-group">
               <label>제목</label> <input class="form-control" name="title"
                  readonly="readonly" value='<c:out value="${board.title}"/>'>
            </div>

            <div class="form-group">
               <label>내용</label>
               <textarea class="form-control" rows="5" cols="50" name="content" readonly="readonly" >
               	<c:out value="${board.content}" />
               </textarea>
            </div>

            <div class="form-group">
               <label>글쓴이</label> <input class="form-control" name="writer"
                  value='<c:out value="${board.writer}"/>' readonly="readonly">
            </div>
            <button data-oper='modify' class="btn btn-default" >
            	<a href='/board/modify?bnum=<c:out value="${board.bnum}"/>'>
            	수정</a>
            </button>
            <button data-oper='list' class="btn btn-info">리스트</button>

         </div>
         <!-- /.panel-body -->
      </div>
      <!-- /.panel -->
   </div>
   <!-- /.col-lg-12 -->
</div>
<!-- /.row -->







<%@include file="../includes/footer.jsp"%>