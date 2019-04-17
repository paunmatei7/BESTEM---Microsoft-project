package User;


public class Student {
	String Nume;
	String Prenume;
	int Camera_Id;
	boolean Voluntar;
	boolean Checkin;
	int Rating_Camera;
	float LocatieX, LocatieY;
	int Grupa_Id;
	int Student_ID;
	
	Student() {
		Camera_Id = Grupa_Id = 0;
		Student_ID = 0;
		Voluntar = Checkin = false;
		Rating_Camera = 0;
		LocatieX = LocatieY = (float)0.0;
	}

    public Student(boolean voluntar, boolean check, int rating_elev, String nume,int student_ID) {
        Voluntar = voluntar;
        Checkin = check;
        Rating_Camera = rating_elev;
        Nume = nume;
        Student_ID = student_ID;
    }
    
}
