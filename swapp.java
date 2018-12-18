import java.util.Scanner;
//Swaping without temp

class A{

public static void main(String gs[]){

int x,y;

System.out.println("Eneter x and Y value");

Scanner n=new Scanner(System.in);

x=n.nextInt();
y=n.nextInt();

System.out.println("Before Swaping");
System.out.println("x="+x+ "\ny="+y);

x=x+y;
y=x-y;
x=x-y;

System.out.println("After Swaping");
System.out.println("x="+x+ "\ny="+y);


}
}

