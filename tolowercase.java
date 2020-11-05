public class tolowercase
{
public static void main(String [] args)
{
String s="HI I am Sai Kiran";
StringBuffer newStr=new StringBuffer(s);
int i;
for(i=0;i<s.length();i++)
{
if(Character.isUpperCase(s.charAt(i)))
{
newStr.setCharAt(i, Character.toLowerCase(s.charAt(i)));
}
}
System.out.println(newStr);
}
}