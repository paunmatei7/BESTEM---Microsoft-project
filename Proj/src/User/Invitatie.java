package User;

import java.util.Random;

public class Invitatie {
	String Cod;
	
	String Get_Cod() {
		return Cod;
	}
	
	String Generate_Cod() {
		String x = "";
		Random rand = new Random();
		for(int i = 1; i <= 5; ++i) {
			int n = rand.nextInt(26);
			x = x + (char)(n + 'a');
			n = rand.nextInt(52);
			x = x + (char)(n + 'A');
		}
		return x;
	}
	
	void Update_Cod() {
		Cod = Generate_Cod();
	}
	
	boolean Check_Cod(String cod) {
		if(Cod.equals(cod)) {
			return true;
		}
		return false;
	}
	
}
