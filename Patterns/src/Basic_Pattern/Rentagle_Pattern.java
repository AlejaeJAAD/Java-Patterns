package Basic_Pattern;

public class Rentagle_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length, breadth;
		
		length = 8;
		breadth = 3;
		
		for (int i = 0; i < breadth; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
