package COM.STRING;

public class LongestWord {

	public static void main(String[] args) {
		String s="i am a java developer";
		String[] s1 = s.split(" ");
		System.out.println("length of Array :"+s1.length);
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i]+"-");
			System.out.println(s1[i].length());
			
		}
		int max=0;
		for (int i = 0; i < s1.length; i++) {
			if(s1[i].length()>max) {
				max=s1[i].length();
			}
		}
		System.out.println(max);

	}

}
