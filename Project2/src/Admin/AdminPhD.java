package Admin;

import java.io.Serializable;
import java.time.LocalDate;

public class AdminPhD implements Serializable{
	private static final long serialVersionUID = 1L;
	private String username;
	private String email;
	private String name;
	private String enroll;
	private String category;
	private String gender;
	private Boolean Disabled;
	private LocalDate dob;
	private String PStream;
	private String GStream;
	private String PGStream;
	private String XBoard;
	private String XIIBoard;
	private String DepGrad;
	private String DepPGrad;
	private String UnivGrad;
	private String UnivPGrad;
	private String stGrad;
	private String stPGrad;
	private float XPerc;
	private float XIIPerc;
	private float GradPerc;
	private float PGradPerc;
	private int GATE;
	private LocalDate dateofapplication;

	public AdminPhD(String u,String e, String n, String en, String c, String g, String pd, String dobe, String PS, String GS,
			String PGS, String XB, String XIIB, String dp, String dpg, String ug, String upg, String st, String stp,
			String tenthpercent, String twelthpercent, String gradperc2, String pGradperc2, String scoregate,
			LocalDate f) {
		username = u;
		email = e;
		name = n;
		enroll = en;
		category = c;
		gender = g;
		if (pd.compareToIgnoreCase("Yes") == 0) {
			Disabled = true;
		} else {
			Disabled = false;
		}
		if (dobe.contains("#")) {
			dob = null;
		} else {
			dobe = dobe.replaceAll("/", "-");
			String[] sentence = dobe.split("-");
			String line;
			if (sentence[0].length() == 4) {

				if (sentence[1].length() == 1) {
					sentence[1] = "0" + sentence[1];
				}
				if (sentence[2].length() == 1) {
					sentence[2] = "0" + sentence[2];
				}
				line = sentence[0] + "-" + sentence[1] + "-" + sentence[2];
				dob = LocalDate.parse(line);
			} else if (sentence[0].length() != 4) {

				if (sentence[1].length() == 1) {
					sentence[1] = "0" + sentence[1];
				}
				if (sentence[0].length() == 1) {
					sentence[0] = "0" + sentence[0];
				}
				line = sentence[2] + "-" + sentence[1] + "-" + sentence[0];
				dob = LocalDate.parse(line);

			}

		}
		PStream = PS;
		GStream = GS;
		PGStream = PGS;
		XBoard = XB;
		XIIBoard = XIIB;
		DepGrad = dp;
		DepPGrad = dpg;
		if (ug.contains(" - ")) {
			ug = ug.replaceAll(" - ", "-");
		}
		UnivGrad = ug;
		if (upg.contains(" - ")) {
			upg = upg.replaceAll(" - ", "-");
		}
		UnivPGrad = upg;
		stGrad = st;
		stPGrad = stp;
		XPerc = Float.parseFloat(tenthpercent);
		XIIPerc = Float.parseFloat(twelthpercent);
		if (!gradperc2.equals("")) {
			if (gradperc2.contains(":")) {
				String[] sentence = gradperc2.split(":");
				GradPerc = Float.parseFloat(sentence[1]);
			} else {
				GradPerc = Float.parseFloat(gradperc2);
			}
		} else {
			GradPerc = 0;
		}
		if (!pGradperc2.equals("")) {
			if (pGradperc2.contains(":")) {
				String[] sentence = pGradperc2.split(":");
				PGradPerc = Float.parseFloat(sentence[1]);
			} else
				PGradPerc = Float.parseFloat(pGradperc2);
		} else {
			PGradPerc = 0;
		}
		GATE = Integer.parseInt(scoregate);
		dateofapplication = f;
		/*
		 * try { dateofapplication = ff.parse(f); } catch (ParseException e1) {
		 * // TODO Auto-generated catch block e1.printStackTrace(); }
		 */

	}

	public AdminPhD(String u,String e, String n, String en, String c, String g, String D, LocalDate d, String PS, String GS,
			String PGS, String XB, String XIIB, String dp, String dpg, String ug, String upg, String st, String stp,
			String xp, String x2p, String gp, String pgp, String gate, LocalDate dt) {
		username = u;
		email = e;
		name = n;
		enroll = en;
		category = c;
		gender = g;
		if (D.compareToIgnoreCase("Yes") == 0) {
			Disabled = true;
		} else {
			Disabled = false;
		}
		;
		dob = d;
		PStream = PS;
		GStream = GS;
		PGStream = PGS;
		XBoard = XB;
		XIIBoard = XIIB;
		DepGrad = dp;
		DepPGrad = dpg;
		UnivGrad = ug;
		UnivPGrad = upg;
		stGrad = st;
		stPGrad = stp;
		XPerc = Float.parseFloat(xp);
		XIIPerc = Float.parseFloat(x2p);
		GradPerc = Float.parseFloat(gp);
		PGradPerc = Float.parseFloat(pgp);
		GATE = Integer.parseInt(gate);
		dateofapplication = dt;
		// TODO Auto-generated constructor stub
	}

	public AdminPhD(String u,String e, String n, String en, String c, String g, String D, String d, String PS, String GS, String PGS,
			String XB, String XIIB, String dp, String dpg, String ug, String upg, String st, String stp, String xp,
			String x2p, String gp, String pgp, String gate, String dt) {
		username = u;
		email = e;
		name = n;
		enroll = en;
		category = c;
		gender = g;
		if (D.compareToIgnoreCase("Yes") == 0) {
			Disabled = true;
		} else {
			Disabled = false;
		}
		dob = LocalDate.parse(d);
		PStream = PS;
		GStream = GS;
		PGStream = PGS;
		XBoard = XB;
		XIIBoard = XIIB;
		DepGrad = dp;
		DepPGrad = dpg;
		UnivGrad = ug;
		UnivPGrad = upg;
		stGrad = st;
		stPGrad = stp;
		XPerc = Float.parseFloat(xp);
		XIIPerc = Float.parseFloat(x2p);
		GradPerc = Float.parseFloat(gp);
		PGradPerc = Float.parseFloat(pgp);
		GATE = Integer.parseInt(gate);
		dateofapplication = LocalDate.parse(dt);
		/*
		 * try { dateofapplication = f.parse(dt); } catch (ParseException e1) {
		 * // TODO Auto-generated catch block e1.printStackTrace(); }
		 */
		// TODO Auto-generated constructor stub
	}

	public String getusername()
	{
		return username;
	}
	public String getemail() {
		return email;
	}

	public String getname() {
		return name;
	}

	public String getenroll() {
		return enroll;
	}

	public String getcategory() {
		return category;
	}

	public String getgender() {
		return gender;
	}

	public Boolean isDisabled() {
		return Disabled;
	}

	public LocalDate getdob() {
		return dob;
	}

	public String getpstream() {
		return PStream;
	}

	public String getgstream() {
		return GStream;
	}

	public String getpgsstream() {
		return PGStream;
	}

	public String getxboard() {
		return XBoard;
	}

	public String getxiiboard() {
		return XIIBoard;
	}

	public String getdepgrad() {
		return DepGrad;
	}

	public String getdeppgrad() {
		return DepPGrad;
	}

	public String getunigrad() {
		return UnivGrad;
	}

	public String getunipgrad() {
		return UnivPGrad;
	}

	public String getstgrad() {
		return stGrad;
	}

	public String getstpgrad() {
		return stPGrad;
	}

	public float getxperc() {
		return XPerc;
	}

	public float getxiiperc() {
		return XIIPerc;
	}

	public float getgradperc() {
		return GradPerc;
	}

	public float getgradpperc() {
		return PGradPerc;
	}

	public int getgate() {
		return GATE;
	}
	public void setusername(String u)
	{
		username = u;
	}
	public void setemail(String e) {
		email = e;
	}

	public void setname(String n) {
		name = n;
	}

	public void setenroll(String en) {
		enroll = en;
	}

	public void setcategory(String cat) {
		category = cat;
	}

	public void setgender(String g) {
		gender = g;
	}

	public void setisDisabled(Boolean d) {
		Disabled = d;
	}

	public void setdob(LocalDate db) {
		dob = db;
	}

	public void setpstream(String pss) {
		PStream = pss;
	}

	public void setgstream(String gss) {
		GStream = gss;
	}

	public void setpgsstream(String pgss) {
		PGStream = pgss;
	}

	public void setxboard(String xb) {
		XBoard = xb;
	}

	public void setxiiboard(String xib) {
		XIIBoard = xib;
	}

	public void setdepgrad(String dgrad) {
		DepGrad = dgrad;
	}

	public void setdeppgrad(String dpgrad) {
		DepPGrad = dpgrad;
	}

	public void setunigrad(String ungrad) {
		UnivGrad = ungrad;
	}

	public void setunipgrad(String unpgrad) {
		UnivPGrad = unpgrad;
	}

	public void setstgrad(String stg) {
		stGrad = stg;
	}

	public void setstpgrad(String stpg) {
		stPGrad = stpg;
	}

	public void setxperc(float xp) {
		XPerc = xp;
	}

	public void setxiiperc(float xip) {
		XIIPerc = xip;
	}

	public void setgradperc(float gp) {
		GradPerc = gp;
	}

	public void setgradpperc(float gpp) {
		PGradPerc = gpp;
	}

	public void setgate(int gate) {
		GATE = gate;
	}

	public LocalDate getapp() {
		return dateofapplication;
	}

	public void setapp(LocalDate app) {
		dateofapplication = app;
	}

}
