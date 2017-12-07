public class LinearSearch
{
	
public static void main(String[] args)	{
	int x=0;//Element we are searching for
	int i=0;//index
	int []A={5,3,9,4};
	int n=A.length;//length of the elements
while(true){
	if (i>n-1){System.out.println("Element not found");
	return;
	}
	else{
		if(	A[i]==x)
	{	System.out.println("Element "+x+ " found at index " +i);
		return;
		}
	}
	i++;
	
	}

}
}