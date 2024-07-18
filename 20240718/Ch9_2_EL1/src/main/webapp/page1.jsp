<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Item</h2>
	<p>name:${item1.name}</p>
	<p>price:${item1.price}</p>
	
	<h2>UserList</h2>
	<p>userList:${userList}</p>
	<c:forEach var="myUser" items="${userList}">
		<p>name:${myUser.name}</p>
		<p>age:${myUser.age}</p>
	</c:forEach>
	<h2>Map</h2>
	<p>${ userMap.user1.name}  </p>
	<p>${ userMap.user1.age}  </p>
	
	<p>${userMap["my user2"].name }</p>
	<p>${userMap["my user2"].age }</p>
	
</body>
</html>