public String backAround(String str) {
  
  String attach;
  
  if(str.length()<1){
    
    attach = str;
  }
  else
  {
    attach = str.substring(str.length()-1);
  }
  return attach+str+attach;
}
