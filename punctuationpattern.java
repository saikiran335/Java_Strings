public class punctuationpattern
{
public static void main(String [] args)
{
int i,j;
int row=10;
int col=10;
for(i=0;i<10;i++)
{
for(j=0;j<10;j++)
{

if(i==0 || i==9)
{
if(j>0 && j<9)

{
System.out.print("  ");
}

else
{System.out.print("* ");
}
}


if(i==1 || i==8)
{
if(j>1 && j<8)

{
System.out.print("  ");
}

else
{
System.out.print("* ");
}
}

if(i==2 || i==7)
{
if(j>2 && j<7)

{
System.out.print("  ");
}

else
{
System.out.print("* ");
}
}


if(i==3 || i==6)
{
if(j>3 && j<6)

{
System.out.print("  ");
}

else
{System.out.print("* ");
}
}



if(i==4 || i==5)
{
if(j>4 && j<5)

{
System.out.print("  ");
}

else
{System.out.print("* ");
}
}


}
System.out.println();
}
}
}