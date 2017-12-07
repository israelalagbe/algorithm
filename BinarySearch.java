public class BinarySearch
{
	public static void main(String[] args){
		int x=31;
		int[] A={10,14,19,26,27,31,33,35,42,44};
		int low,high,mid;
		low=0;high=A.length;
		while(true){
			if(high<low){
	System.out.println("Element not found");
	return;
			}
			mid=low+(high-low)/2;
		if(A[mid]<x) low=mid+1;
		
		else	if(A[mid]>x) high=mid-1;
		
		else if(A[mid]==x) {
		System.out.println(x+ " found at location "+mid) ;
		return;
			}
}
		
	}
}