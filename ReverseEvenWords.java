package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String str = "i am an software tester";
		String[] split = str.split(" ");
		for(int i=0;i<split.length;i++) {
			if(i%2==0) {
				//System.out.println("");
				//System.out.println(split[i]);
				char[] charArray = split[i].toCharArray();
				for(int j=charArray.length-1;j>=0;j--) {
					System.out.print(charArray[j]);
					
				}
			}
				else {
					
					System.out.print(" " +split[i]+ " ");
					//System.out.print(charArray[j]);
				}
				
				
		} 
				
			
		}

	}


