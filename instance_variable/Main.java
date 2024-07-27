/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class A{
    int a=100;
    //char c= 98;
}
public class Main
{
    char c= 98;//within a class outside the function variable is instance variable.acess within a function
              // by object and constructor
	public static void main(String[] args) {
	    A ob= new A();
	    Main obj= new Main();
	    System.out.println(obj.c);
		System.out.println(ob.a);
	}
}
