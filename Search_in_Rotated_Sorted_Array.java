import java.util.Scanner;
public class searchinrotatedsortedarray {
    public static int findElement(int arr[],int ele)
    { 	for(int i=0;i<arr.length;i++)
    	{
    		if(ele==arr[i])
    			return i;
    	}
    	return -1;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,x[],key;
		n=sc.nextInt();
		x=new int[n];
		for(i=0;i<n;i++)
			 x[i]=sc.nextInt();
        key=sc.nextInt();
        int result=findElement(x,key);
        if(result==-1)
        	System.out.println("-1");
        else
        	System.out.println(result);
	}
}