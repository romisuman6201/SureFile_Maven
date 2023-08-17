package COM.STRING;

public class Frequency1 {

	public static void main(String[] args) {
		String str1="we live live long forever live";
		String word1="live";
		check(str1,word1);
	}
		public static void check(String str1,String word1) {
			int count=0;
			String[] s = str1.split(" ");
			for (int i = 0; i < s.length; i++) {
				if(word1.equals(s[i])) {
					count++;
				}
			}
			System.out.println(count);
		}

	}


