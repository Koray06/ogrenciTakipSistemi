
public class main {

	public static void main(String[] args) {
		

		Teacher t1 = new Teacher (" Koray Hoca ", "05336445494", "TRH" );
		Teacher t2 = new Teacher("Samet Hoca ", "05387837470", "FZK");
		Teacher t3 = new Teacher("Namsalo Hoca ", "05387837470", "BİO");
		
		
		Kurs tarih = new Kurs ("Tarih", "101", "TRH");
		tarih.addTeacher(t1) ;
		
		Kurs fizik = new Kurs ("Fizik", "102", "FZK");
		fizik.addTeacher(t2) ;
		
		Kurs biyoloji = new Kurs ("Bioloji", "103", "BİO");
		biyoloji.addTeacher(t3) ;
		
		
		students s1 = new students("İnek Samet", "1234", "4", tarih, fizik,biyoloji);
		s1.notEkleme(40,33,44,55,60,70);
		s1.ispass();
	}

}