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
            <div class="panel-heading"> DataTables Advanced Tables 
		    <button id="btn" type="button" class="btn btn-primary btn-xs pull-right">글등록</button>
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
                            <td> ${bo.bnum } </td>
                            <td>
	                            <a href='get?bnum=<c:out value="${bo.bnum }"/>'>
		                           <c:out value="${bo.title }"/>
	                            </a>
                            </td>
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
			
			<div class='pull-right'>
				<ul class="pagination">

					<c:if test="${paging.prev}">
						<li class="paginate_button previous"><a
							href="${paging.start -1}">Previous</a></li>
					</c:if>

					<c:forEach var="num" begin="${paging.start}" end="${paging.end}">
						<li class="paginate_button">
							<a href='list?pNum=${num }&amount=${paging.ba.amount }'>${num}</a>
						</li>
					</c:forEach>

					<c:if test="${paging.next}">
						<li class="paginate_button next"><a
							href="${paging.end +1 }">Next</a></li>
					</c:if>
				</ul>
			</div>
			<!--  end Pagination -->
			
			</div>
		</div>
	</div>
</div>

<div class="modal fade" id="my" tabindex="-1" role="dialog"
            aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal"
               aria-hidden="true">&times;</button>
            <h4 class="modal-title" id="myModalLabel">Modal title</h4>
         </div>
         <div class="modal-body">완료됨</div>
         <div class="modal-footer">
            <button type="button" class="btn btn-default"
               data-dismiss="modal">Close</button>
            <button type="button" class="btn btn-primary">Save changes</button>
         </div>
      </div>
      <!-- /.modal-content -->
   </div>
   <!-- /.modal-dialog -->
</div>
<!-- /.modal -->


<script type="text/javascript">
	$(document).ready(
		function() {
			var r = '<c:out value="${result}"/>';
			check(r);
			
			function check(r){
				if(r===''){
					return;
				}
				if(parseInt(r) > 0){
					$(".modal-body").html("글 "+ parseInt(r) + "번이 등록되었습니다.")
				}
				$("#my").modal("show");
			}
			
			
			$("#btn").on("click", function(){
				self.location="/board/submit";
			});
			
			
		});
</script>



<%@include file="../includes/footer.jsp" %>