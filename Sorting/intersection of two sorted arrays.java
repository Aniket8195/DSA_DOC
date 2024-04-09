while(i<n && j<m){
  if(arr1[i]<arr2[j]) {
    i++;
  }else if(arr2[j]<arr1[i]){
   j++
  }else{
    res.add(arr2[j++]);
    i++;
  }
}
