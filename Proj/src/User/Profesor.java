package User;

public class Profesor {
	String Nume;
	String Prenume;
	int Materie_ID;
	int Grupa_ID;
	int Zi;
	int Luna;
	int Program_ID;
	
	Profesor() {
		Materie_ID = Grupa_ID = Program_ID = 0;
		Zi = Luna = 0;
	}
	
	Profesor(String nume, String prenume, int materie_ID, int grupa_ID, int program_ID, int zi, int luna) {
		Nume = nume;
		Prenume = prenume;
		Materie_ID = materie_ID;
		Grupa_ID = grupa_ID;
		Program_ID = program_ID;
		Zi = zi;
		Luna = luna;
	}

}
