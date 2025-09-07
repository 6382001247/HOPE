abstract class shape
{
int dim1,dim2;
shape(int d1,d2);
{
this.dim1=d1;
this. dim2=d2;
}
}
class rectangle extends shape
{
recangle(int lenght,int breadth);
{
 super(lenght,breadth);
 }
 void printarea()
 {
 int area=dim1*dim2;
 System.out.println("area of rectangle"+area);
 }
 }
 class triangle extends shape
 {
 triangle(int base,int height);
 {
 super(base,height);
 }
 void printarea()
 {
 double area= 0.5*dim1*dim2;
 System.out.println("area of triangle"+area);
}
}
class circle extends shape
{
circle(int radius);
{
super (radius,radius);
}
void printarea()
{
double area= math.pi*dim1*dim2;
System.out.println(" area of a circle"+area);
}
}
public class main
{
public static void main(String ar[])
{
Recangle rectangle= new rectangle(10,5);
rectangle=printarea();
Triangle triangle=new triangle (10,8);
triangle= printarea();
Circle circle=new circle(7);
circle=printarea();
}
}
