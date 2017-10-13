/*public class StocksProfit{
	public static void main(String args[]){
		//int profitForDays[] = {100,200,50};
		int profitForDays[] = {100,-100};
		int maxProfit = 0, minSellingPrice = profitForDays[0];
		for(int i=1;i<profitForDays.length;i++){
			if(minSellingPrice<profitForDays[i]){
				if(maxProfit<profitForDays[i] - minSellingPrice){
					maxProfit = profitForDays[i] - minSellingPrice;
				}
			}else{
				minSellingPrice = profitForDays[i];
			}
		}
		System.out.println("maxProfit:"+maxProfit);
		
	}
} */

public class StocksProfit {
	public static void main(String[] args){
	//	int arr[] = {100,20,30,40,110,500};
		int arr[] = {100,-100};
		int min=arr[0], max=0, diff = 0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min = arr[i];
			}
			if(arr[i]>max){
				max = arr[i];
				if(diff<(max-min))
					diff=max-min;
			}
			max = 0;
		}
		System.out.println("Maximun profit which is gettable is"+diff);
	}
}