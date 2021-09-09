public class problem03 {
    public static int binSearch(int[] list, int target) {
        int kiri = 0;
        int kanan = list.length - 1;

        while (kiri <= kanan) {
            int tengah = (kiri + kanan) / 2;
            if (target < list[tengah]) {
                kanan = tengah - 1;
            } else if (target > list[tengah]) {
                kiri = tengah + 1;
            } else {
                return tengah;
            }
        }
        return -1;
    }
}