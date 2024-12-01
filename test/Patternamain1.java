public class Patternamain1 {
    public static void main(String[] args) {
        // Print the upper half of the pattern
		int n=1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n++);
                if (j < i) {
                    System.out.print(" * ");
                }
				
            }
            System.out.println();
        }
        
        // Print the lower half of the pattern
		int p=4;
        for (int i = 4; i >= 1; i--) {
		
            for (int j = 1; j <= i; j++) {
                System.out.print(p++);
                if (j < i) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}