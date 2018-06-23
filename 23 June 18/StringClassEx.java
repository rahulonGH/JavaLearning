package git.Learning;

public class StringClassEx {
	public static void main(String[] args) {
		String str = "ABC";
		System.out.println(str);
		str.concat("DEF"); // ABCDEF
		System.out.println(str);
		
		String str1 = new String(str);
		str1.equals("RAM");
		str1.contains("R");
		System.out.println(str1+78787);
		str1.toCharArray();
		str1.toLowerCase();
		str1.trim();
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.append("--FSGSGG"));
		System.out.println(sb.substring(5,7));
		//System.out.println(sb+78787);
	
		StringBuilder sb1 = new StringBuilder();		
	}
}
