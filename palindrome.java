public class palindrome
{
public static void main(String[] args)
{
String s="MADAM";
boolean flag=true;

for(int i = 0; i < s.length()/2; i++)
{
if(s.charAt(i)!= s.charAt(s.length()-i-1))
{
flag=false;
break;
}
}
if(flag)
{
System.out.println("is a palindrome");
}
else
{
System.out.println("is not a palindrome");
}
}
}