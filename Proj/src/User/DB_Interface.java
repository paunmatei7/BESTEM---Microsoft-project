package User;

public interface DB_Interface {
	public void Add_Student(float LocatieX, float LocatieY, String Nume, String Prenume, int Camin_ID, boolean checkin,
			boolean voluntar, int Rating_Camera, int Grupa_ID, int Student_ID);
	public void Add_Profesor(String Nume, String Prenume, int Materie_ID, int Grupa_ID, int Zi, int Luna);
	public void Add_Materie(String Denumire, int Nota, int ID);
	public void Add_Grupa(int Numar_Grupa, int Program_ID, int ID);
	public void Add_Camin(float LocatieX, float LocatieY, String Nume, int Camin_ID, int Camera_ID, boolean checkin, float cost);
	public void Add_Camera(int Student_ID, int Camera_ID, int Numar_Studenti, int Camin_ID, 
			int Nr_Locuri_Libere, int Rating_Camera, int Numar_Camera);
	public void Add_Codes();
	public int Add_Users(String code, String username, String pass, int Student_ID);
	public void Add_Program(int Inceput_ora, int Sfarsit_ora, int zi);
	public void Remove_Program(int Inceput_ora, int Sfarsit_ora, int zi);
	public void Remove_Student(int Student_ID);
	public void Remove_Profesor(int Materie_ID);
	public void Remove_Materie(int ID);
	public void Remove_Grupa(int ID);
	public void Remove_Camin(int Camin_ID);
	public void Remove_Camera(int Camera_ID);
}
