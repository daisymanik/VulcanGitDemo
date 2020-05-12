package testProject1.Package;

/*public class overload1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/




class overloadtest

{
        int x;
 	int y;
        void add(int a) 
        {
            x =  a + 1;
        }
        void add(int a, int b)
        {
            x =  a + 2;
        }        
    }    

class overload1 
{
    public static void main(String[] args)
    {
    	overloadtest obj = new overloadtest();   
        int a = 0;
        obj.add(9);
        System.out.println(obj.x);     
    }
}
