class fact {
    public static vioid main(String[] args) {
        int n, fact = 1, i = 1;
        System.out.print("enter the number");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.print(fact);

    }

}