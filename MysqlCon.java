
	import java.sql.*;
	import java.util.Scanner;  
	class MysqlCon{  
	public static void main(String args[]){  
	try{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/sindhu","root","");  
	//here sonoo is database name, root is username and password  
	Statement stmt=con.createStatement(); 

	Scanner k = new Scanner(System.in); 
	System.out.println("enter ssn"); 
	int ssn = k.nextInt(); 
	System.out.println("enter Name"); 
	String name = k.next(); 
	System.out.println("enter Address"); 
	String address = k.next();
	System.out.println("enter sex");
	String sex=k.next();
	System.out.println("enter salary");
	int salary =k.nextInt();
	System.out.println("enter superssn");
	int superssn=k.nextInt();
	System.out.println("enter dno");
	int dno =k.nextInt();

	//Inserting data using SQL query 
	String sql = "insert into employee values("+ssn +",'"+name+"','"+address+"','"+sex+"',"+salary+","+superssn+","+dno+")"; 

	try
	{ 
		
		//Reference to connection interface 
		Statement st = con.createStatement(); 
		int m = st.executeUpdate(sql); 
		if (m == 1) 
			System.out.println("inserted successfully : "+sql); 
		else
			System.out.println("insertion failed"); 
	} 
	catch(Exception ex) 
	{ 
		System.err.println(ex); 
	}

	ResultSet rs=stmt.executeQuery("select name from employee where name=sindhu");  
	while(rs.next())  
	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getInt(6)+" "+rs.getInt(7));  
	con.close();  
	}catch(Exception e){ System.out.println(e);}  
	}  
	}  




