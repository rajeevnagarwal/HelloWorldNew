package Admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.servlet.AsyncContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;

/**
 * Servlet implementation class AdminController
 */
@WebServlet(urlPatterns={"/AdminController"}, asyncSupported=true)
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ArrayList<AdminPhD> list = new ArrayList<AdminPhD>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AsyncContext ctx = request.startAsync(); 
	      ctx.start(new GetUserInfo(request, response,ctx)); 
	    HttpSession session = request.getSession();
	    String email = (String) (session.getAttribute("email"));
	    System.out.println(email);
	    if(email.equalsIgnoreCase("rajeev14084@iiitd.ac.in"))
	    {
	    	System.out.println(email+"hello");
	    	RequestDispatcher rd = request.getRequestDispatcher("AdminEnd.html");
	    	rd.forward(request,response);
	    }
	    else
	    {
	    
	    String path = getServletContext().getRealPath("/Users.txt");
	    System.out.println(path);
	    File f1 = new File(path);
	    File f2 = new File(path);
	    BufferedWriter f = new BufferedWriter(new FileWriter(f1,true));
	    BufferedReader file = new BufferedReader((new FileReader(f2)));
	    String mail;
	    int flag=0;
	    while((mail=file.readLine())!=null)
	    {
	    	System.out.println(mail);
	    	if(email.equalsIgnoreCase(mail))
	    	{
	    		
	    		flag=1;
	    		break;
	    	}
	    }
	    file.close();
	    if(flag==0)
	    {
	    	f.append(email);
	    	f.close();
	    	RequestDispatcher rd = request.getRequestDispatcher("App");
	    	rd.forward(request,response);
	    	
	    	
	    }
	    else if(flag==1)
	    {
	    	RequestDispatcher rd = request.getRequestDispatcher("App");
	    	rd.forward(request,response);
	    }
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		list.clear();
		PrintWriter out = response.getWriter();
		Integer flag = 0;
		String email = request.getParameter("texte");
		System.out.println(email);
		if(!email.equals(""))
				flag++;
		String name = request.getParameter("textname");
		if(!name.equals(""))
			flag++;
		String enroll = request.getParameter("textenroll");
		if(!enroll.equals(""))
			flag++;
		String cat = request.getParameter("chcat");
		if(!cat.equals(""))
			flag++;
		String gen = request.getParameter("gender");
		if(gen!=(null))
			flag++;
		String pd = request.getParameter("pd");
		if(pd!=null)
			flag++;
		String dob = request.getParameter("dob");
		if(!dob.equals(""))
			flag++;
		String on = request.getParameter("on");
		if(on!=null)
			flag++;
		String before = request.getParameter("before");
		if(before!=null)
			flag++;
		String after = request.getParameter("after");
		if(after!=null)
			flag++;
		String phstream = request.getParameter("phstream");
		if(!phstream.equals(""))
			flag++;
		String chgd = request.getParameter("chgd");
		if(!chgd.equals(""))
			flag++;
		String chpgd = request.getParameter("chpgd");
		if(!chpgd.equals(""))
			flag++;
		String chxb = request.getParameter("chxb");
		if(!chxb.equals(""))
			flag++;
		String chxiib = request.getParameter("chxiib");
		if(!chxiib.equals(""))
			flag++;
		String chdepg = request.getParameter("chdepg");
		if(!chdepg.equals(""))
			flag++;
		String chpgdep = request.getParameter("chpgdep");
		if(!chpgdep.equals(""))
			flag++;
		String univg = request.getParameter("univg");
		if(!univg.equals(""))
			flag++;
		String univpg = request.getParameter("univpg");
		if(!univpg.equals(""))
			flag++;
		String chstg = request.getParameter("chstg");
		if(!chstg.equals(""))
			flag++;
		String chstpg = request.getParameter("chstpg");
		if(!chstpg.equals(""))
			flag++;
		String g1 = request.getParameter("g1");
		if(g1!=null)
			flag++;
		String g2 = request.getParameter("g2");
		if(g2!=null)
			flag++;
		String g3 = request.getParameter("g3");
		if(g3!=null)
			flag++;
		String g4 = request.getParameter("g4");
		if(g4!=null)
			flag++;
		String g5 = request.getParameter("g5");
		if(g5!=null)
			flag++;
		String l1 = request.getParameter("l1");
		if(l1!=null)
			flag++;
		String l2 = request.getParameter("l2");
		if(l2!=null)
			flag++;
		String l3 = request.getParameter("l3");
		if(l3!=null)
			flag++;
		String l4 = request.getParameter("l4");
		if(l4!=null)
			flag++;
		String l5 = request.getParameter("l5");
		if(l5!=null)
			flag++;
		String e1 = request.getParameter("e1");
		if(e1!=null)
			flag++;
		String e2 = request.getParameter("e2");
		if(e2!=null)
			flag++;
		String e3 = request.getParameter("e3");
		if(e3!=null)
			flag++;
		String e4 = request.getParameter("e4");
		if(e4!=null)
			flag++;
		String e5 = request.getParameter("e5");
		if(e5!=null)
			flag++;
		String t1 = request.getParameter("t1");
		if(!t1.equals(""))
			flag++;
		String t2 = request.getParameter("t2");
		if(!t2.equals(""))
			flag++;
		String t3 = request.getParameter("t3");
		if(!t3.equals(""))
			flag++;
		String t4 = request.getParameter("t4");
		if(!t4.equals(""))
			flag++;
		String t5 = request.getParameter("t5");
		if(!t5.equals(""))
			flag++;
		String from = request.getParameter("from");
		if(!from.equals(""))
			flag++;
		String to = request.getParameter("upto");
		if(!to.equals(""))
			flag++;
		//System.out.println(flag);
		if(flag==0)
		{
			
		}
		else
		{
			AdminPhD obj;
			ObjectInputStream file = null;
			try
			{
			String path = getServletContext().getRealPath("/PHD.txt");
			file = new ObjectInputStream(new FileInputStream(path));
			while(true)
			{
					int flag1 = flag;
					obj = (AdminPhD) file.readObject();
				if(!email.equals(""))
				{
					if(email.equalsIgnoreCase(obj.getemail()))
						flag1--;
				}
				if(!name.equals(""))
				{
					if(name.equalsIgnoreCase(obj.getname()))
						flag1--;
				}
				if(!enroll.equals(""))
				{
					
					if(enroll.equalsIgnoreCase(obj.getenroll()))
						flag1--;
				}
				if(!cat.equals(""))
				{
					
					if(cat.equalsIgnoreCase(obj.getcategory()))
						flag1--;
				}
				if(gen!=null)
				{
					
					if(gen.equalsIgnoreCase(obj.getgender()))
						flag1--;
				}
				if(pd!=null)
				{
					if(pd.equalsIgnoreCase("yes")&&obj.isDisabled()==true)
						flag1--;
					else if(pd.equalsIgnoreCase("no")&&obj.isDisabled()==false)
						flag1--;
				}
				if(!dob.equals(""))
				{
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
					LocalDate dt = LocalDate.parse(dob);
					if(on!=null||before!=null||after!=null)
					{
						
						if(on!=null&&before!=null&&after!=null)
						{
							
							if(dt.isBefore(obj.getdob())&&dt.isAfter(obj.getdob())&&dt.isEqual((obj.getdob())))
								flag1=flag1-4;
						}
						else if(on!=null&&before!=null&&after==null)
						{
							
							if(dt.isEqual(obj.getdob())&&dt.isAfter((obj.getdob())))
							flag1=flag1-3;
						}
						else if(on!=null&&before==null&&after!=null)
						{
							
							if(dt.isEqual(obj.getdob())&&dt.isBefore((obj.getdob())))
							flag1=flag1-3;
						}
						else if(on==null&&before!=null&&after!=null)
						{
							
							if(dt.isAfter(obj.getdob())&&dt.isBefore((obj.getdob())))
							flag1=flag1-3;
						}
						else if(on!=null&&before==null&&after==null)
						{
							
							if(dt.isEqual(obj.getdob()))
							flag1=flag1-2;
						}
						else if(on==null&&before==null&&after!=null)
						{
							
							if(dt.isBefore(obj.getdob()))
							flag1=flag1-2;
						}
						else if(on==null&&before!=null&&after==null)
						{
							if(dt.isAfter(obj.getdob()))
							flag1=flag1-2;
						}
					}
				}
				if(!phstream.equals(""))
				{
					
					if(phstream.equalsIgnoreCase(obj.getpstream()))
					flag1--;
				}
				if(!chgd.equals(""))
				{
					
					if(chgd.equalsIgnoreCase(obj.getgstream()))
					flag1--;
				}
				if(!chpgd.equals(""))
				{
					
					if(chpgd.equalsIgnoreCase(obj.getpgsstream()))
					flag1--;
				}
				if(!chxb.equals(""))
				{
					
					if(chxb.equalsIgnoreCase(obj.getxboard()))
					flag1--;
				}
				if(!chxiib.equals(""))
				{
					
					if(chxiib.equalsIgnoreCase(obj.getxiiboard()))
					flag1--;
				}
				if(!chdepg.equals(""))
				{
					
					if(chdepg.equalsIgnoreCase(obj.getdepgrad()))
					flag1--;
				}
				if(!chpgdep.equals(""))
				{
					
					if(chpgdep.equalsIgnoreCase(obj.getdeppgrad()))
					flag1--;
				}
				if(!univg.equals(""))
				{
					
					if(univg.equalsIgnoreCase(obj.getunigrad()))
					flag1--;
				}
				if(!univpg.equals(""))
				{
					
					if(univpg.equalsIgnoreCase(obj.getunipgrad()))
					flag1--;
				}
				if(!chstg.equals(""))
				{
					
					if(chstg.equalsIgnoreCase(obj.getstgrad()))
					flag1--;
				}
				if(!chstpg.equals(""))
				{
					if(chstpg.equalsIgnoreCase(obj.getstpgrad()))
					flag1--;
				}
				if(!t1.equals(""))
				{
					
					int a1 = Integer.parseInt(t1);
					if(g1!=null||e1!=null||l1!=null)
					{
						
						if(g1!=null&&e1!=null&&l1!=null)
						{
							out.println(g1+e1+l1);
							if(a1>=obj.getxperc()&&a1<=obj.getxperc())
							flag1=flag1-4;
						}
						else if(g1!=null&&e1!=null&&l1==null)
						{
							
							if(a1>=obj.getxperc())
							flag1=flag1-3;
						}
						else if(g1!=null&&e1==null&&l1!=null)
						{
							
							if(a1>obj.getxperc()&&a1<obj.getxperc())
							flag1=flag1-3;
						}
						else if(g1==null&&e1!=null&&l1!=null)
						{
							
							if(a1<=obj.getxperc())
							flag1=flag1-3;
						}
						else if(g1!=null&&e1==null&&l1==null)
						{
							
							if(a1>obj.getxperc())
							flag1=flag1-2;
						}
						else if(g1==null&&e1!=null&&l1==null)
						{
							
							if(a1==obj.getxperc())
							flag1=flag1-2;
						}
						else if(g1==null&&e1==null&&l1!=null)
						{
							
							if(a1<obj.getxperc())
							flag1=flag1-2;
						}
					}
					
				}
				if(!t2.equals(""))
				{
					
					int a2 = Integer.parseInt(t2);
					if(g2!=null||e2!=null||l2!=null)
					{
						
						if(g2!=null&&e2!=null&&l2!=null)
						{
							
							if(a2>=obj.getxiiperc()&&a2<=obj.getxiiperc())
							flag1=flag1-4;
						}
						else if(g2!=null&&e2!=null&&l2==null)
						{
							
							if(a2>=obj.getxiiperc())
							flag1=flag1-3;
						}
						else if(g2!=null&&e2==null&&l2!=null)
						{
							
							if(a2>obj.getxiiperc()&&a2<obj.getxiiperc())
							flag1=flag1-3;
						}
						else if(g2==null&&e2!=null&&l2!=null)
						{
							
							if(a2<=obj.getxiiperc())
							flag1=flag1-3;
						}
						else if(g2!=null&&e2==null&&l2==null)
						{
							
							if(a2>obj.getxiiperc())
							flag1=flag1-2;
						}
						else if(g2==null&&e2!=null&&l2==null)
						{
							
							if(a2==obj.getxiiperc())
							flag1=flag1-2;
						}
						else if(g2==null&&e2==null&&l2!=null)
						{
							
							if(a2<obj.getxiiperc());
							flag1=flag1-2;
						}
					}
					
				}
				if(!t3.equals(""))
				{
					
					int a3 = Integer.parseInt(t3);
					if(g3!=null||e3!=null||l3!=null)
					{
						
						if(g3!=null&&e3!=null&&l3!=null)
						{
							
							if(a3>=obj.getgradperc()&&a3<=obj.getgradperc())
							flag1=flag1-4;
						}
						else if(g3!=null&&e3!=null&&l3==null)
						{
							
							if(a3>=obj.getgradperc())
							flag1=flag1-3;
						}
						else if(g3!=null&&e3==null&&l3!=null)
						{
							
							if(a3>obj.getgradperc()&&a3<obj.getgradperc())
							flag1=flag1-3;
						}
						else if(g3==null&&e3!=null&&l3!=null)
						{
							
							if(a3<=obj.getgradperc())
							flag1=flag1-3;
						}
						else if(g3!=null&&e3==null&&l3==null)
						{
							
							if(a3>obj.getgradperc())
							flag1=flag1-2;
						}
						else if(g3==null&&e3!=null&&l3==null)
						{
							
							if(a3==obj.getgradperc())
							flag1=flag1-2;
						}
						else if(g3==null&&e3==null&&l3!=null)
						{
							
							if(a3<obj.getgradperc())
							flag1=flag1-2;
						}
					}
					
				}
				if(!t4.equals(""))
				{
					
					int a4 = Integer.parseInt(t4);
					if(g4!=null||e4!=null||l4!=null)
					{
						
						if(g4!=null&&e4!=null&&l4!=null)
						{
							if(a4>=obj.getgradpperc()&&a4<=obj.getgradpperc())
							flag1=flag1-4;
						}
						else if(g4!=null&&e4!=null&&l4==null)
						{
							
							if(a4>=obj.getgradpperc())
							flag1=flag1-3;
						}
						else if(g4!=null&&e4==null&&l4!=null)
						{
							
							if(a4>obj.getgradpperc()&&a4<obj.getgradpperc())
							flag1=flag1-3;
						}
						else if(g4==null&&e4!=null&&l4!=null)
						{
							
							if(a4<=obj.getgradpperc())
							flag=flag1-3;
						}
						else if(g4!=null&&e4==null&&l4==null)
						{
							
							if(a4>obj.getgradpperc())
							flag1=flag1-2;
						}
						else if(g4==null&&e4!=null&&l4==null)
						{
							
							if(a4==obj.getgradpperc())
							flag1=flag1-2;
						}
						else if(g4==null&&e4==null&&l4!=null)
						{
							
							if(a4<obj.getgradpperc())
							flag1=flag1-2;
						}
					}
					
				}
				if(!t5.equals(""))
				{
					
					int a5 = Integer.parseInt(t5);
					if(g5!=null||e5!=null||l5!=null)
					{
						
						if(g5!=null&&e5!=null&&l5!=null)
						{
							
							if(a5>=obj.getgate()&&a5<=obj.getgate())
							flag1=flag1-4;
						}
						else if(g5!=null&&e5!=null&&l5==null)
						{
							
							if(a5>=obj.getgate())
							flag1=flag1-3;
						}
						else if(g5!=null&&e5==null&&l5!=null)
						{
							
							if(a5<obj.getgate()&&a5>obj.getgate())
							flag1=flag1-3;
						}
						else if(g5==null&&e5!=null&&l5!=null)
						{
							
							if(a5<=obj.getgate())
							flag1=flag1-3;
						}
						else if(g5!=null&&e5==null&&l5==null)
						{
							
							if(a5>obj.getgate())
							flag1=flag1-2;
						}
						else if(g5==null&&e5!=null&&l5==null)
						{
							
							if(a5==obj.getgate())
							flag1=flag1-2;
						}
						else if(g5==null&&e5==null&&l5!=null)
						{
							
							if(a5<obj.getgate())
							flag1=flag1-2;
						}
					}
					
				}
				if(!from.equals("")||!to.equals(""))
				{
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
					LocalDate dtfr = LocalDate.parse(from);
					LocalDate dtup = LocalDate.parse(to);
					if(from!=null&&to!=null)
					{
						
						if(obj.getapp().isAfter(dtfr)&&obj.getapp().isBefore(dtup))
							flag1=flag1-2;
					}
					else if(from!=null&&to==null)
					{
						
						if(obj.getapp().isAfter(dtfr))
							flag1--;
					}
					else if(from==null&&to!=null){
						
						if(obj.getapp().isBefore(dtup))
						flag1--;
						
					}
					
				}
				//System.out.println(flag1);
				if(flag1==0)
					{
					list.add(obj);
					}
				else
					continue;
			}
			
			}
			catch(EOFException ex)
			{
				System.out.println("End Reached");
			}
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			file.close();	
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(15);
			session.setAttribute("list", list);
			out.append("<HTML><HEAD><TITLE>Filtered Results</TITLE></HEAD><BODY>");
			out.append("<FORM method=\"post\"action=\"Result\">");
			out.append("<TABLE BORDER=\"2px\">");
			out.append("<TR>");
			out.append("<TD>Name</TD>");
			out.append("<TD>Enrollment ID</TD>");
			out.append("<TD>Link to Data</TD>");
			out.append("</TR>");
			for(int i=0;i<list.size();i++)
			{
				out.append("<TR>");
				out.append("<TD>"+list.get(i).getname()+"</TD>");
				out.append("<TD>"+list.get(i).getenroll()+"</TD>");
				String en = list.get(i).getenroll();
				out.append("<TD>"+"<input type=\"submit\"value=\"Information\"name=\"info"+en+"\"/>"+"<input type=\"submit\"value=\"Your CV\"name=\"cv"+en+"\"/>"+"<input type=\"submit\"value=\"Your SOP\"name=\"sop"+en+"\"/>"+"</TD>");
				out.append("</TR>");
			}
			out.append("</TABLE>");
			out.append("</FORM>");
			out.append("</BODY></HTML>");
			session.setAttribute("list", list);
			
			
		}
		
	}

}
class GetUserInfo implements Runnable { 
	   private HttpServletRequest req; 
	   private HttpServletResponse resp; 
	   private AsyncContext asyncCtx; 
	   public GetUserInfo(HttpServletRequest req, HttpServletResponse resp, AsyncContext asyncCtx) { 
	      this.req = req; 
	      this.resp = resp; 
	      this.asyncCtx = asyncCtx; 
	   }
	   @Override 
	   public void run() {  
	      HttpSession sess = req.getSession(true); 
	      sess.setMaxInactiveInterval(60);
	      OAuthService service = (OAuthService)sess.getAttribute("oauth2Service");	    
	      String code = req.getParameter("code");
	      Token token = service.getAccessToken(null, new Verifier(code)); 
	      sess.setAttribute("token", token);
	      try { 
	         req.login("fred", "fredfred"); 
	      } catch (ServletException e) { 
	         //Handle error - should not happen 
	      }
	      //Now do something with it - get the user's G+ profile 
	      OAuthRequest oReq = new OAuthRequest(Verb.GET, 
	            "https://www.googleapis.com/oauth2/v2/userinfo"); 
	      service.signRequest(token, oReq); 
	      Response oResp = oReq.send(); 

	      //Read the result 
	      
	      JsonReader reader = Json.createReader(new ByteArrayInputStream( 
	            oResp.getBody().getBytes())); 
	     JsonObject profile = reader.readObject(); 
	      //Save the user details somewhere or associate it with 
	      sess.setAttribute("email", profile.getString("email")); 
	      asyncCtx.complete(); 
	      
	      
	   } 
	}