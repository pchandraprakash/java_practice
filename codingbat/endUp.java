public String endUp(String str) {
  if(str.length()<=3){
    return str.toUpperCase(); 
  }
  int x = str.length()-3;
  String front = str.substring(0,x);
  String back = str.substring(x);
  return front + back.toUpperCase();
}