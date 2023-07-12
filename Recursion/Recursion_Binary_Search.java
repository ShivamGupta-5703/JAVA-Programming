package Recursion;

import java.util.Scanner;

public class Recursion_Binary_Search {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int[]arr =new int[n];
        for (int i =0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int item=sc.nextInt();
        Search(arr,item,0,arr.length-1);
    }

    public static void Search(int []arr,int item,int lo,int hi) {
        int mid=(lo+hi)/2;
        if (lo>hi){
            return ;
        }
        if (arr[mid]==item){
            System.out.println(mid);
        }
        if (arr[mid]>item){
            Search(arr,item,lo,mid-1);
        }
        else {
            Search(arr,item,mid+1,hi);
        }

    }
}
