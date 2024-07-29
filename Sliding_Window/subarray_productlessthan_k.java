package SlidingWindow;

public class subarray_productlessthan_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 10;
		int nums[] = {1,2,3,4,5};
		int ans=0;
        int product=1;
        int end=0;
        int start=0;
        while(end<nums.length){
            //grow
            product*=nums[end];

            //shrink
            //si<=ei --> because if k is 0 and we have product initialised by 1. So product/k = 1/1;start++;  then 1/2 but 2 was never part of our window so we have to add condition such that start is less than end.Agar ye condition add nhi krte toh start increase hota jata and ek time baad array se bada number access krta jo exist nhi krta , thus index out of bounds
            while(product>=k && start<=end){
                product=product/nums[start];
                start++;
            }
            // windowsize = end-start+1;
            //ans update
            ans= ans + end-start+1;
            //Ex - [1,2,3,4,..]
            // adding window size to answer, kyuki pehle humne first element liya ek subarray ban gya .phir jab humne doosra element liya toh usse do subaaray banega ek 2 aur ek pichle subaaray me add hoke banega. ex second element 2 tha toh e subarray 2 aur ek last subarray jo ki 1 tha uske piche lagke banage 12. Similarily jab third element pick karenge tab jo ki 3 h, toh isse ek subarray 3 banega aur baaki pichle subarray me add hoke banega ex last subarray thu 12 and 2 toh ab 3 ke saath subarray banegi 3 23 123. aur 1 se leke 3 tak size 3 aur 3 subarray bani jo ki equal to window size h . toh humne answer me window size add kiya.  
            // 1 , 12 2 , 123 23 3, 1234 234 34 4,......
            end++;
        }
       System.out.println(ans);
	}

}
