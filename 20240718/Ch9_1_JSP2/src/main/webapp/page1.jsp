<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import ="java.util.ArrayList" %>
 <%@page import = "tw.com.beans.Item" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<%
	ArrayList<Item>  list = 	(ArrayList<Item>)session.getAttribute("itemList");
	%>
	
	<ol>
		<%for (Item it : list) {%>
				<li><%=it.getId() %>:<%=it.getName()%> </li>
		<%} %>
	
	</ol>
</body>
</html>