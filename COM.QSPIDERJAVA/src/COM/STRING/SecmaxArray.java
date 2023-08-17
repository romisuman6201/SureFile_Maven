package COM.STRING;

public class SecmaxArray {

	public static void main(String[] args) {
		
		boolean status=true;
		int [] a= {10,20,30,40,50};
		
		for (int j = 1; j<=100; j++) {
			
			for (int i = 0; i < a.length; i++) {
				if(j==a[i]) {
					status=false;
					break;
					
				}
			}
			if(status==true) {
				System.out.println(j);
			}
			status=true;
			
		}

	}

}
