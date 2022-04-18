import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        factors3(20);
    }

    // O(n)
    static void factors1(int n) { /*brute force way but here it grts repetative cuz 20%2 = yes , 10*2 and also 20%10 =yes , 2*10 
        here they are getting repetative so we don't need to check for 10 again (we got 10 when we divide 20/2)*/

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // O(sqrt(n))
    static void factors2(int n) { //better way
        for (int i = 1; i <= Math.sqrt(n); i++) { //cuz of repetation of nums we go till root of the n.
            if (n % i == 0) {
                if (n/i == i) {
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " " + n/i + " "); // n/i -> is same as 20/2 , 20/3 so on to get the repetative num.
                }// butthe output so not is sorted order 
            }
        }
    }

    // both time and space with be O(sqrt(n))
    static void factors3(int n) {
        ArrayList<Integer> list = new ArrayList<>(); // add the nums which are factors on n in sorted in this arraylist
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) { // add the num in list in reverse order.
            System.out.print(list.get(i) + " ");
        }
    }
}

