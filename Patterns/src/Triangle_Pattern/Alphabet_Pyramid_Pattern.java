package triangle_Pattern;

public class Alphabet_Pyramid_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 9;
		
		char c = 'A';
		
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(c+" ");
			}
			c++;
			System.out.println("");
		}
	}

}
