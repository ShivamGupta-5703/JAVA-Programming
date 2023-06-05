package Stack;
//Array ke stack ko dynamic bana rhe hein.  //sirf push function update krna h.
public class Dynamic_Stack extends Stack{
		@Override
		public void push(int item) throws Exception{
			if(isFull()) {          //bina super ke bhi access kar skte,kyuki dynamic stack class me isfull exist nhi karta,but isFull dynamic stack me exist krta in that case super ke through hi stack ka isFull access karna padta.
				//yaha koi conflict nhi h so no problem
				
				
				//agar array full hota h,toh naya array built karenge twice the size of previous array and phir purani array ke elements nai array me copy karenge. 
				int newarr[] = new int[2*arr.length];
				
				for(int i=0;i<arr.length;i++) {
					newarr[i] = arr[i];
				}
				arr=newarr;     //isse arr me newarr ka address aa gya , aur space occupied by arr will be released.
				//another reason arr datamember is used.
			}
			
			//baaki code copy nhi karenge //because it increases data redundancy.
			
			super.push(item);
			
			//agar this use kiya toh dynamic stack ka method acess hoga but hume stack class me jana h for rest of the code.
			//For this we use super keyword.
		}

}
