while(i<n && j<m){
  if(arr1[i]<arr2[j]) {
    res.add(arr1[i++]);
  }else if(arr2[j]<arr1[i]){
    res.add(arr2[j++]);
  }else{
    res.add(arr2[j++]);
    i++;
  }
}
while(i<n){
  res.add(arr1[i++]);
}
while(j<m){
  res.add(arr2[j++]);
}


// if the question is of giving elements without repeting then following is the code
import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
       List<Integer>res=new ArrayList<>();
       HashMap<Integer,Integer>ans=new HashMap<>();
       for(int i=0;i<a.length;i++){
          ans.put(a[i], ans.getOrDefault(a[i], 0)+1);
       }
       for(int j=0;j<b.length;j++){
          ans.put(b[j], ans.getOrDefault(b[j],0)+1);
       }
       for(Map.Entry<Integer,Integer>mapElement:ans.entrySet()){
           res.add(mapElement.getKey());
       }
       return res;
    }
}
