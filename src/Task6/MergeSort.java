package Task6;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] a,int left,int right){
        if(right<left)
            return;
        int mid=(left+right)/2;
        mergeSort(a,left,mid);
        mergeSort(a,mid+1,right);
        merge(a,left,mid,right);
    }
    public static void merge(int[]a,int left,int mid,int right){
        int lenghtleft=mid-left+1;
        int lenghtright=right-mid;

        int leftAr[]=new int [lenghtleft];
        int rightAr[]=new int [lenghtright];

        for(int i=0;i<lenghtleft;i++){
            leftAr[i]=a[left+i];
        }
        for(int i=0;i<lenghtright;i++){
            rightAr[i]=a[mid+i+1];
        }
    }
}
