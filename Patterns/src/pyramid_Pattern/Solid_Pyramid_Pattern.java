package pyramid_Pattern;

public class Solid_Pyramid_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 12;
		
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) 
				System.out.print("* ");
			System.out.println("");
		}
	}

}
