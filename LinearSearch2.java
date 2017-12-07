public class LinearSearch2
{
	 public static void main(String[] args){
		 int x=0;//Element we are searching for
	int i=0;//index
	int []A={5,3,9,4};

	for(int element:A){
		if(x==element){
			System.out.println("Element found at index "+i);
			return;
		}
	}
		System.out.println("Element not found");
	}
}