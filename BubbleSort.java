
import java.util.Arrays;
public class BubbleSort
{
	 public static void main(String []args){
int[] A={14,33,27,35,10};
boolean swapped=false;
for(int i=0;i<A.length;i++){
	for(int j=0;j<A.length;j++){
		if(j>=A.length-1)break;
		if(A[j]>A[j+1]){
			Arrays.sort(A,j,j+2);
			swapped=true;
		}
		if(swapped=false) break;
	}
}
for(int i:A)System.out.println(i);	
}
}