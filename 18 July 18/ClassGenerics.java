package git.Learning;

class ClassGenerics<T>{
	  T obj; //type parameter for generics
	  void add(T obj){
	  this.obj = obj;
	  }
	  T get(){
	   return obj;
	  }
	  
	  public static void main(String args[]){
		  
		  ClassGenerics<Integer> i = new ClassGenerics<Integer>();
		  ClassGenerics<String> s =new ClassGenerics<String>();
		   s.add("RAHUL");
		   System.out.println(s.get());
		   
		   i.add(100);
		   System.out.println(i.get());
	  }
	 
}
