/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int[] arr = new int[5];
		int[] arr1={2, 1,3,6,5};
	    int[] arr2 = new int[5];
		for(Integer val:arr1){
		    System.out.println(val);
		}
		int len =arr1.length;
		System.out.println("length " +len);
		Arrays.sort(arr1);
		for(Integer val:arr1){
		    System.out.println(val);
		}
		Arrays.fill(arr2,5);
		for(Integer val:arr2){
		    System.out.println(val);
		}
	}
}
