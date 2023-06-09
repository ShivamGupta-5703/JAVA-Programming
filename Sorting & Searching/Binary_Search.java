
public class Binary_Search {
	public static void main(String[] args) {
		int item = 14;
		int n[] = {2,5,8,9,12,14,15,16,17};
		System.out.println(Search(n,item));

	}
	public static int Search(int n[],int num) {
		int start=0;
		int end = n.length-1;
		while(start<=end) {         // for(;start<=end;){}
			int mid= (start+end)/2;
			if(num==n[mid]) {
				return mid;
			}
			else if (num<n[mid]) {
				end = mid-1;
			}
			else {  //num>mid
				start = mid+1;
			}
		}
		return -1;
	}
}
