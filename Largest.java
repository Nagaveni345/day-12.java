class Largest
{
static int max(int a,intb,intc)
{
if(a>b&&a>c)
return a;
else if(b>a&&b>c)
return b;
else
return c;
}
public static void main(String[]args)
{
int result=max(10,25,15)
System.out.println(result);
}
} 
