<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Expires" CONTENT="0">
<meta http-equiv="Cache-Control" CONTENT="no-cache">
<meta http-equiv="Pragma" CONTENT="no-cache">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<%@page import="session.Session"%>
<%@page import="bean.User"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	User user = Session.getUserSession(request, response);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>myProfile.jsp</h1>
<% try{%>
<span>Email : <%=user.getEmail()%></span><br>
<span>Email : <%=user.getEmail()%></span><br>
<span>Email : <%=user.getEmail()%></span><br>
<span>Email : <%=user.getEmail()%></span><br>
<span>Email : <%=user.getEmail()%></span><br>
<form action="logout.jsp">
	
		<input type="submit" value="LOGOUT" />
</form>	
<%}catch(Exception e){
	response.sendRedirect("/A_WEB/error.jsp");
} %>

</body>
</html>