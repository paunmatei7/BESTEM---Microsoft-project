package User;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class DB_API implements DB_Interface{
	
	public void Add_Codes() {
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
	        
	        for(int i = 1; i <= 50; ++i) {
	        	Invitatie a = new Invitatie();
	        	String Ok = a.Generate_Cod();
	        	stmt.executeUpdate("INSERT INTO Invitatie (Cod)" + "VALUES ('" + Ok + "')");
	        }
			connection.close();
	    }
	    catch (Exception e) {
	    	e.printStackTrace();
	    }
	}
	
	public int Add_Users(String code, String username, String pass, int Student_ID) {
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
	        
	        int ok = 0;
	        
	        ResultSet rs = stmt.executeQuery("select * from Invitatie WHERE Cod = '" + code + "'");
            while (rs.next()) {
				ok = 1;
			}
            if(ok == 0) {
            	return 0;
            }
            stmt.executeUpdate("DELETE FROM Invitatie WHERE Cod = '" + code + "'");
            stmt.executeUpdate("INSERT INTO Users (Username, Password, Student_Id)" + "VALUES ('" + username + "' , '" + pass +
            		"' , '" + Student_ID +"')");
			if(ok == 1) {
				return 1;
			}
            connection.close();
	    }
	    catch (Exception e) {
	    	e.printStackTrace();
	    }
	    return 1;
	}
	
	public void Add_Camera(int Student_ID, int Camera_ID, int Numar_Studenti, int Camin_ID,
						   int Nr_Locuri_Libere, int Rating_Camera, int Numar_Camera) {
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

            stmt.executeUpdate("INSERT INTO Camera (Student_ID, Camera_ID, Numar_Studenti, Camin_ID, Numar_Locuri_Libere, Rating, Numar_Camera)" + 
            "VALUES ('" + Student_ID + "' , '" + Camera_ID + "' , '" + Numar_Studenti + "' , '" + Camin_ID + "' , '" +
            		Nr_Locuri_Libere + "' , '" + Rating_Camera +  "' , '" + Numar_Camera +"')");
            connection.close();
	    }
	    catch (Exception e) {
	    	e.printStackTrace();
	    }
	}
	
	public void Add_Camin(float LocatieX, float LocatieY, String Nume, int Camin_ID, int Camera_ID, boolean checkin, float cost) {
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
		
		stmt.executeUpdate("INSERT INTO Camin (LocatieX, LocatieY, Nume, Camin_ID, Camera_ID, checkin, cost)" + 
		"VALUES ('" + LocatieX + "' , '" + LocatieY + "' , '" + Nume + "' , '" + Camin_ID + "' , '" + Camera_ID + 
		"' , '" + checkin + "' , '" + cost + "')");
		connection.close();
		}
		catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	public void Add_Grupa(int Numar_Grupa, int Program_ID, int ID) {
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
		
		stmt.executeUpdate("INSERT INTO Grupa (Numar_Grupa, Program_ID, ID)" + 
		"VALUES ('" + Numar_Grupa + "' , '" + Program_ID + "' , '" + ID + "')");
		connection.close();
		}
		catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	public void Add_Materie(String Denumire, int Nota, int ID) {
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
		
		stmt.executeUpdate("INSERT INTO Materie (Denumire, Nota, ID)" + 
		"VALUES ('" + Denumire + "' , '" + Nota + "' , '" + ID + "')");
		connection.close();
		}
		catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	public void Add_Profesor(String Nume, String Prenume, int Materie_ID, int Grupa_ID, int Zi, int Luna) {
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
		
		stmt.executeUpdate("INSERT INTO Profesor (Nume, Prenume, Id_Materie, Id_Grupa, Zi, Luna)" + 
		"VALUES ('" + Nume + "' , '" + Prenume + "' , '" + Materie_ID + "' , '" + Grupa_ID + "' , '" + Zi + "' , '" + Luna + "')");
		connection.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Add_Student(float LocatieX, float LocatieY, String Nume, String Prenume, int Camin_ID, boolean checkin,
							boolean voluntar, int Rating_Camera, int Grupa_ID, int Student_ID) {
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
		
		stmt.executeUpdate("INSERT INTO Student (LocatieX, LocatieY, Nume, Prenume, Camin_ID, checkin, voluntar, Rating_Camera, "
							+ "Grupa_ID, Student_ID)" + 
		"VALUES ('" + LocatieX + "' , '" + LocatieY + "' , '" + Nume + "' , '" + Prenume + "' , '" + Camin_ID + "' , '" + checkin +
		"' , '" + voluntar + "' , '" + Rating_Camera + "' , '" + Grupa_ID + "' , '" + Student_ID + "')");
		connection.close();
		}
		catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	public void Add_Program(int Inceput_ora, int Sfarsit_ora, int zi) {
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
			
			stmt.executeUpdate("INSERT INTO Program (Inceput_ora, Sfarsit_ora, zi)" + 
			"VALUES ('" + Inceput_ora + "' , '" + Sfarsit_ora + "' , '" + zi + "')");
			connection.close();
		}
		catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	public void Remove_Program(int Inceput_ora, int Sfarsit_ora, int zi) {
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
            
            stmt.executeUpdate("DELETE FROM Program WHERE Inceput_ora = '" + Inceput_ora + "' and Sfarsit_ora = '" + Sfarsit_ora 
            		+ "' and zi = '" + zi + "'");

			connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public void Remove_Student(int Student_ID) {
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
            
            stmt.executeUpdate("DELETE FROM Student WHERE Student_ID = '" + Student_ID + "'");

			connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public void Remove_Profesor(int Materie_ID) {
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
            
            stmt.executeUpdate("DELETE FROM Profesor WHERE  Materie_ID = '" + Materie_ID + "'");

			connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public void Remove_Materie(int ID) {
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
            
            stmt.executeUpdate("DELETE FROM Materie WHERE ID = '" + ID + "'");

			connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public void Remove_Grupa(int ID) {
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
            
            stmt.executeUpdate("DELETE FROM Grupa WHERE ID = '" + ID + "'");

			connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public void Remove_Camin(int Camin_ID) {
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
            
            stmt.executeUpdate("DELETE FROM Camin WHERE Camin_ID = '" + Camin_ID + "'");

			connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public void Remove_Camera(int Camera_ID) {
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
            
            stmt.executeUpdate("DELETE FROM Camera WHERE Camera_ID = '" + Camera_ID + "'");

			connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}
}