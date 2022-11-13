package day30_wrapperClass;

public class Task97_FilterString {

	public static void main(String[] args) {
		
		String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
		
		System.out.println(filterString(str));
		

	}
	public static String filterString(String s) {
		
		String a="";
		
		for(int i=0; i<s.length(); i++) {
			
			if (Character.isAlphabetic(s.charAt(i))|| s.charAt(i)==' ') {
				
				a=a+s.charAt(i);
				
			}
			
		}
		return a;
	}

}
