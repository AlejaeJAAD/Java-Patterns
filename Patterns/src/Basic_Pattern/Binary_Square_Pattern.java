package basic_Pattern;

public class Binary_Square_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int side = 9;
		
		for (int i = 0; i < side; i++) {
			for (int j = 0; j < side; j++) {
				if(i%2 == 0) {
					System.out.print("0 ");
				} else {
					System.out.print("1 ");
				}
			}
			System.out.println("");
		}
	}

}
