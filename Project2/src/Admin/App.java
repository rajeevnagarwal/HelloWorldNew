package Admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.RequestDispatcher;
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
 * Servlet implementation class App
 */
@WebServlet("/App")
public class App extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public App() {
        super();
        // TODO Auto-generated constructor stub
    }
    /*private static final String CLIENT_ID = "976506589119-dss2gnoon1jlusvh5tfsgrqiida4o93f.apps.googleusercontent.com"; 
	private static final String CLIENT_SECRET = "39fUV77SH_boSQ4alzxhSEvV";*/
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	      Integer n=null;
	      	String Path = getServletContext().getRealPath("/enrollid.txt.txt");
	      	File f = new File(Path);
			BufferedReader b=new BufferedReader(new FileReader(f));
			n=Integer.parseInt(b.readLine());
			b.close();
			request.setAttribute("id", n);
			BufferedWriter w=new BufferedWriter(new FileWriter(f));
			w.write(""+(++n));
			w.close();
	      
	      
		
		/*RequestDispatcher rd=request.getRequestDispatcher("https://accounts.google.com/o/oauth2/auth?scope=email%20profile&redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=code&client_id=609718991740-p6cj3id7ifu43b046eth5edjac7uvo4g.apps.googleusercontent.com");
		rd.forward(request, response);
		*/
		
		RequestDispatcher rdd=request.getRequestDispatcher("./ApplicantEnd.jsp");
		rdd.forward(request, response);
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String Path = getServletContext().getRealPath("/enrollid.txt.txt");
		File f = new File(Path);
		BufferedReader b=new BufferedReader(new FileReader(f));
		int n=Integer.parseInt(b.readLine());
		b.close();
		String enroll=""+(n-1);
		request.setAttribute("id", enroll);
		String addrcorres=request.getParameter("addrcorres");
		String mobile=request.getParameter("mobile");
		String phdstream=request.getParameter("radio");
		String prefarea1=request.getParameter("prefarea1");
		String prefarea2=request.getParameter("prefarea2");
		String prefarea3=request.getParameter("prefarea3");
		String gender=request.getParameter("radiog");
		String cate=request.getParameter("radiocat");
		String pd=request.getParameter("radiopd");
		String dobe=request.getParameter("dob");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dob = LocalDate.parse(dobe,dtf);
		String cow=request.getParameter("cow");
		String father=request.getParameter("father");
		String nationality=request.getParameter("nationality");
		String peraddr=request.getParameter("peraddr");
		String pincode=request.getParameter("pincode");
		String tenthboard=request.getParameter("tenthboard");
		String tenthpercent=request.getParameter("tenthpercent");
		//System.out.println(tenthpercent);
		String yop10=request.getParameter("yop10");
		String twelthboard=request.getParameter("twelthboard");
		String twelthpercent=request.getParameter("twelthpercent");
		String yop12=request.getParameter("yop12");
		String degree=request.getParameter("degree");
		String dept=request.getParameter("dept");
		String college=request.getParameter("college");
		String univ=request.getParameter("univ");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String yog=request.getParameter("yog");
		
		String appece=request.getParameter("appece");
		String gradpercs=request.getParameter("gradpercs");
		String cgpascale1=request.getParameter("cgpascale1");
		String prefece1 = null,prefece2=null,prefece3=null,prefece4=null;
		Integer gperc;
		String gradperc=null;
		if(gradpercs.equals("cgpa"))
		{
			gradperc=request.getParameter("gradpercg");
			if(cgpascale1.equals("4"))
			{
				gperc=Integer.parseInt(gradperc);
				gperc/=25;
				gradperc=""+gperc;
			}
			if(cgpascale1.equals("10"))
			{
				gperc=Integer.parseInt(gradpercs);
				gperc/=10;
				gradperc=""+gperc;
			}
		}
		else
		{
			gradperc=request.getParameter("gradpercm");
		}
		if(appece!=null)
		{
			prefece1=request.getParameter("prefece1");
			prefece2=request.getParameter("prefece2");
			prefece3=request.getParameter("prefece3");
			prefece4=request.getParameter("prefece4");
		}
		String postg=request.getParameter("postg");
		String collegepg=null,citypg=null,statepg=null,deptpg = null,degpg = null,thesispg=null,yoppg=null,gradpercpg=null;
		if(postg!=null)
		{
			collegepg=request.getParameter("collegepg");
			citypg=request.getParameter("citypg");
			statepg=request.getParameter("statepg");
			deptpg=request.getParameter("deptpg");
			degpg=request.getParameter("degpg");
			thesispg=request.getParameter("thesispg");
			yoppg=request.getParameter("yoppg");
			gradpercpg=request.getParameter("gradpercpg");
		}
		String acaddeg=request.getParameter("acaddeg");
		String examacad = null,subjectacad=null,yearacad=null,scoreacad=null,rankacad=null;
		if(acaddeg!=null)
		{
			examacad=request.getParameter("examacad");
			subjectacad=request.getParameter("subjectacad");
			yearacad=request.getParameter("yearacad");
			scoreacad=request.getParameter("scoreacad");
			rankacad=request.getParameter("rankacad");
		}
		String gate=request.getParameter("gate");
		String areagate=null,yoggate=null,marksgate=null,scoregate=null,rankgate=null;
		if(gate!=null)
		{
			areagate=request.getParameter("areagate");
			yoggate=request.getParameter("yoggate");
			marksgate=request.getParameter("marksgate");
			scoregate=request.getParameter("scoregate");
			rankgate=request.getParameter("rankgate");
		}
		else
		{
			scoregate="0";
		}
		String pgradpercs=null;
		String pcgpascale1 = null;
		int pgperc;
		if(gradpercpg!=null)
		{
			
			if(pcgpascale1.equals("4"))
			{
				pgperc=Integer.parseInt(gradpercpg);
				pgperc/=25;
				pgradpercs=""+pgperc;
			}
			if(pcgpascale1.equals("10"))
			{
				pgperc=Integer.parseInt(gradpercs);
				pgperc/=10;
				pgradpercs=""+pgperc;
			}
		}
		else
		{
			gradpercpg="0";
		}
		String achievements=request.getParameter("achievements");
		String filecv=request.getParameter("cv");
		String filesop=request.getParameter("sop");
		System.out.println(filecv);
		String ln;
		 BufferedReader read=null;
		 BufferedWriter wrt=null;
		 try {
		Path = getServletContext().getRealPath("/"+filecv);
		f = new File(Path);
		read=new BufferedReader(new FileReader(f));
		try {
		Path = getServletContext().getRealPath("/CV"+enroll+".txt");
		f = new File(Path);
		wrt=new BufferedWriter(new FileWriter(f));
		} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
		}
		try {
		while((ln=read.readLine())!=null)
		{
		//System.out.println(ln);
		wrt.write(ln+"\n");
		}
		wrt.close();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		 String lnn;
		 BufferedReader readn=null;
		 BufferedWriter wrtn=null;
		 try {
		Path = getServletContext().getRealPath("/"+filesop);
		f = new File(Path);
		readn=new BufferedReader(new FileReader(f));
		try {
		Path = getServletContext().getRealPath("/SOP"+enroll+".txt");
		f = new File(Path);
		wrtn=new BufferedWriter(new FileWriter(f));
		} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
		}
		try {
		while((lnn=readn.readLine())!=null)
		{
		//System.out.println(ln);
		wrtn.write(lnn+"\n");
		}
		wrtn.close();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		//PhD phd=new PhD(email,name,enroll,cate,gender,pd,dobe,)
		String user = (String) request.getSession().getAttribute("email");
		AdminPhD obj=new AdminPhD(user,email ,name ,enroll,cate,gender,pd,dob,phdstream,degree ,degpg ,tenthboard,twelthboard,dept ,deptpg ,univ ,collegepg ,state,statepg,tenthpercent ,twelthpercent ,gradperc,gradpercpg,scoregate ,(LocalDate.now()));
		AdminPhD obj1 = null;
		Path = getServletContext().getRealPath("/PHD.txt");
		f=new File(Path);
		if(f.exists()){
		ObjectInputStream t=new ObjectInputStream(new FileInputStream(f));
		ArrayList<AdminPhD> objlist=new ArrayList<AdminPhD>();
		n=0;
		try {
			n=0;
		while(true){
			obj1 = (AdminPhD)t.readObject();
			objlist.add(obj1);
			n++;
			}
			}catch(EOFException e)
			{
			System.out.println("End of file reached "+n);
			
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
		objlist.add(obj);
		t.close();
		try {
	    	ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream(f));
	    	int y=0;
	    	while(y<n)
	    	{
		s.writeObject(objlist.get(y));
		y++;
	    	}
	    	s.close();
		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		PrintWriter app=null;
		try {
					Path = getServletContext().getRealPath("/File"+enroll+".txt");
					f = new File(Path);
					app=new PrintWriter(new FileOutputStream(f));
					app.write("Email ID: "+email);
					app.write("\nName: "+name);
					app.write("\nEnrollment Id: "+enroll);
					app.write("\nAddress of Correspondence: "+addrcorres);
					app.write("\nMobile: "+mobile);
					app.write("\nPhD Stream: "+phdstream);
					app.write("\nPhD Area Preference1: "+prefarea1);
					app.write("\nPhD Area Preference2: "+prefarea2);
					app.write("\nPhD Area Preference3: "+prefarea3);
					app.write("\nGender: "+gender);
					app.write("\nCategory: "+cate);
					app.write("\nPhysically Disabled: "+pd);
					app.write("\nDate of Birth: "+dobe);
					app.write("\nChildren of War: "+cow);
					app.write("\nFather's Name: "+father);
					app.write("\nNationality: "+nationality);
					app.write("\nPermanent Address: "+peraddr);
					app.write("\nPinCode: "+pincode);
					app.write("\nXth Board: "+tenthboard);
					app.write("\nXth Marks Percentage: "+tenthpercent);
					app.write("\nYear of Passing Xth: "+yop10);
					app.write("\nXIIth Board: "+twelthboard);
					app.write("\nXIIth Board: "+twelthboard);
					app.write("\nXIIth Marks Percentage: "+twelthpercent);
					app.write("\nYear of Passing XIIth: "+yop12);
					app.write("\nDegree: "+degree);
					app.write("\nDepartment: "+dept);
					app.write("\nCollege: "+college);
					app.write("\nUniversity: "+univ);
					app.write("\nCity: "+city);
					app.write("\nState: "+state);
					app.write("\nYear of Graduating: "+yog);
					app.write("\nGraduation Percentage: "+gradpercpg);
					if(appece!=null)
					{
						app.write("\n--------APPLYING FOR ECE--------\n");
						app.write("\nPreference1: "+prefece1);
						app.write("\nPreference2: "+prefece2);
						app.write("\nPreference3: "+prefece3);
						app.write("\nPreference4: "+prefece4);
					}
					if(postg!=null){
						app.write("\n---------POSTGRADUATION--------\n");
					app.write("\nCollege of Postgraduation: "+collegepg);
					app.write("\nCity of Postgraduation: "+citypg);
					app.write("\nState of Postgraduatoin: "+statepg);
					app.write("\nDepartment of Postgraduation: "+deptpg);
					app.write("\nDegree: "+degpg);
					app.write("\nThesis Title: "+thesispg);
					app.write("\nYear of Postgraduation: "+yoppg);
					app.write("\nPostgraduation Percentage: "+gradpercpg);
					}
					if(acaddeg!=null)
					{
						app.write("\n---------ACADEMICS--------\n");
						app.write("\nExam Name: "+examacad);
						app.write("\nSubject: "+subjectacad);
						app.write("\nYear: "+yearacad);
						app.write("\nScore: "+scoreacad);
						app.write("\nRank: "+rankacad);
					}
					if(gate!=null)
					{
						app.write("\n---------GATE--------\n");
						app.write("\nArea: "+areagate);
						app.write("\nYear of Graduation: "+yoggate);
						app.write("\nMarks: "+marksgate);
						app.write("\nScore: "+scoregate);
						app.write("\nRank: "+rankgate);
					}
					app.write("\nAchievements: "+achievements);
					app.close();
					//app.write("\nXth Board: "+tenthboard.getValue());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	}
		else
		{
			BufferedWriter app=null;
			Path = getServletContext().getRealPath("/PHD.txt");
			f = new File(Path);
			ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream(f));
			s.writeObject(obj);
			s.close();
			try {
						Path = getServletContext().getRealPath("/File"+enroll+".txt");
						app=new BufferedWriter(new FileWriter(Path));
			    		 System.out.println("Created\n");
						app.write("Email ID: "+email);
						app.write("\nName: "+name);
						app.write("\nEnrollment Id: PhD"+enroll);
						app.write("\nAddress of Correspondence: "+addrcorres);
						app.write("\nMobile: "+mobile);
						app.write("\nPhD Stream: "+phdstream);
						app.write("\nPhD Area Preference1: "+prefarea1);
						app.write("\nPhD Area Preference2: "+prefarea2);
						app.write("\nPhD Area Preference3: "+prefarea3);
						app.write("\nGender: "+gender);
						app.write("\nCategory: "+cate);
						app.write("\nPhysically Disabled: "+pd);
						app.write("\nDate of Birth: "+dobe);
						app.write("\nChildren of War: "+cow);
						app.write("\nFather's Name: "+father);
						app.write("\nNationality: "+nationality);
						app.write("\nPermanent Address: "+peraddr);
						app.write("\nPinCode: "+pincode);
						app.write("\nXth Board: "+tenthboard);
						app.write("\nXth Marks Percentage: "+tenthpercent);
						app.write("\nYear of Passing Xth: "+yop10);
						app.write("\nXIIth Board: "+twelthboard);
						app.write("\nXIIth Board: "+twelthboard);
						app.write("\nXIIth Marks Percentage: "+twelthpercent);
						app.write("\nYear of Passing XIIth: "+yop12);
						app.write("\nDegree: "+degree);
						app.write("\nDepartment: "+dept);
						app.write("\nCollege: "+college);
						app.write("\nUniversity: "+univ);
						app.write("\nCity: "+city);
						app.write("\nState: "+state);
						app.write("\nYear of Graduating: "+yog);
						app.write("\nGraduation Percentage: "+gradperc);
						if(appece!=null)
						{
							app.write("\n--------APPLYING FOR ECE--------\n");
							app.write("\nPreference1: "+prefece1);
							app.write("\nPreference2: "+prefece2);
							app.write("\nPreference3: "+prefece3);
							app.write("\nPreference4: "+prefece4);
						}
						if(postg!=null){
							app.write("\n---------POSTGRADUATION--------\n");
						app.write("\nCollege of Postgraduation: "+collegepg);
						app.write("\nCity of Postgraduation: "+citypg);
						app.write("\nState of Postgraduatoin: "+statepg);
						app.write("\nDepartment of Postgraduation: "+deptpg);
						app.write("\nDegree: "+degpg);
						app.write("\nThesis Title: "+thesispg);
						app.write("\nYear of Postgraduation: "+yoppg);
						app.write("\nPostgraduation Percentage: "+gradpercs);
						}
						if(acaddeg!=null)
						{
							app.write("\n---------ACADEMICS--------\n");
							app.write("\nExam Name: "+examacad);
							app.write("\nSubject: "+subjectacad);
							app.write("\nYear: "+yearacad);
							app.write("\nScore: "+scoreacad);
							app.write("\nRank: "+rankacad);
						}
						if(gate!=null)
						{
							app.write("\n---------GATE--------\n");
							app.write("\nArea: "+areagate);
							app.write("\nYear of Graduation: "+yoggate);
							app.write("\nMarks: "+marksgate);
							app.write("\nScore: "+scoregate);
							app.write("\nRank: "+rankgate);
						}
						app.write("\nAchievements: "+achievements);
						app.close();
						//app.write("\nXth Board: "+tenthboard.getValue());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		}
		RequestDispatcher rdd=request.getRequestDispatcher("./thanks.jsp");
		rdd.forward(request, response);
	}
	
		    	//b=new BufferedWriter(new FileWriter())
}


