package net.cjava;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
;public class Movies1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String jdbcUrl="jdbc:sqlite:/C:\\Users\\Asus\\OneDrive\\Desktop\\db\\moviesdb.db";

try {
	Connection connection=DriverManager.getConnection(jdbcUrl);
String sql="SELECT * FROM Movies;";
java.sql.Statement statement=connection.createStatement();
ResultSet result= statement.executeQuery(sql);
while(result.next()) {
	String name=result.getString("MNAME");
	int sno=result.getInt("ID");
	String actor=result.getString("Actor");
	String actress=result.getString("Actress");
	int year=result.getInt("Year");
	String dname=result.getString("DNAME");
	System.out.print(sno+" "+ name+" "+actor+" "+actress+" "+year+" "+dname);
System.out.println();
}
}
catch(SQLException e){
	System.out.println("Error connecting to sqllite db");
	e.printStackTrace();
}

	}
}
