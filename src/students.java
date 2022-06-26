
public class students {
 
 String name;
 String OgrenciNu;
 String sınıf;
 Kurs k1;
 Kurs k2;
 Kurs k3;
 
 double ortalama ;
 boolean ispass ;
public students( String name, String ogrenciNu, String sınıf, Kurs k1, Kurs k2, Kurs k3) {
	
	this.name = name;
	OgrenciNu = ogrenciNu;
	this.sınıf = sınıf;
	this.k1 = k1;
	this.k2 = k2;
	this.k3 = k3;
	
	this.ortalama =0.0;
	this.ispass = false ;
}
		
	void  notEkleme(int not1, int not2, int not3, int s1, int s2, int s3) {

		if((not1 >=0 && not1 <=100) && (s1 >=0 && s1 <=100)) {
			this.k1.note= not1 ;
		}
		if((not2 >=0 && not2 <=100)&& (s2 >=0 && s2 <=100 ) ) {
			this.k2.note= not2 ;
		}
		if((not3 >=0 && not3 <=100 )&& (s3 >=0 && s3 <=100 )) {
			this.k3.note= not3 ;
		}
	
	
}
	
	void ispass() {
		
		double n1 = (this.k1.note * 0.8 + this.k1.sozluNotu* 0.20);
		double n2 =	(this.k2.note* 0.8+ this.k2.sozluNotu * 0.20);
		double n3 = (this.k3.note * 0.8 + this.k3.sozluNotu * 0.20) ;
		 this.ortalama = (n1+n2+n3) / 3 ;
		if (this.ortalama>=55) { 
				System.out.println("!!!  TEBRİKLER SINIFI BAŞARIYLA GEÇTİNİZ !!!!! ");
	} else {
		System.out.println("!! DAHA SIKI ÇALIŞMANIZ GEREKLİ .. SINIF TEKRARI !!!!! ");
	}
		prinNote();
	}
	
 void prinNote() {
	 System.out.println(this.k1.name + "Notu " + this.k1.note);
	 System.out.println(this.k2.name + "Notu " + this.k2.note);
	 System.out.println(this.k3.name + "Notu " + this.k3.note);
	 System.out.println("Ortalamanız : " + this.ortalama);
 }

 
}
