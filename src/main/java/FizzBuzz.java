public class FizzBuzz {
  public static void print(int n){
    for(int i=1;i<=n;i++){
      if(i%3==0)
        System.out.print("Fizz");
      if(i%5==0)
        System.out.print("Buzz");
      if(i%3!=0 && i%5!=0)
        System.out.print(i);
      System.out.println();
    }
  }
}
