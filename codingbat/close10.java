public int close10(int a, int b)
{
  int x = Math.abs(10-a);
  int y = Math.abs(10-b);
  
  if(x > y)
  {
    return b;
  }
  if(x < y)
  {
    return a;
  }
  return 0;
}
