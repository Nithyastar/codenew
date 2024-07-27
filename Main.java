/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   int rows= scan.nextInt();
	   int cols= scan.nextInt();
	   int a[][] = new int[rows][cols];
	   for(int i=0;i<rows;i++){
	       for(int j=0;j<cols;j++){
	           a[i][j]=scan.nextInt();
	       }
	   }
	   for(int i=0;i<rows;i++){
	       for(int j=0;j<cols;j++){
	           System.out.println(a[i][j]);
	       }
	   }
	}
}
