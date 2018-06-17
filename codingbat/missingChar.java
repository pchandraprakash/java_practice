public String missingChar(String str, int n) {
  String s1 = str.substring(0,n);
  String s2 = str.substring(n+1, str.length());
  return s1+s2;
}
