package COM.STRING;

public class CountOfWordsAfterTrim {

	public static void main(String[] args) {
		String s="   i am am java developer    ";
		String s1 = s.trim();
		int count=1;
		for (int i = 0; i <s1.length(); i++) {
			if(s1.charAt(i)==' '&& s1.charAt(i+1)!=' ') {
			  count=count+1;	
			}
			
		}
	
		System.out.println("no of words are :"+count);
	}

}
