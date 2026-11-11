public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int numOdd = 0;
        int PrevPrev = 0;
        int Prev = 0;
        int currfib = 1;

        for (int i = 0; i < x; i++) {
            currfib += PrevPrev;
            currfib += Prev;
            if (currfib % 2 != 0) {
                numOdd += 1;
            }
            System.out.print(currfib);
            PrevPrev = Prev;
            Prev = currfib;
            currfib = 0;
            System.out.print(" "); 
    }
        System.out.println();
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
