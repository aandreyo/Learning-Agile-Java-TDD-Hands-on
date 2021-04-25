/**
 * 
 */
package StudentPackage.models;

import java.util.*;


/**
 * @author ANREW25
 *
 */
public class RosterReport {
	public static final String NEWLINE = System.getProperty("line.separator");
    public static final String ROSTER_REPORT_HEADER="Student"+NEWLINE+"-----"+NEWLINE,ROSTER_REPORT_FOOTER=NEWLINE+"# students = "; 
    
    ArrayList<Student> students = new ArrayList<Student>();
	
	public Date createDate(int year,int month,int date) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.clear();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month-1);
		calendar.set(Calendar.DAY_OF_MONTH, date);
		return calendar.getTime();
	}
	
	
	public String getRosterReport() {
    	StringBuilder buffer = new StringBuilder();
    	buffer.append(ROSTER_REPORT_HEADER);
    	
    
    	for(Student student : students) {
    		buffer.append(student.getFirstName());
    		buffer.append(NEWLINE);
    	}
  
    	
    	buffer.append(ROSTER_REPORT_FOOTER + students.size() + NEWLINE);
    	
    	return buffer.toString();
    }
}
