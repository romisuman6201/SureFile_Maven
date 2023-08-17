package COM.STRING;

public class ConvertUpper {

	public static void main(String[] args) {
	   String s="JaVa DeVelopment";
	   String lc = s.toLowerCase();
	   String uc = s.toUpperCase();
	   System.out.println(lc);
	   System.out.println(uc);
	   boolean starts = s.startsWith("Ja");
	   boolean ends = s.endsWith("ent");
	   boolean emp = s.isEmpty();
	   boolean con = s.contains("opm");
	   System.out.println(starts+" "+ends+" "+emp+" "+con);
	   String newwords = s.concat("devghj");
	   System.out.println(newwords);

	}

}
