package User;

public class Program{
	int Inceput_ora;
	int Sfarsit_ora;
	int Zi;
	
	Program() {
		Inceput_ora = Sfarsit_ora = Zi = 0;
	}

	Program(int inceput_ora, int sfarsit_ora, int zi) {
		Inceput_ora = inceput_ora;
		Sfarsit_ora = sfarsit_ora;
		Zi = zi;
	}
	
	boolean Check_Program(int ora, int zi) {
		if(Inceput_ora <= ora && Sfarsit_ora >= ora && Zi == zi) {
			return true;
		}
		return false;
	}
	
}
