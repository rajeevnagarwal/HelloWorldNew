package Admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.scribe.builder.ServiceBuilder;
import org.scribe.oauth.OAuthService;

import Admin.Google2Api;

/**
 * Servlet implementation class Log
 */
@WebServlet("/Log")
public class Log extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Log() {
        super();
        // TODO Auto-generated constructor stub
    }

    private static final String CLIENT_ID = "609718991740-7fboocss8f06d51trtvafnnqfvni95sa.apps.googleusercontent.com";
    private static final String CLIENT_SECRET = "zILpD9snksyqcHtLwnRT1FfX";
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ServiceBuilder builder= new ServiceBuilder(); 
	      OAuthService service = builder.provider(Google2Api.class) 
	         .apiKey(CLIENT_ID) 
	         .apiSecret(CLIENT_SECRET) 
	         .callback("http://localhost:8080/Project2/log.jsp")
	         .scope("openid profile email " + 
	               "https://www.googleapis.com/auth/plus.login " + 
	               "https://www.googleapis.com/auth/plus.me")  
	         .debug()
	         .build(); //Now build the call
	      HttpSession sess = request.getSession(); 
	      sess.setAttribute("oauth2Service", service);
	      PrintWriter out = response.getWriter();
	      out.println(service.getAuthorizationUrl(null));
	      response.sendRedirect(service.getAuthorizationUrl(null)); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
