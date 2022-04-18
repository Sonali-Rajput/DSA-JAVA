// newton Raphson method -> root of a num n = x + n/x divide by 2.
// x is the closest value to root that we assume.
public class Sqaure_rootNewton {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    static double sqrt(double n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n/x)); //newton raphson method

            if (Math.abs(root - x) < 1) { //you can change the precision value to  small as you can.(try 1 to 0.5)
                break; //we checking for error (root-x ->error)
            }

            x = root;
        }
        return root;
    }
}

