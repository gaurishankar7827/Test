import java.util.Scanner;
class A{
public static void main(String[] args){

int x,y,temp;

System.out.println("Enter value of X and Y");

Scanner n=new Scanner(System.in);

x=n.nextInt();
y=n.nextInt();

System.out.println("Before swaping");
System.out.println("x="+x+"\ny="+y);

temp=x;
x=y;
y=temp;


System.out.println("Before swaping");
System.out.println("x="+x+ "\ny="+y);


}
}