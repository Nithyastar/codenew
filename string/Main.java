/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		String str= new String("hello");
		str="hello";
		System.out.println(str);
		StringBuilder str1= new StringBuilder("world");
		str1.append(" peace");
		System.out.println(str1);
		str1.delete(0,2);
		System.out.println(str1);
		
	}
}
