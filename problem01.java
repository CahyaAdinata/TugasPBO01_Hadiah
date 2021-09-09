public class problem01 {
    public static void main(String[] args) {
        int bilangan = 3 , check = 0;
        for (int i = 1; i <= bilangan; i++) {
            if (bilangan % i == 0) {
                check++;
            }
        }
        if (check == 2) {
            System.out.println("Bilangan " + bilangan + " adalah prima ");
        } else {
            System.out.println("Bilangan " + bilangan + " adalah bukan prima ");
        }
    }
}
