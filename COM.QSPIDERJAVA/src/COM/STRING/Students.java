package COM.STRING;

public class Students {

	String name;
	int age;
	float percentage;

	public Students(String name, int age, float percentage) {
		this.name = name;
		this.age = age;
		this.percentage = percentage;

	}
	public static void main(String[] args) {
		Students [] s=new Students[3];
		s[0]=new Students("romisuman",30,56.05f);
		s[1]=new Students("rahulsuman",38,58.05f);
		s[2]=new Students("raj",48,59.05f);
		details(s);
	}
	public static void details(Students sarray[]) {
		System.out.println("name age percentage");
		for (Students s1 : sarray) {
			System.out.println(s1.name+" "+s1.age+" "+s1.percentage);
			
		}
	}

}
