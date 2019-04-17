package User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Users_API implements Users_Interface{
	public int Check_user(String name, String pass) {
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

            Statement stmt = connection.createStatement();

            int ok = 0;
            ResultSet rs = stmt.executeQuery("select * from Users WHERE Username = '"+ name + "' and Password = '"+ pass + "'");
	        while (rs.next()) {
	        	ok = 1;
	        	break;
			}
	        connection.close();
	        if(ok == 0) {
	        	return 0;
	        }
	        return 1;
	    }
        catch (Exception e) {
        	e.printStackTrace();
	    }
        return 0;
	}
	
	public void Program_Profesor(Profesor prof) {
		String hostName = "2ore.database.windows.net"; // update me
	    String dbName = "user"; // update me
	    String user = "paunmatei7@2ore"; // update me
	    String password = "Tbr_2019"; // update me
	    String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;"
	                + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
	    Connection connection = null;

	    try {
	    	connection = DriverManager.getConnection(url,user,password);

	        Statement stmt = connection.createStatement();
	        
	        
	        ResultSet rs = stmt.executeQuery("select * from Program WHERE Program_ID = '" + prof.Program_ID + "'");
	        while(rs.next()) {
	        	System.out.println(rs.getString(1)+" "+ rs.getString(2) + " " + rs.getString(3));
	        }
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	}
	
	public void Deadl_uri(int Luna) {
		String hostName = "2ore.database.windows.net"; // update me
        String dbName = "user"; // update me
        String user = "paunmatei7@2ore"; // update me
        String password = "Tbr_2019"; // update me
        String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;"
                + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url,user,password);


            Statement stmt = connection.createStatement();

            ResultSet rs = stmt.executeQuery("select * from Profesor WHERE Luna = '" + Luna + "'");
            while (rs.next()) {
				System.out.println(rs.getString(6)+" "+ rs.getString(7));
			}
			connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}

	public void Ajutor(Student stu) {
		String hostName = "2ore.database.windows.net"; // update me
        String dbName = "user"; // update me
        String user = "paunmatei7@2ore"; // update me
        String password = "Tbr_2019"; // update me
        String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;"
                + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url,user,password);

            Statement stmt = connection.createStatement();
            float Min = 100000;
            String Volx = null, Voly = null;
          
            ResultSet rs = stmt.executeQuery("select * from Student WHERE Voluntar = '" + stu.Voluntar + "'");
            while (rs.next()) {
            	float a = rs.getFloat(7);
            	float b = rs.getFloat(7);
				if(Min > (a - stu.LocatieX) * (a - stu.LocatieX) + (b - stu.LocatieY) * (b - stu.LocatieY)  && rs.getBoolean(5) == true) {
					Min = (a - stu.LocatieX) * (a - stu.LocatieX) + (b - stu.LocatieY) * (b - stu.LocatieY);
					Volx = rs.getString(1);
					Voly = rs.getString(2);
				}
			}
            if(Min == 100000) {
            	System.out.println("Nu Exista Voluntari");
            }
            else {
            	System.out.print(Volx);
            	System.out.print(Voly);
            	
            }
			connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}
}