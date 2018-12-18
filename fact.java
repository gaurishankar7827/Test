import java.util.Scanner;

class B{

public static void main(String gs[]){
int n,c,fact=1;
System.out.println("Enter Integer");
Scanner in=new Scanner(System.in);
n=in.nextInt();
if(n<0)
{
System.out.println("Number Should Not be Negative");
}else
for(c=1;c<=n;c++)
fact=fact*c;

System.out.println("Factorial is\t"+fact);





}
}