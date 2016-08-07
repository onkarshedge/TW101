import java.util.ArrayList;
import java.util.List;

public class primeFactors {
  public static List<Integer> getPrimeFactors(int n) {
    List<Integer> primeFactors = new ArrayList<Integer>();
    for(int i=2;i*i<=n;i++){
      while (n%i == 0){
        n/=i;
        primeFactors.add(i);
      }
    }
    if(n>=2)
      primeFactors.add(n);
    return primeFactors;
  }
}
