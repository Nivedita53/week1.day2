package week1.day2;

public class RemoveDuplicateStrings {

	public static void main(String[] args) {
		String str = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] split = str.split(" ");
		for(int i=0;i<split.length;i++) {
			
			for(int j=i+1;j<split.length;j++) {
				if(split[i].equals(split[j])) {
					count++;
				}
			}
		
			if(count>1) {
				str = str.replace(split[i], "");
				System.out.println(str);
				count=0;
			}
			
		}
		
	    }
			
	}




