package database;

	import java.sql.Connection;
	import java.sql.DriverManager;

	public class JdbcConnection {

	private static final String DB_DRIVER="com.mysql.cj.jdbc.Driver";
	private static final String DB_URL="jdbc:mysql://localhost:3306/musicevents";
	private static final String DB_USERNAME="root";
	private static final String DB_PASSWORD="test";
	public static Connection getConnection() {
	Connection conn =null;
	try {
	Class.forName(DB_DRIVER);
	conn=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
	if(conn != null){
	System.out.println("Successfully connected.");
			}
	else{System.out.println("Failed to connect.");
	}
	}catch(Exception e){
	e.printStackTrace();
		}                                                                                                                                                                                                     
	return conn;
	}
	public static void main(String[] args) {
					
	getConnection();

		}
	}

		

