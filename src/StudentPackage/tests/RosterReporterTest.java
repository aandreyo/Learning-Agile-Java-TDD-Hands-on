/**
 * 
 */
package StudentPackage.tests;
import junit.framework.TestCase;
import StudentPackage.controller.*;
import StudentPackage.models.*;
import java.util.*;
/**
 * @author ANREW25
 *
 */
public class RosterReporterTest extends TestCase {
	RosterReport report;
	CourseSessionController sessionController;
	
	
	
	
	public void setUp() {
		CourseSession  session = new CourseSession("ENGL","101",report.createDate(2003,1,6));
		
		sessionController.addCourse(session);
	}
	
	
	public void testRosterReport() {
		
	}
	
	
	
}
