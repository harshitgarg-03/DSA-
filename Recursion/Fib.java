
public class Fib {

    public static int CalulateFibonacchi(int Firstnum, int Secondnum, int term, int sum) {
        if (term < 1) {
            return 0;
        }

        int Firstn = Firstnum;
        int Secondn = Secondnum;

        int Thirdn = (Firstn + Secondn);
        int overallsum = (Firstn+sum);
        return Firstn + CalulateFibonacchi(Secondn, Thirdn, term-1, overallsum); // calaulte sum of all fibonaaci term 
        
        // System.out.print(overallsum + " ");  // calculate all fibonacci term 

    }

    public static void main(String args[]) {
        int term = 5;
        if (term == 1) {
            System.out.println("Fibonacci sum is " + 0);
            return;
        }
        if (term == 2) {
            System.out.println("Fibonacci sum is " + 1);
            return;
        }
        int sum = CalulateFibonacchi(0, 1, term, 0);
        System.out.println(" sum is "+ sum);
    }
}