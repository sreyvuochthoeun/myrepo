<%@page import="session.Session"%>
<%@page import="bean.User"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>


<%	

	String id 		= request.getParameter("ID");
	String email	= request.getParameter("EMAIL");
    String pass		= request.getParameter("PASSWORD");
    
    User userSession = new User(id, email, pass, "", "");
	if(userSession.getAuthentication()){
		
	    Session.setUserSession(session, userSession);
	    
	   	response.sendRedirect("/A_WEB/myProfile.jsp");
	   	
	}else{
		response.sendRedirect("/A_WEB/error.jsp");
	}
   	
%>
