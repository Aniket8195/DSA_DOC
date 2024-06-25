  
        int low=0;
        int high=n-1;
        int minIdx=0;
        while(low<=high)
        {
            if(arr[low]<=arr[high])
            {
                if(arr[minIdx]>arr[low])
                     minIdx=low;
                break;
            }
            
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid])
            {
                if(arr[minIdx]>arr[low])
                     minIdx=low;
                low=mid+1;
            }
            else
            {
                if(arr[minIdx]>arr[mid])
                     minIdx=mid;
               high=mid-1;
            }
        }
        
        return minIdx;
