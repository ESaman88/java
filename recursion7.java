public class recursion7 {
  public static void towerofhannoi(int n,String src,String helper,String dest){
    if(n==1){
      System.out.println("transfer disk "+ n+"from"+ src+" to "+ dest);
      return ;
    }
    towerofhannoi(n-1, src, dest, helper);
    System.out.println("transfer disk "+ n+"from"+ src+" to "+ dest);
    towerofhannoi(n-1, helper, src, dest);
  }
  public static void main(String[] args) {
    int n =3;
    towerofhannoi(n,"S","H","D");
  }
}
