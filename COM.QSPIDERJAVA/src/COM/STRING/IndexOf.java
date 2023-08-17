package COM.STRING;

public class IndexOf {

	public static void main(String[] args) {
	   String s="javajajhsjhkjskghggjmgsmkgsk";
	   String uniq="";
	   for (int i = 0; i <s.length(); i++) {
		   char ch = s.charAt(i);
		   
		   if(uniq.indexOf(ch)==-1) {
			   uniq=uniq+ch;
		   }
		
	}
	   System.out.println("uniq words of alphabet :"+uniq);
	  

	}

}
