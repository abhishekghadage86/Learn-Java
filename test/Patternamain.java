public class Patternamain {
    public static void main(String[] args) {
        // Print the upper half of the pattern
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j <i) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
        
        // Print the lower half of the pattern
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}