class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        int floor=Integer.MIN_VALUE;
        int ceil=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
           if (arr[i] <= x && arr[i] > floor) {
                floor = arr[i];
            }
            if (arr[i] >= x && arr[i] < ceil) {
                ceil = arr[i];
            }
        }
        if(floor==Integer.MIN_VALUE){
            floor=-1;
        }
        if(ceil==Integer.MAX_VALUE){
            ceil=-1;
        }
        return new Pair(floor,ceil);
    }
}
