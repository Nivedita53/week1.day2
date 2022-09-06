package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		String rev = ""; 
		int length = str.length();
		char[] charArray = str.toCharArray();
		
        for(int i =length-1;i>=0;i--) {
	rev = rev + str.charAt(i);
	//System.out.println(str.charAt(i));
	
}
if(str.equals(rev)) {
	System.out.println("palindrome");
	
}
else
	System.out.println("not a palindrome");

	}

}

