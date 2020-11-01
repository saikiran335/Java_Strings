public class countvowels
{
public static void main (String [] args)
{
int i,vowelcount=0,concount=0,count=0;
String s="my name is sai kiran welcome to my world";
s=s.toLowerCase();

for(i=0;i<s.length();i++)
{
if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u')
{
vowelcount++;
}

else if(s.charAt(i)>='a' && s.charAt(i)<='z')
{
concount++;
}
if(s.charAt(i)!=' ')
{
count++;
}
}

System.out.println("no of vowels :" +vowelcount);
System.out.println("no of consonents :" +concount);
System.out.println("no of characters :" +count);
}
}