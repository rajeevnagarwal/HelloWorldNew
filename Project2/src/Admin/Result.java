package Admin;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Result
 */
@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Result() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sess = request.getSession();
		PrintWriter out = response.getWriter();
		ArrayList<AdminPhD> list = (ArrayList<AdminPhD>) sess.getAttribute("list");
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
			System.out.println(list.get(i).getenroll());
			String en = list.get(i).getenroll();
			out.append("<TD>"+"<input type=\"Submit\"value=\"Information\"name=\"info"+en+"\"/>"+"<input type=\"submit\"value=\"Your CV\"name=\"cv"+en+"\"/>"+"<input type=\"submit\"value=\"Your SOP\"name=\"sop"+en+"\"/>"+"</TD>");
			out.append("</TR>");
		}
		out.append("</TABLE>");
		out.append("</FORM>");
		out.append("</BODY></HTML>");
		for(int i=0;i<list.size();i++)
		{
			String en = list.get(i).getenroll();
			String info = request.getParameter("info"+en);
			System.out.println(info);
			String cv = request.getParameter("cv"+en);
			String sop = request.getParameter("sop"+en);
			if(info!=null)
			{
				String path = getServletContext().getRealPath("/File"+en+".txt");
				File f1 = new File(path);
				if(f1.exists())
				{
					Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+f1);
				}
			}
			if(cv!=null)
			{
				String path1 = getServletContext().getRealPath("/CV"+en+".txt");
				File f2 = new File(path1);
				if(f2.exists())
				{
					Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+f2);
				}
				
			}
			if(sop!=null)
			{
				String path2 = getServletContext().getRealPath("/SOP"+en+".txt");
				File f3 = new File(path2);
				if(f3.exists())
				{
					Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+f3);
				}
			}
	
			
		}
		
		
	}

}
