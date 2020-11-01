
import java.util.Arrays;
public class anagram
{
public static void main(String[] args)
{
String s1="cheep";
String s2="peech";
s1=s1.toLowerCase();
s2=s2.toLowerCase();

if(s1.length()!=s2.length())
{
System.out.println("it is not anagram");
}
else
{
char[] str1=s1.toCharArray();
char[] str2=s2.toCharArray();

Arrays.sort(str1);
Arrays.sort(str2);

if(Arrays.equals(str1,str2)==true)
{
System.out.println("is an anagram");
}
else
{
System.out.println("is not anagram");
}
}
}
}