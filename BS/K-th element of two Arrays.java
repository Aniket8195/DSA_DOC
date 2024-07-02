class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int i=0,j=0;
        int cnt=1;
        
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                if(cnt==k) return arr1[i];
                i++;
            }else{
                if(cnt==k)return arr2[j];
                j++;
                
            }
            cnt++;
        }
        while(i<n){
            if(cnt==k) return arr1[i];
            i++;
            cnt++;
            
        }
        while(j<m){
            if(cnt==k)return arr2[j];
            j++;
            cnt++;
        }
        return -1;
        
        
    }
}
