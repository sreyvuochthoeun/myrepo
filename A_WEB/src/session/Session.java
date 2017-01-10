package session;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;

public class Session {
	public final static String USER_SESSION_ATTRIBUTE	= "USER_SESSION";

	public static void setUserSession (HttpSession session, User userSession) {
		session.setAttribute(USER_SESSION_ATTRIBUTE, userSession);
		session.setMaxInactiveInterval(60*3*10);//60 * 60 * 24

	}

	public static void removeSessionUser (HttpSession session) {
		session.removeAttribute(USER_SESSION_ATTRIBUTE);
	}

	
	public static User getUserSession(HttpServletRequest request, HttpServletResponse response) throws Exception
	{		
		HttpSession session			= request.getSession(false);
		
		if(session != null){
			
			try {
				return (User) session.getAttribute(USER_SESSION_ATTRIBUTE);
			}
			catch(Exception e) {
				
				response.sendRedirect("/error.jsp");  
				
				throw new Exception();
			}
		
		}
		else{
			
			response.sendRedirect("/error.jsp");  
			
			throw new Exception();
		}
	}
}
