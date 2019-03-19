<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<script src="resources/jquery-3.3.1.min.js"></script>
<script src="https://www.gstatic.com/firebasejs/5.8.5/firebase.js"></script>
	<title>new document</title>
<script>
      // Initialize Firebase
      var config = {
        apiKey: "AIzaSyBgNcdD75pwlziKGeSRgTDT3kH4hDvO2io",
        authDomain: "realtime-db-web-practice.firebaseapp.com",
        databaseURL: "https://realtime-db-web-practice.firebaseio.com",
        projectId: "realtime-db-web-practice",
        storageBucket: "",
        messagingSenderId: "393936514150"
      };
      firebase.initializeApp(config);
    </script>
</head>
<body>
<h1>
	NEW DOCUMENT 
</h1>
	<input type="button" id="newDoc">문서 생성
    <script>
        function new_doc(){
            var uid = firebase.database().ref().child('docs').push().key;
            console.log(uid);
            
            $.ajax({
            	url:"creatnewdoc",
            	data:{uid:uid},
            	type:"POST"
            	
            })
        }
        document.addEventListener("DOMContentLoaded", function(){
            document.getElementById('newDoc').addEventListener('click', new_doc);
        });
    </script>
</body>
</html>
