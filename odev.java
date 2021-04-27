package odev2;

public class odev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course=new Course(1,"java kampı","engin demirog");
		CourseMeneger courseMeneger=new CourseMeneger(course);
		courseMeneger.add();
		Odevler odevler=new Odevler();
		odevler.odevId=1;
		odevler.OdevKonu="2 gün ödevi";
		OdevManager odevManeger= new OdevManager(odevler);
		odevManeger.add();
	}
	
}
class OdevManager extends Odevler{
	Odevler _odevEkle;
	OdevManager(Odevler odev){
		_odevEkle=odev;
	}
	void add() {
		System.out.println("yeni odev eklendi odev konusu: "+_odevEkle.OdevKonu);

		
	}
	
}

class CourseMeneger extends Course{
	Course _course;
	CourseMeneger(Course course){
		_course=course;
	}
	
	void add() {
	System.out.println("yeni kurs eklendi "+_course.courseName+" "+_course.teacher);
	}

}

 class Course{
	 Course(int id,String courseName,String teacher){
		
		 this.id=id;
		 this.courseName=courseName;
		 this.teacher=teacher;
	 }
	 Course(){}
	 
	 int id;
	 String courseName;
	 String teacher;
	
	
}
 class Odevler{
	 Odevler(int odevId,String odevKonu){
		 this.odevId=odevId;
		 this.OdevKonu=odevKonu;
	 }
	 Odevler(){}
	 
	 int odevId;
	 String OdevKonu;
	 
	 
	 
 }