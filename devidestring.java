public class devidestring
{
public static void main(String [] args)
{
String s="aaaabbbbccccdddd";
int len=s.length();
int i, a=4;
int temp=0,noofchar=len/a;
String equalstring[]=new String[a];

if(len%a!=0)
{
System.out.println("con't be devided");
}
else
{
for( i=0;i<len;i=i+noofchar)
{
String str=s.substring(i,i+noofchar);
equalstring[temp]=str;
temp++;
}

for(i=0;i<equalstring.length;i++)
{
System.out.println(equalstring[i]);
}
}
}
}