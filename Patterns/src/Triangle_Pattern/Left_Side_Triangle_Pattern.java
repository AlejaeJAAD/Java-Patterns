package triangle_Pattern;

public class Left_Side_Triangle_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 9;
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
