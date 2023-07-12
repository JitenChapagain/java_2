public class Prime_number {
    public static void main(String[] args) {
        printprimeBetween(1,50);
    }
    public static boolean isprime(int n){
        for (int i=2; i<=n/2; i++)
            if (n%i==0)
                return false;
        return true;
    }
    public static void printprimeBetween(int start, int end)
    {
        for(int i=start; i<=end; i++)
            if (isprime(i))
                System.out.print(i+" ");
    }
}
