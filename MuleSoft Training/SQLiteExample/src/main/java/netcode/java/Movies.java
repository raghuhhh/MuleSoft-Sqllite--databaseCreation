package netcode.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Movies {
public static void main(String a[]) {
try {
	//create Movies database
	String 	jdbcUrl="jdbc:sqlite:Movies.db";
	Connection connection;
	connection = DriverManager.getConnection(jdbcUrl);
//Create table
	/*String sql="create table Movies(ID INT PRIMARY KEY NOT NULL,MNAME TEXT NOT NULL,Actor TEXT NOT NULL,Actress TEXT NOT NULL,Year INT NOT NULL,DName TEXT NOT NULL);";
	java.sql.Statement statement=connection.createStatement();
	statement.executeUpdate(sql);
	System.out.println("Table Created");
	*/
	
	//inserting 1st row
	/*String sql="insert into Movies values(1,'Daruvu','Ravi Teja','Taapsee',2012,'Siva');";
java.sql.Statement statement=connection.createStatement();
int rows=statement.executeUpdate(sql);
*/
//	inserting 2nd row
/*
String sql1="insert into Movies values(2,'Racha','Ram Charan','Tamannaah',2012,'Sampath Nandi');";
java.sql.Statement statement=connection.createStatement();
int rows=statement.executeUpdate(sql1);
*/
	
String sql="select * from Movies;";
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
} catch (SQLException e) {
	// TODO Auto-generated catch block
	System.out.println("Error connecting to sqllite db");
	e.printStackTrace();
}

}
}
