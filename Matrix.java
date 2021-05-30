
public class Matrix {

	public static void main(String[] args) {
		int a[][]={{1,3,2},{6,4,5},{8,9,7}}; 
		int b[][]={{7,8,9},{4,5,6},{1,2,3}};	
		int c[][]=new int[3][3];
		int d[][]=new int[3][3];
	
		System.out.println("Addition:\n");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}  
		System.out.println("Multiplication:\n");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0;k<3;k++) {
					d[i][j]+= (a[i][k] * b[k][j]);
				}
				System.out.print(d[i][j] + "\t");
				
			}
			System.out.println();
		}  
	}
	
}
