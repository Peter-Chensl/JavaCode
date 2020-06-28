package homework;

public class demo2 {
	public static void main(String[] args) {
		int[] arr = {2,8,5,3,4,6};
		selectSort(arr);
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void selectSort(int[] arr) {
		for(int i = 0; i < arr.length-1;i++ ) {
			for(int j = i + 1;j< arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
