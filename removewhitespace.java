public class removewhitespace
{
public static void main(String[] args)
{

String s="hi i am Sai Kiran";
s = s.replaceAll("\\s+", "");   

System.out.println(s);
}
}