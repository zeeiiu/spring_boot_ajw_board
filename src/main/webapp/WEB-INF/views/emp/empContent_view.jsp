<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
   $(document).ready(function (){
      $('#a-delete').click(function(event){
         //prevendDefault()는 href로 연결해 주지 않고 단순히 click에 대한 처리를 하도록 해준다.
         event.preventDefault();
         console.log("ajax 호출전"); 
          
         $.ajax({
             type : "DELETE",
             url : "${pageContext.request.contextPath}/restful/board/" + "${content_view.bid}",
             data:{"bid":"${content_view.bid}"},
             success: function (result) {       
                 console.log(result); 
               if(result == "SUCCESS"){
                    //getList();
                          
               }
                       
             },
             error: function (e) {
                 console.log(e);
             }
         })
          
      });
   });   
</script>
</head>
<body>

	<table id="list-table" width="500" cellpadding="0" cellspacing="0"
		border="1">
		<form action="modify" method="post">
			<input type="hidden" name="bid" value="${empContent_view.empno}">
			<tr>
				<td>사원번호</td>
				<td>${empContent_view.empno}</td>

			</tr>

			<tr>
				<td>이름</td>
				<td>${empContent_view.ename}</td>

			</tr>
			<tr>
				<td>직업</td>
				<td>${empContent_view.job}</td>

			</tr>

			<tr>
				<td>관리자</td>
				<td>${empContent_view.mgr}</td>

			</tr>
			<tr>
				<td>날짜</td>
				<td>${empContent_view.hiredate}</td>

			</tr>

			<tr>
				<td>급여</td>
				<td>${empContent_view.sal}</td>

			</tr>

			<tr>
				<td>보너스</td>
				<td>${empContent_view.comm}</td>

			</tr>

			<tr>
				<td>부서번호</td>
				<td>${empContent_view.deptno}</td>

			</tr>

		</form>
	</table>

</body>
</html>