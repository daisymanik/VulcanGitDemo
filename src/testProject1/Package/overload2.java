package testProject1.Package;

/*public class overload2 {

}*/

class A 
{
int i;
void display() 
{
    System.out.println(i);
}
} 

class B extends A 
{
int j;
void display() 
{
    System.out.println(j);
}
}  


class overload2 
{
public static void main(String args[])
{
    B obj = new B();
   obj.i=1;
    obj.j=4;   
   obj.display();     
}
}

