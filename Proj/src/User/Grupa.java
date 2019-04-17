package User;

public class Grupa {
	int Numar_Grupa;
	int Program_ID;
	int ID;
	
	Grupa() {
		Numar_Grupa = Program_ID = ID = 0;
	}
	
	Grupa(int numar_Grupa, int program_Id) {
		Numar_Grupa = numar_Grupa;
		Program_ID = program_Id;
	}
	
	int Get_Program_ID() {
		return Program_ID;
	}
	
	int Get_Numar_Grupa() {
		return Numar_Grupa;
	}
}
