package git.Learning;

class Student{
	int rollNo;
	int fees;
	String studName;
	String schoolName;
	Student(){ //default constructor
		this.schoolName= new String("DPS");
	}
	Student(String s){ //constructor got overloaded
		this.schoolName= s;
	}
	Student(Student st){
		this.fees = st.fees;
		this.rollNo = 103;
		this.studName = "Babeeta";
		this.schoolName = st.schoolName;
	}
	void get(){
		System.out.print(rollNo);
		System.out.println(studName+ "   " +schoolName);
	}
	void get(int fees){
		this.fees = fees; 	//this always reference to the object on which it was invoked
		System.out.println("Overloaded get method called,...!");
	}
	void display(){
		System.out.println(rollNo+"  "+fees+"  "+studName+"  "+schoolName);
	}
	void set(int r,int f, String sN){
		this.rollNo = r;
		this.fees = f;
		this.studName = sN;
	}
}

public class Contructors {

	public static void main(String[] args) {
		
		Student stud = new Student(); //here t is an object of class Temp having all the fields and behaviors accessible unless we provide any explicit restriction on class
		Student stud1 = new Student();
		Student stud2 = new Student("DAV");//this will invoke parameterized constuctor
		Student stud3 = new Student("DAV"); // 0 0 null DAV
		//Student stud4 = new Student(stud3); //create an object for another student having same fees as stud3  // 103  0  Babeeta  DAV
		
		stud.set(101, 2000, "RAM");
		stud1.set(102, 3000, "Shyam");
		stud2.set(101, 1000, "Sita");
		stud3.set(102, 5000, "Geeta");
		
		Student stud4 = new Student(stud3); //0 5000 null null
		
		stud.display();
		stud1.display();
		stud2.display();
		stud3.display();
		stud4.display();
		
		stud3.get(2000);
		stud3.display();
		
		}
}