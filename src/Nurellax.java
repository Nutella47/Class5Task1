public class Nurellax {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 9; i >= 0; i--) {
            array[9-i] = i;
        }
        for (int arr : array) {
            System.out.println(arr);
        }
    }
}
