class cmdlinetest
{
 public static void main(string args[])
 {
  int count,i=0;
  count=args.length;
  system.out.println("no of arguments=",+count);
  
  while(i<count)
  {
   system.out.println("value=",+args[i]);
   i++;
   }
  }
 }