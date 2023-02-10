import java.io.*;
class Matrix{
	public static void addition(int m1[][],int m2[][]){
		int n=m1.length;
		int m=m1[0].length;
		int ans[][]=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				ans[i][j]=m1[i][j]+m2[i][j];
			}
		} 
		printArray(ans);
	
	}
	public static void subtraction(int m1[][],int m2[][]){
		int n=m1.length;
		int m=m1[0].length;
		int ans[][]=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				ans[i][j]=m1[i][j]-m2[i][j];
			}
		} 
		printArray(ans);
	
	}
	public static void multiplication(int m1[][],int m2[][]){
		int n=m1.length;
		int m=m1[0].length;
		int ans[][]=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				ans[i][j]=0;
				for(int k=0;k<m;k++){
					ans[i][j]=ans[i][j]+(m1[i][k]*m2[k][j]);
				}
			}
		} 
		printArray(ans);
	
	}
	public static void printArray(int m[][]){
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[0].length;j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]){
		Console con=System.console();
		System.out.println("Enter the row and column for matrix1-->");
		int n1=Integer.parseInt(con.readLine());
		int m1=Integer.parseInt(con.readLine());
		System.out.println("Enter the row and column for matrix2-->");
		int n2=Integer.parseInt(con.readLine());
		int m2=Integer.parseInt(con.readLine());
		
		int matrix1[][]=new int[n1][m1];
		int matrix2[][]=new int[n2][m2];
		
		System.out.println("Enter the elements of matrix1-->");
		for(int i=0;i<n1;i++){
			for(int j=0;j<m1;j++){
				matrix1[i][j]=Integer.parseInt(con.readLine());
			}
		}
		System.out.println("Enter the elements of matrix2-->");
		for(int i=0;i<n2;i++){
			for(int j=0;j<m2;j++){
				matrix2[i][j]=Integer.parseInt(con.readLine());
			}
		}

		System.out.println("The addition of two matrix is-->");
		addition(matrix1,matrix2);
		System.out.println("The subtraction of two matrix is-->");
		subtraction(matrix1,matrix2);
		System.out.println("The multiplication of two matrix is-->");
		multiplication(matrix1,matrix2);
		
	}
}