package Admin;
/*
 * Rajeev Nagarwal
 * Roll No. 2014084
 * Harshit Verma
 * Roll No. 2014042
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class TestCase {
	public static ArrayList<String> email = new ArrayList<String>();
	public static ArrayList<String> name = new ArrayList<String>();
	public static ArrayList<String> address = new ArrayList<String>();
	public static ArrayList<String> mobile = new ArrayList<String>();
	public static ArrayList<String> phs = new ArrayList<String>();
	public static ArrayList<String> pha1 = new ArrayList<String>();
	public static ArrayList<String> pha2 = new ArrayList<String>();
	public static ArrayList<String> pha3 = new ArrayList<String>();
	public static ArrayList<String> gender = new ArrayList<String>();
	public static ArrayList<String> category = new ArrayList<String>();
	public static ArrayList<String> physical = new ArrayList<String>();
	public static ArrayList<String> dob = new ArrayList<String>();
	public static ArrayList<String> defense = new ArrayList<String>();
	public static ArrayList<String> father = new ArrayList<String>();
	public static ArrayList<String> nationality = new ArrayList<String>();
	public static ArrayList<String> permaadd = new ArrayList<String>();
	public static ArrayList<String> pincode = new ArrayList<String>();
	public static ArrayList<String> xb = new ArrayList<String>();
	public static ArrayList<String> xm = new ArrayList<String>();
	public static ArrayList<String> xp = new ArrayList<String>();
	public static ArrayList<String> xiib = new ArrayList<String>();
	public static ArrayList<String> xiim = new ArrayList<String>();
	public static ArrayList<String> xiip = new ArrayList<String>();
	public static ArrayList<String> graddeg = new ArrayList<String>();
	public static ArrayList<String> graddep = new ArrayList<String>();
	public static ArrayList<String> gradcol = new ArrayList<String>();
	public static ArrayList<String> graduniv = new ArrayList<String>();
	public static ArrayList<String> gradcity = new ArrayList<String>();
	public static ArrayList<String> gradstate = new ArrayList<String>();
	public static ArrayList<String> gradyear = new ArrayList<String>();
	public static ArrayList<String> gradmarks = new ArrayList<String>();
	public static ArrayList<String> eceAdminPhD = new ArrayList<String>();
	public static ArrayList<String> epha1 = new ArrayList<String>();
	public static ArrayList<String> epha2 = new ArrayList<String>();
	public static ArrayList<String> epha3 = new ArrayList<String>();
	public static ArrayList<String> epha4 = new ArrayList<String>();
	public static ArrayList<String> cmppgrad = new ArrayList<String>();
	public static ArrayList<String> pgraddeg = new ArrayList<String>();
	public static ArrayList<String> pgraddep = new ArrayList<String>();
	public static ArrayList<String> pgradcol = new ArrayList<String>();
	public static ArrayList<String> pgradth = new ArrayList<String>();
	public static ArrayList<String> pgradcity = new ArrayList<String>();
	public static ArrayList<String> pgradstate = new ArrayList<String>();
	public static ArrayList<String> pgradyear = new ArrayList<String>();
	public static ArrayList<String> pgradmarks = new ArrayList<String>();
	public static ArrayList<String> otherdeg = new ArrayList<String>();
	public static ArrayList<String> examname = new ArrayList<String>();
	public static ArrayList<String> subject = new ArrayList<String>();
	public static ArrayList<String> year = new ArrayList<String>();
	public static ArrayList<String> score = new ArrayList<String>();
	public static ArrayList<String> rank = new ArrayList<String>();
	public static ArrayList<String> tgate = new ArrayList<String>();
	public static ArrayList<String> gatearea = new ArrayList<String>();
	public static ArrayList<String> gateyear = new ArrayList<String>();
	public static ArrayList<String> gatemarks = new ArrayList<String>();
	public static ArrayList<String> gatescore = new ArrayList<String>();
	public static ArrayList<String> gaterank = new ArrayList<String>();
	public static ArrayList<String> achievement = new ArrayList<String>();
	public static ArrayList<String> timestamp = new ArrayList<String>();
	public static ArrayList<String> enrollid = new ArrayList<String>();
	public static ArrayList<String> list1  = new ArrayList<String>();
	public static ArrayList<String> list2  = new ArrayList<String>();
	public static ArrayList<String> list3  = new ArrayList<String>();
	public static ArrayList<String> list4  = new ArrayList<String>();
	public static ArrayList<String> list5  = new ArrayList<String>();
	static String emaile,namee,n,addrcorres,mobilee,AdminPhDstream,prefarea1,prefarea2,prefarea3,gendere,cate,pd,dobe,cow,fathere,nationalitye,peraddr,pincodee,tenthboard,tenthpercent,yop10,twelthboard,twelthpercent,yop12,degree,college,univ,city,state,yog,Gradperc,prefece1,prefece2,prefece3,prefece4,collegepg,citypg,dept,degpg,thesispg,statepg,yoppg,PGradperc,examacad,subjectacad,yearacad,scoreacad,rankacad,areagate,yoggate,marksgate,scoregate,rankgate,achievements,eceAdminPhDe,cmpAdminPhDe;
	public static LocalDate dt;
	public static ArrayList<AdminPhD> ap=new ArrayList<AdminPhD>();
	public static int k;
	public static HashMap<String,Integer> month = new HashMap<String,Integer>();
	static
	{
		BufferedReader in=null;
		try {
			in = new BufferedReader(new FileReader("./src/Data_to_Import_with;.csv"));
			
			String line;
			try {
				in.readLine();
				while((line=in.readLine())!=null)
				{
					String[] sentence = line.split("\"");
					permaadd.add(sentence[1]);
					String[] sen1 = sentence[0].split(",");
					String[] sen2 = sentence[2].split(",");
					email.add(sen1[0]);
					name.add(sen1[1]);
					address.add(sen1[2]);
					mobile.add(sen1[3]);
					phs.add(sen1[4]);
					pha1.add(sen1[5]);
					pha2.add(sen1[6]);
					pha3.add(sen1[7]);
					gender.add(sen1[8]);
					category.add(sen1[9]);
					physical.add(sen1[10]);
					dob.add(sen1[11]);
					defense.add(sen1[12]);
					father.add(sen1[13]);
					nationality.add(sen1[14]);
					pincode.add(sen2[1]);
					xb.add(sen2[2]);
					xm.add(sen2[3]);
					xp.add(sen2[4]);
					xiib.add(sen2[5]);
					xiim.add(sen2[6]);
					xiip.add(sen2[7]);
					graddeg.add(sen2[8]);
					graddep.add(sen2[9]);
					gradcol.add(sen2[10]);
					graduniv.add(sen2[11]);
					gradcity.add(sen2[12]);
					gradstate.add(sen2[13]);
					gradyear.add(sen2[14]);
					gradmarks.add(sen2[15]);
					eceAdminPhD.add(sen2[16]);
					epha1.add(sen2[17]);
					epha2.add(sen2[18]);
					epha3.add(sen2[19]);
					epha4.add(sen2[20]);
					cmppgrad.add(sen2[21]);
					pgraddeg.add(sen2[22]);
					pgraddep.add(sen2[23]);
					pgradcol.add(sen2[24]);
					pgradth.add(sen2[25]);
					pgradcity.add(sen2[26]);
					pgradstate.add(sen2[27]);
					pgradyear.add(sen2[28]);
					pgradmarks.add(sen2[29]);
					otherdeg.add(sen2[30]);
					examname.add(sen2[31]);
					subject.add(sen2[32]);
					year.add(sen2[33]);
					score.add(sen2[34]);
					rank.add(sen2[35]);
					tgate.add(sen2[36]);
					gatearea.add(sen2[37]);
					gateyear.add(sen2[38]);
					gatemarks.add(sen2[39]);
					gatescore.add(sen2[40]);
					gaterank.add(sen2[41]);
					achievement.add(sen2[42]);
					timestamp.add(sen2[43]);
					sen2[44] = sen2[44].substring(3);
					enrollid.add(sen2[44]);
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		month.put("Jan",1);
		month.put("Feb",2);
		month.put("Mar",3);
		month.put("Apr",4);
		month.put("May",5);
		month.put("Jun",6);
		month.put("Jul",7);
		month.put("Aug",8);
		month.put("Sep",9);
		month.put("Oct",10);
		month.put("Nov",11);
		month.put("Dec",12);		
	}
public static void main(String[] args) {
		
		
		
		for(k=0;k<email.size();k++)
		{
			AdminPhD obj=null;
			emaile=email.get(k);
			namee=name.get(k);
			addrcorres=address.get(k);
			mobilee=mobile.get(k);
			AdminPhDstream=phs.get(k);
			prefarea1=pha1.get(k);
			prefarea2=pha2.get(k);
			prefarea3=pha3.get(k);
			gendere = gender.get(k);
			cate=category.get(k);
			pd=physical.get(k);
			dobe=dob.get(k);// = new ArrayList<String>();
			//public ArrayList<String> gender = new ArrayList<String>();
			
			//public ArrayList<String> defense = new ArrayList<String>();
			fathere=father.get(k);
			//public ArrayList<String> father = new ArrayList<String>();
			nationalitye=nationality.get(k);
			//public ArrayList<String> nationality = new ArrayList<String>();
			peraddr=permaadd.get(k);
			//public ArrayList<String> permaadd = new ArrayList<String>();
			pincodee=pincode.get(k);
			//public ArrayList<String> pincode = new ArrayList<String>();
			tenthboard=xb.get(k);
			
			//public ArrayList<String> xb = new ArrayList<String>();
			tenthpercent=xm.get(k);
			//public ArrayList<String> xm = new ArrayList<String>();
			yop10=xp.get(k);
			//public ArrayList<String> xp = new ArrayList<String>();
			twelthboard=xiib.get(k);
			//public ArrayList<String> xiib = new ArrayList<String>();
			twelthpercent=xiim.get(k);
			yop12=xiip.get(k);
			//public ArrayList<String> xiim = new ArrayList<String>();
			//public ArrayList<String> xiip = new ArrayList<String>();
			degree=graddeg.get(k);
			//public ArrayList<String> graddeg = new ArrayList<String>();
			dept=graddep.get(k);
			//public ArrayList<Str//ing> graddep = new ArrayList<String>();
			college=gradcol.get(k);
			//public ArrayList<String> gradcol = new ArrayList<String>();
			univ=graduniv.get(k);
			//public ArrayList<String> graduniv = new ArrayList<String>();
			city=gradcity.get(k);
			//public ArrayList<String> gradcity = new ArrayList<String>();
			state=gradstate.get(k);
			//public ArrayList<String> gradstate = new ArrayList<String>();
			yog=gradyear.get(k);
			//public ArrayList<String> gradyear = new ArrayList<String>();
			Gradperc=gradmarks.get(k);
			//public ArrayList<String> gradmarks = new ArrayList<String>();
			eceAdminPhDe=eceAdminPhD.get(k);
			//public ArrayList<String> eceAdminPhD = new ArrayList<String>();
			prefece1=epha1.get(k);
			prefece2=epha2.get(k);
			prefece3=epha3.get(k);
			prefece4=epha4.get(k);
			//public ArrayList<String> epha1 = new ArrayList<String>();
			//public ArrayList<String> epha2 = new ArrayList<String>();
			//public ArrayList<String> epha3 = new ArrayList<String>();
			//public ArrayList<String> epha4 = new ArrayList<String>();
			cmpAdminPhDe=cmppgrad.get(k);
			//public ArrayList<String> cmppgrad = new ArrayList<String>();
			degpg=pgraddeg.get(k);
			//public ArrayList<String> pgraddeg = new ArrayList<String>();
			
			//public ArrayList<String> pgraddep = new ArrayList<String>();
			collegepg=pgradcol.get(k);
			//public ArrayList<String> pgradcol = new ArrayList<String>();
			thesispg=pgradth.get(k);
			//public ArrayList<String> pgradth = new ArrayList<String>();
			citypg=pgradcity.get(k);
			//public ArrayList<String> pgradcity = new ArrayList<String>();
			statepg=pgradstate.get(k);
			//public ArrayList<String> pgradstate = new ArrayList<String>();
			yoppg=pgradyear.get(k);
			//public ArrayList<String> pgradyear = new ArrayList<String>();
			PGradperc=pgradmarks.get(k);
			//public ArrayList<String> pgradmarks = new ArrayList<String>();
			
			//public ArrayList<String> otherdeg = new ArrayList<String>();
			examacad=examname.get(k);
			//public ArrayList<String> examname = new ArrayList<String>();
			subjectacad=subject.get(k);
			//public ArrayList<String> subject = new ArrayList<String>();
			yearacad=year.get(k);
			//public ArrayList<String> year = new ArrayList<String>();
			scoreacad=score.get(k);
			//public ArrayList<String> score = new ArrayList<String>();
			rankacad=rank.get(k);
			//public ArrayList<String> rank = new ArrayList<String>();
			
			//public ArrayList<String> tgate = new ArrayList<String>();
			areagate=gatearea.get(k);
			//public ArrayList<String> gatearea = new ArrayList<String>();
			yoggate=gateyear.get(k);
			//public ArrayList<String> gateyear = new ArrayList<String>();
			marksgate=gatemarks.get(k);
			//public ArrayList<String> gatemarks = new ArrayList<String>();
			scoregate=gatescore.get(k);
			//public ArrayList<String> gatescore = new ArrayList<String>();
			rankgate=gaterank.get(k);
			//public ArrayList<String> gaterank = new ArrayList<String>();
			achievements=achievement.get(k);
			//public ArrayList<String> achievement = new ArrayList<String>();
			String[] line = timestamp.get(k).split(" ");
			
			String[] ln=line[0].split("-");
			String mon=month.get(ln[1]).toString();
			String fin;
			if(mon.length()==2)
			{
					fin=ln[0]+"-"+month.get(ln[1])+"-"+ln[2];			
			}
			else
			{
				 fin = ln[0]+"-0"+month.get(ln[1])+"-"+ln[2];
			}
			dt = LocalDate.parse(fin);
			/*SimpleDateFormat form=new SimpleDateFormat("dd-MM-yyyy");
			try {
				try {
					dt=form.parse(timestamp.get(k));
				} catch (java.text.ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			//public ArrayList<String> timestamp = new ArrayList<String>();
			n=enrollid.get(k);
			//public ArrayList<String> enrollid = new ArrayList<String>();
			/*
			public ArrayList<String> list1  = new ArrayList<String>();
			public ArrayList<String> list2  = new ArrayList<String>();
			public ArrayList<String> list3  = new ArrayList<String>();
			public ArrayList<String> list4  = new ArrayList<String>();
			public ArrayList<String> list5  = new ArrayList<String>();*/
			
			obj=new AdminPhD("0",emaile,namee,n,cate,gendere,pd,dobe,AdminPhDstream,degree,degpg,tenthboard,twelthboard,dept,dept,univ,collegepg,state,statepg,tenthpercent,twelthpercent,Gradperc,PGradperc,scoregate,dt);
			ap.add(obj);
			
			BufferedWriter app=null;
			try {
					
			    		 app=new BufferedWriter(new FileWriter("./src/File"+(1000+k)+".txt"));
						app.write("Email ID: "+emaile);
						app.write("\nName: "+namee);
						app.write("\nEnrollment Id: "+n);
						app.write("\nAddress of Correspondence: "+addrcorres);
						app.write("\nMobile: "+mobilee);
						
						app.write("\nAdminPhD Stream: "+AdminPhDstream);
						
						app.write("\nAdminPhD Area Preference1: "+prefarea1);
						app.write("\nAdminPhD Area Preference2: "+prefarea2);
						app.write("\nAdminPhD Area Preference3: "+prefarea3);
						app.write("Gender: "+gendere);
						app.write("\nCategory: "+cate);
						app.write("\nPhysically Disabled: "+pd);
						app.write("\nDate of Birth: "+dobe);
						app.write("\nChildren of War: "+cow);
						app.write("\nFather's Name: "+fathere);
						app.write("\nNationality: "+nationalitye);
						app.write("\nPermanent Address: "+peraddr);
						app.write("\nPinCode: "+pincodee);
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
						app.write("\nGraduation Percentage: "+Gradperc);
						
							app.write("\n--------APPLYING FOR ECE--------\n");
							app.write("\nPreference1: "+prefece1);
							app.write("\nPreference2: "+prefece2);
							app.write("\nPreference3: "+prefece3);
							app.write("\nPreference4: "+prefece4);
						
						
							app.write("\n---------POSTGRADUATION--------\n");
						app.write("\nCollege of Postgraduation: "+collegepg);
						app.write("\nCity of Postgraduation: "+citypg);
						app.write("\nState of Postgraduatoin: "+citypg);
						app.write("\nDepartment of Postgraduation: "+dept);
						app.write("\nDegree: "+degpg);
						app.write("\nThesis Title: "+thesispg);
						app.write("\nYear of Postgraduation: "+yoppg);
						app.write("\nPostgraduation Percentage: "+PGradperc);
						
						
							app.write("\n---------ACADEMICS--------\n");
							app.write("\nExam Name: "+examacad);
							app.write("\nSubject: "+subjectacad);
							app.write("\nYear: "+yearacad);
							app.write("\nScore: "+scoreacad);
							app.write("\nRank: "+rankacad);
						
						
							app.write("\n---------GATE--------\n");
							app.write("\nArea: "+areagate);
							app.write("\nYear of Graduation: "+yoggate);
							app.write("\nMarks: "+marksgate);
							app.write("\nScore: "+scoregate);
							app.write("\nRank: "+rankgate);
						
						app.write("\nAchievements: "+achievements);
						app.close();
						//app.write("\nXth Board: "+tenthboard);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    	}
		ObjectOutputStream x=null;
		try {
			 x=new ObjectOutputStream(new FileOutputStream("./src/PHD.txt"));
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		for(int i=0;i<ap.size();i++)
		{
			try {
				x.writeObject(ap.get(i));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		{
			try {
				x.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		

	}



	
	

