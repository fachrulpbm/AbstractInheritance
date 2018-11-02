public class Main{
	public static void main(String[] args) {
		Kucing k = new Kucing();
		k.berbicara();	

		Sapi s = new Sapi();
		s.berbicara();

		/* Hewan tidak dapat diinstansiasi, karena
		   Hewan adalah abstract class */
		// Hewan h = new Hewan();
	}
}