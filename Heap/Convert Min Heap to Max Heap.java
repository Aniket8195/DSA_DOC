class Solution {
    static void convertMinToMaxHeap(int n, int arr[]) {
    // code here
        for(int i=(n/2)-1;i>=0;i--){
            restoreDown(arr,i,n);
        }
  }
   public static void restoreDown(int arr[],int i,int size){
      int lChild = (2*i)+1,rChild = (2*i)+2;
      int num = arr[i];
      while(rChild<=size-1){
          if(num>=arr[lChild] && num>=arr[rChild]){
              arr[i] = num;
              
              return ;
          }else if(arr[lChild]<arr[rChild]){
              arr[i] = arr[rChild];
              i = rChild;
          }else{
              arr[i] = arr[lChild];
              i = lChild;
          }
          lChild = (2*i)+1;
          rChild = (2*i)+2;
      }
      if(lChild == size-1 && num<arr[lChild]){
          arr[i] = arr[lChild];
          i = lChild;
      }
      arr[i] = num;
  }
}
