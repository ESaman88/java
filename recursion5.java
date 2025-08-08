public class recursion5{
  public static int calPower(int x,int n){
    if(n==0){
      return 1;
    }
    if(n==0){
      return 0;
    }
    int xnm1=calPower(x, n-1);
    int xpow=x*xnm1;
    return xpow;
  }
  public static void main(String[] args) {
    int x=2,n=5;
    int ans=calPower(x, n);
    System.out.println(ans);
  }
}