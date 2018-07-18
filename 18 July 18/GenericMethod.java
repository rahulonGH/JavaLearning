package git.Learning;

public class GenericMethod {
	
	public static <E> void print(E[] elemArr){
		for(E e:elemArr){
			System.out.print(e);
			System.out.print(' ');
		}
		System.out.println();
		//angular.foreach(E,function(value,key){console.log('');}) 
	}

	public static void main(String[] args) {
		Integer[] i = {10,20,30};
		Character[] c = {'R','A','H','U','L'};
		
		print(i);
		print(c);
	}

}
