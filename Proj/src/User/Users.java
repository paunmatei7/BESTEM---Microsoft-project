package User;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;

import User.DB_API;

public class Users{
	int Student_ID;
	String Username;
	String Password;
	
	Users(String name, String pass) {
		Username = name;
		Password = pass;
	}

    public static void main(String[] args) {
        /*// Connect to database
        String hostName = "2ore.database.windows.net"; // update me
        String dbName = "user"; // update me
        String user = "paunmatei7@2ore"; // update me
        String password = "Tbr_2019"; // update me
        String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;"
                + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url,user,password);
            String schema = connection.getSchema();
            System.out.println("Successful connection - Schema: " + schema);

            System.out.println("Query data example:");
            System.out.println("=========================================");


            Statement stmt = connection.createStatement();


            stmt.executeUpdate("INSERT INTO Camera (Numar_Studenti, Rating, Numar_Locuri_Libere, Numar_Camera)" 
					+"VALUES (4, 3, 2, 1452)");
          

            ResultSet rs = stmt.executeQuery("select * from Users");
            while (rs.next()) {
				System.out.println(rs.getString(1)+" "+ rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}
			connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }*/
    	Users_API ok = new Users_API();
    	ok.Check_user("deniss","denisssss");
    	DB_API ok2 = new DB_API();
    	ok2.Add_Codes();
    	
    }
}