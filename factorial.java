import java.util.Scanner;

class factorial {
    public static void main(String args[]) {
        int n, fact = 1;
        Scanner r = new Scanner(System.in);
        System.out.print("enter the number");
        n = r.nextInt();
        while (n > 0) {
            fact = fact * n;
            n = n - 1;
        }
        System.out.print(fact);

    }

}
