public class MinMax{

	//n:size of array

	static int[] getMinMax(int arr[],int n){
		int i;
		int max =0,min=0;

		if(n==0){
			// max = 0;
			// min = 0;

			return new int[]{min,max};
		}

		//if there is only one element then retirn it as min amd max both
		if(n==1){
			max = arr[0];
			min = arr[0];
			return new int[]{min,max};
		}

		//If there are more than one element ,then initialize min & max
		if (arr[0]>arr[1]) {
			max = arr[0];
			min = arr[1];
		}else{
			max = arr[1];
			min = arr[0];
		}

		//if the current element if greater than max element 
		for (i=2;i<n;i++) {
			if(arr[i]>max){
				max = arr[i];
			}else if (arr[i] < min) {
				min = arr[i];
			}
		}
		return new int[]{max,min};
	}
	public static void main(String[] args) {

		int arr[] = {1000,11,445,1,330,3000};
		int arr_size = 6;

		int[] minmax = getMinMax(arr,arr_size);
		System.out.println("\nMinimum element is :: "+minmax[1]);
		System.out.println("\nMaximum element is :: "+minmax[0]);
	}
}