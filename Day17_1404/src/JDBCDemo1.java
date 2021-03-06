import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

 
public class JDBCDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dbUrl = "jdbc:mysql://localhost:3306/mydb";
		String uname = "root";
		String pass = "root";
		List<Employee> empList = null;
	 		
		try(Connection con = DriverManager.getConnection(dbUrl,uname,pass) ) {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
						 
			if(con!=null) {
				
//				String sql = "SELECT empid, ename, city, salary from employee";
//				
//				PreparedStatement stmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//				
//				ResultSet rs = stmt.executeQuery();
//				
//				rs.next();
//				
//					int empid = rs.getInt("empid");
//					String ename = rs.getString(2);
//					String city = rs.getString(3);
//					int sal = rs.getInt(4);
//				
//					System.out.println(empid + "\t" + ename + "\t" + city + "\t"+ sal);
//				
//				rs.next();
//				
//					empid = rs.getInt("empid");
//					ename = rs.getString(2);
//					city = rs.getString(3);
//					sal = rs.getInt(4);
//				
//					System.out.println(empid + "\t" + ename + "\t" + city + "\t"+ sal);
//					
//				rs.previous();
//					empid = rs.getInt("empid");
//					ename = rs.getString(2);
//					city = rs.getString(3);
//					sal = rs.getInt(4);
//				
//					System.out.println(empid + "\t" + ename + "\t" + city + "\t"+ sal);
//				
//				rs.absolute(5);
//					empid = rs.getInt("empid");
//					ename = rs.getString(2);
//					city = rs.getString(3);
//					sal = rs.getInt(4);
//				
//					System.out.println(empid + "\t" + ename + "\t" + city + "\t"+ sal);
//					
//					rs.updateString(3, "Chennai");
//					rs.updateRow();
//					
//					empid = rs.getInt("empid");
//					ename = rs.getString(2);
//					city = rs.getString(3);
//					sal = rs.getInt(4);
//				
//					System.out.println(empid + "\t" + ename + "\t" + city + "\t"+ sal);
//				
//				rs.close();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//perform db operations
				//System.out.println("Connection to mysql success...");
				
				con.setAutoCommit(false);
				
				Employee emp = new Employee(109,"Rahul", "Mumbai", 3000);
				
				String sql = "INSERT INTO employee VALUES(?,?,?,?)";
				
				//String sql = "UPDATE employee SET city='Chennai' WHERE empid=101";
				
				//String sql = "DELETE FROM employee";
				
				PreparedStatement st = con.prepareStatement(sql);
				
				st.setInt(1, emp.getEmpId());
				st.setString(2, emp.geteName());
				st.setString(3, emp.getCity());
				st.setInt(4, emp.getSalary());
				
				boolean result = st.execute();
				
				con.commit();
				
				System.out.println(result);
				
				if(!result) {
					int count = st.getUpdateCount();
					if(count>=1) {
						System.out.println("record inserted");
					}
				}
				
//				int result = st.executeUpdate(sql);
//				
//				if(result>=1) {
//					System.out.println(result + " Record/s deleted");
//				}
				
//				String sql = "SELECT empid, ename, city, salary FROM employee";
//				
//				Statement stmt = con.createStatement();
//				
//				ResultSet rs = stmt.executeQuery(sql);
//				
//				empList = new ArrayList<>();
//				
//				while(rs.next()) {
//					int empid = rs.getInt("empid");
//					String ename = rs.getString(2);
//					String city = rs.getString(3);
//					int sal = rs.getInt(4);
//					
//					//System.out.println(empid + " " + ename + "\t" + city + "\t"+ sal);
//					Employee e = new Employee(empid, ename, city, sal);
//					empList.add(e);
//				}
//				rs.close();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//System.out.println(empList);
		
		
//		finally {
//			if(con!=null) {
//				try {
//					con.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
	}

}
