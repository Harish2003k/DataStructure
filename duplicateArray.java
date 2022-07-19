public class duplicateArray {
	public static void main(String args[]) {
		int arr[]= {0,1,2,3,1,5,2,3,1};
		for(int i=0;i<arr.length;i++) { // tranverse in array
			arr[arr[i]%arr.length]=arr[arr[i]%arr.length]+arr.length;
		}
		System.out.println("repeating element are:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=arr.length*2) {
				System.out.println(i+ "");
			}
		}
	}

}
