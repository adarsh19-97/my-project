package database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DataOperations {
private Connection conn;
public DataOperations() {
    // Default constructor logic (if any)
}
public DataOperations(Connection conn) {
	this.conn=conn;
}
public void createTable() {
	try(Statement stmt= conn.createStatement()){
stmt.execute("create table if not exists user(id int primary key auto_increment,name varchar(200),email varchar(200),password varchar(100),mobilenumber  varchar(20)) ");		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
}
	
public void insertData(String name, String email,String password,Long mobilenumber) {
	
	
	
	try(PreparedStatement pstmt=conn.prepareStatement("insert into user(name,email,password,mobilenumber) values (?,?,?,?)")){
		pstmt.setString(1,name);
		pstmt.setString(2, email);
		pstmt.setString(3, password);
		pstmt.setLong(4, mobilenumber);
		pstmt.executeUpdate();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
}
public boolean logindata(String email,String password) throws SQLException, NullPointerException{
	String query="SELECT*FROM user WHERE email = ? AND password = ?";
try (PreparedStatement pstmt = conn.prepareStatement(query)){
	pstmt.setString(1, email);
	pstmt.setString(2, password);

	try (ResultSet rs = pstmt.executeQuery()) {
        return rs.next();
}
	
}
}
public void createTable2() {
	try(Statement stmt= conn.createStatement()){
stmt.execute("create table if not exists book(id int primary key auto_increment,venue varchar(200),"
		+ "date varchar(200),time varchar(100),email varchar(200),mobilenumber varchar(20), address varchar(300)) ");		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
}
	
public void insertData1(String venue, String date,String time,String email,Long mobilenumber,String address) {
	
	
	
	try(PreparedStatement p=conn.prepareStatement("insert into book(venue,date,time,email,mobilenumber,address) values (?,?,?,?,?,?)")){
		p.setString(1,venue);
		p.setString(2, date);
		p.setString(3, time);
		p.setString(4, email);
		p.setLong(5, mobilenumber);
		p.setString(6, address);
		p.executeUpdate();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
}
public ResultSet getTable() throws SQLException {
	JdbcConnection db=new JdbcConnection();
	Connection conn=db.getConnection();
	Statement statement=conn.createStatement();	

	String query="select * from user";
	ResultSet rs=statement.executeQuery(query);
	
	return rs;
}


}
