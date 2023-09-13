public class Palindrome{
public static void main(String args[]){
int n=1221;
int num=n;
int reverse=0;
while(n>0){
 int remainder=n%10;
 reverse=(reverse*10)+remainder;
 n=n/10;
}
if(num==reverse){
System.out.println(num+" is a Palindrome number");
}else{
System.out.println(num+" is not a Palindrome number");
}
}
}