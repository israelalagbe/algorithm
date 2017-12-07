public class InsertionSearch
{
	public static void main(String[] args){
		int holePosition;
		int valueToInsert;
		int A[]={14,33,27,10,35,19,42,44};
		for(int i=1;i<A.length;i++){
			valueToInsert=A[i];
			holePosition=i;
			while(holePosition>0&&A[holePosition-1]>valueToInsert){
				A[holePosition]=A[holePosition-1];
holePosition=holePosition-1;
			}
		A[holePosition]=valueToInsert;
		
		
		}
for(int i:A)System.out.print(i+",");

	}
}