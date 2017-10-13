
public class EvenOdd {

	public static void main(String[] args) {
		int arr[] = {1,1,1,3,22,2,2,2,3,1,1,2,2,434,0,5,2,7,76,676};
		int evenIndex=0, oddIndex=0;
		boolean oddInProgress = false;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0 && !oddInProgress){
				oddIndex = i;
				oddInProgress = true;
			}
			if(arr[i]%2==0){
				evenIndex = i;
				if(evenIndex>oddIndex){
					int temp = arr[oddIndex];
					arr[oddIndex] = arr[evenIndex];
					arr[evenIndex] = temp;
					i = oddIndex;
					oddInProgress = false;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
