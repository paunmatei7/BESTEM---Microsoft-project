package User;

public class Materie {
	int ID;
	String Denumire;
	int Nota;
	
	Materie() {
		Nota = 0;
		ID = 0;
	}
	
	Materie(int nota, String denumire) {
		Nota = nota;
		Denumire = denumire;
	}
	
	public int Get_Nota() {
		return Nota;
	}
	
	public String Get_Denumire() {
		return Denumire;
	}

}
