
public class Teacher {

	String name ;
	String telefonNu;
	String brans;
	
	Teacher (String name,String telefonNu, String brans) {
		this.name = name ;
		this.telefonNu = telefonNu;
		this.brans = brans ;
		
		
	
	}
	
void print () {
		
		System.out.println("Adı :" + this.name);
		System.out.println("Telefon numarası : " + this.telefonNu);
		System.out.println("Branşı  :" + this.brans);
	}
	
}
