package git.Learning;

import java.util.Comparator;

public class StudentPr implements Comparator<StudentPr>{
	private int id;
	private int grade;
	private String name;
	
	@Override
	public int compare(StudentPr o1, StudentPr o2) {
		if(o1.equals(o2))
			return 0;
		else if(o1.getGrade()<o2.getGrade())
			return 1;
		else
			return -1;
	}
	public String toString(){
		return ("ID: "+getId()+"  Grade:"+getGrade()+" Name:"+getName());
	}
	
	StudentPr(){
		
	}
	StudentPr(int id,int grade,String name){
		setGrade(grade);
		setId(id);
		setName(name);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
