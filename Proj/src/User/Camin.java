package User;

public class Camin {
	float LocatieX, LocatieY;
	String Nume;
	int Camin_ID;
	int Camera_ID;
	boolean Checkin;
	float Cost;
	
	Camin() {
		LocatieX = LocatieY = (float)0.0;
		Camin_ID = Camera_ID = 0;
		Cost = (float) 0.0;
		Checkin = false;
	}
	
	Camin(float X, float Y, String nume, int camin_ID, int camera_ID, float cost, boolean checkin) {
		LocatieX = X;
		LocatieY = Y;
		Nume = nume;
		Camin_ID = camin_ID;
		Camera_ID = camera_ID;
		Cost = cost;
		Checkin = checkin;
	}
	
	
}
