public class countingcharacters
{
public static void main (String[] args)
{
String s="T SAI KIRAN";
int i,count=0;
for(i=0;i<s.length();i++)
{
if(s.charAt(i)!=' ')
{
count++;
}
}
System.out.println(count);
}
}