import java.util.ArrayList;

public class Solution {

    public static void mergeSort(int[] arr, int l, int r){
      if(l>=r)return;
      int mid=(l+r)/2;
      mergeSort(arr, l, mid);
      mergeSort(arr, mid+1, r);
      merge(arr,l,mid,r);

    }
   public static void merge(int arr[],int low,int mid,int high){
       ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}




// second approach without using extra space

class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    private void mergeSort(int nums[],int low,int high){
       if(low<high){
         int mid=low+(high-low)/2;
         mergeSort(nums,low,mid);
         mergeSort(nums,mid+1,high);
         merge(nums,low,mid,high);
       }
    }
    private void merge(int nums[],int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++){
         left[i]=nums[low+i];
        }
        for(int i=0;i<n2;i++){
        right[i]=nums[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=low;
        while(i<n1&& j<n2){
              if(left[i]<right[j]){
                nums[k++]=left[i++];
              }else{
                nums[k++]=right[j++];
              }
        }
        while(i<n1){
          
                nums[k++]=left[i++];
              
        }
        while(j<n2){
             nums[k++]=right[j++];
        }

    }
}
