package basic;

public class secondLargest {
	public static int findseclar(int[] arr) {
		int largest=Integer.MIN_VALUE;
		int secLargest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secLargest && arr[i]!=largest) {
				secLargest=arr[i];
			}
		}
		return secLargest;
	}

	public static void main(String[] args) {
		int arr[]= {10,5,20,8};
		System.out.println(findseclar(arr));

	}

}
