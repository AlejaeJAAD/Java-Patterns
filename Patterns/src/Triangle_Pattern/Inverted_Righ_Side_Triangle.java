package triangle_Pattern;

public class Inverted_Righ_Side_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 12;
		
		for (int i = 0; i < size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < size; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
