import java.util.Scanner;
public class Forloop2{
public static void main(String args[]){
int result=1;
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
int n=s.nextInt();	
for(int i=1;i<=n;i++){
result=result*i ;
}
System.out.println(result);
}
}

