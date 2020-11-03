public class subsets
{
public static void main(String[] args)
{
int temp =0,i,j;
String s="SAi";
int len=s.length();
String arr[]=new String[len*(len+1)/2];

for(i=0;i<len;i++)
{
for(j=i;j<len;j++)
{
arr[temp]=s.substring(i,j+1);
temp++;
}
}


for(i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}}