public String frontBack(String str) {
  
  if (str.length() <= 1) return str;
  
  char s1 = str.charAt(str.length()-1);
  char s2 = str.charAt(0);
  String s3 = str.substring(1, str.length()-1);
  
  return s1+s3+s2;
  
}
