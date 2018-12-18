import java.util.Scanner;
class R{
public static void main(String gs[]){

String original,reverse ="";

System.out.println("String Name\n");

Scanner in = new Scanner(System.in);

original=in.nextLine();

int length=original.length();

for(int i=length-1;i>=0;i--)

reverse=reverse+original.charAt(i);

System.out.println("\nReverse String=\n\n"+reverse);


}

}