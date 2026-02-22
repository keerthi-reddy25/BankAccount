package basic;

public class evenNumbers {
	public static void even(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
        even(arr);
	}

}
