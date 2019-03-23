<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="resources/jquery-3.3.1.min.js"></script>
<title>Document Editor</title>
</head>

<script>
$(function(){
 	$('#editor').on('click', editor);
});

function editor(){
			
	var doc_uid = "";
			
		doc_uid += '비밀번호 입력 : ';
			
		$("#doceditor").html(doc_uid);
			
		doc_uid += '<input type="password" id="password" placeholder="비밀번호를 입력해주세요">';
			
		$('#doceditor').html(doc_uid);
					
		$('#selectuid').on('click', function(){
		var password = $('#password').val();
		$.ajax({
			url: 'selectuid'
			,method: 'POST'
			,data: { 'password' : password }
			,success: function(resp) {
				output(resp)
				
				var randomValue = uid;
        		
        		location.href=res+"?randomValue="+randomValue;
			}
		});
	});
}
			
function output(resp){
				
	var content = "";
				
	$.each(resp, function(index, item){
		content += '<tr>';
		content += '<td class=doc_uid"' + item.doc_uid + '">';
		content += '<td class=regdate"' + item.regdate + '">';
		content += '<td class=user_uid"' + item.user_uid + '">';
		content += '<td class=doc_password"' + item.password + '">';
		content += '<td class=doc_title"' + item.title + '">';
		content += '<td class=doc_deleted"' + item.deleted + '">';
		content += '</tr>';
	});
				
		$('#table').html(content);
}
</script>

<body>
	<h1>Document Editor</h1>
	<c:if test="${sessionScope.docInfo eq null}">
	<form action="new_doc" method="get">
	<div id="doceditor">
	<input type="button" id="editor" value="문서편집"><br>
	</div>
	<input type="button" id="selectuid" value="확인">	<br>
	</form>
	</c:if>
	
	<c:if test="${sessionScope.docInfo ne null}">
	<form action="new_doc" method="post">
	PASSWORD : ${sessionScope.docInfo}님 환영합니다.<br>
	<a href="logout">세션지움</a><br>
	</form>
	</c:if>
<table id="table">
</table>
</body>
</html>