public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args[0]);
        boolean [] prime = new boolean [n + 1];
        int counter = 0;
        for (int i = 0; i < prime.length; i++) prime[i] = true;
        prime[0] = false;
        prime[1] = false;
        for(int p = 2; p*p <=n; p++)
        {
            if(prime[p] == true)
            {
                for(int i = p*p; i <= n; i+=p)
                    prime[i] = false;
            }
        }
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) 
        {
            if(prime[i] == true)
            {
                System.out.println(i);
                counter++;
            }
        }
        double sum = ((double) counter/n)*100;
        int Rsum = (int) sum;
        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + Rsum +"% are primes)");
    }
}