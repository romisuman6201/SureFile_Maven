package COM.STRING;

public class CountofsameChar {

	public static void main(String[] args) {
		String name="JavaEEeedd";
		int count=0;
		for (int i = 0; i < name.length(); i++) {
			
			if(name.charAt(i)=='e' ||name.charAt(i)=='E') {
				count++;
			}
			
		}
		System.out.println("Count is :"+count);
	}

}
