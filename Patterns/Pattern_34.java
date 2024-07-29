
public class pattern_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;
		int col = 5;
		int count=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				int k = (int)Math.pow(count,2);
				if(i==j && i+j==row-1) {
					System.out.print(k+4+"\t");
				}
				else if( i==j) {
					System.out.print(k+"\t");
				}
				else if(i+j==row-1) {
					System.out.print(4+"\t");
				}
				else {
					System.out.print("*"+"\t");
				}
			}
			count = count+2;
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				int k = (int)Math.pow(count,2);
				if(i==j && i+j==row-1) {
					System.out.print("*"+"\t");
				}
				else if( i==j) {
					System.out.print("-"+"\t");
				}
				else if(i+j==row-1) {
					System.out.print("+"+"\t");
				}
				else {
					System.out.print("O"+"\t");
				}
			}
			count = count+2;
			System.out.println();
		}
	}
}
