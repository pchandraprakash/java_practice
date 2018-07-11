package arraysPractice;

public class MDStringArray {

	public static void main(String[] args) {
		String[][][] student = new String[2][2][2];
		int a=0;
		int b=0;
		int c=0;
		int count=0;
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				student[a][b][c] = "hello world";
				System.out.print(student[a][b][c] + " ");
				count++;
			}
			System.out.println("");
		}
	}

}
