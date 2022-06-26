
public class Kurs {

	Teacher teacher ;
	String name ;
	String code ;
	String prefix;
	int note ;
	int sozluNotu;
	
	 Kurs(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		int note = 0 ;
		int sozluNotu = 0 ;
		
	}
	 
	 void addTeacher(Teacher teacher) {
		if(teacher.brans.equals(this.prefix)) {
			 this.teacher = teacher ;
			
		}else {
			System.out.println("Öğretmen ve Ders Bölümleri Uyuşmuyor");
		}
		
		
	 }
	
	void printTeacher() {
		this.teacher.print();
	}
	
}
