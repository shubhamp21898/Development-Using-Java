import java.util.*;

class Searching
{
    public void Change(int Arr[])
    {
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]++;
        }
    }
}
class Program256
{
    public static void main(String ar[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sobj.nextInt();

        int Arr[]=new int[size];

        System.out.println("Enter the elements");
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }
        System.out.println("Enter the elements to search ");
        int value=sobj.nextInt();

        Searching obj=new Searching();

        obj.Change(Arr,value);
 
        System.out.println("Data after changing");
		for(int i = 0 ; i < Arr.length; i++)
		{
			System.out.println(Arr[i]);
		}
    }
}