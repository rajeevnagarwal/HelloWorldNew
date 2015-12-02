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

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private static final String CLIENT_ID = "976506589119-dss2gnoon1jlusvh5tfsgrqiida4o93f.apps.googleusercontent.com"; 
	private static final String CLIENT_SECRET = "39fUV77SH_boSQ4alzxhSEvV";
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServiceBuilder builder= new ServiceBuilder(); 
	      OAuthService service = builder.provider(Google2Api.class) 
	         .apiKey(CLIENT_ID) 
	         .apiSecret(CLIENT_SECRET) 
	         .callback("http://localhost:8080/Project2/AdminController") 
	         .scope("openid profile email " + 
	               "https://www.googleapis.com/auth/plus.login " + 
	               "https://www.googleapis.com/auth/plus.me")  
	         .debug()
	         .build();
	      HttpSession sess = request.getSession(); 
	      sess.setAttribute("oauth2Service", service);
	      PrintWriter out = response.getWriter();
	      out.println(service.getAuthorizationUrl(null));
	      response.sendRedirect(service.getAuthorizationUrl(null)); 
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
