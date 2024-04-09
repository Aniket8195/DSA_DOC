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
