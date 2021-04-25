/**
 * 
 */
package DesignPatterns.SingletonPattern;

/**
 * @author ANREW25
 *
 */
public class DbSingletonDemo {

	public static void main(String[] args) {
		
		DbSingleton instance = DbSingleton.getInstance();
		
		System.out.println(instance);
		//Connection conn = DbSingleton.getConnection();
		
		/*
		 * Statement st; try { st = conn.createStatement(); int count = st.
		 * executeUpdate("CREATE TABLE Address(ID int,StreetName varchar(50),City varchar(50))"
		 * ); System.out.println("Table Created."); st.close(); }catch(SQLException e) {
		 * e.printStackTrace(); }
		 */
		
	
		//PITFALLS
		//often overused
		//difficult to unit test
		//if not careful, not thread safe
		
		
	}
	
	
}
