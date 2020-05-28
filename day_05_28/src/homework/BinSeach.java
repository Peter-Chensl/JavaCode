package homework;

//ÕÛ°ë²éÕÒ
public class BinSeach {
//	public static void main(String[] args) {
//		int[] arr = {1,3,4,5,7,9};
//		int idex = binSeacher(arr ,5);
//		System.out.println(idex);
//	}
	public static int binSeacher(int[] arr,int key) {
		int min = 0;
		int max = arr.length -1;
		int mid  = 0;
		while(min <= max) {
			mid = (min + max) / 2;
			if(key > arr[mid]) {
				min = mid + 1;
			}else if(key < arr[mid]) {
				max = mid - 1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	//Ñ¡ÔñÅÅĞò
	public void selectSort(int[] arr) {
		for(int i = 0;i < arr.length; i++) {
			for(int j = i + 1; j < arr.length;j++) {
				int temp = 0;
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public void print(int[] arr) {
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
