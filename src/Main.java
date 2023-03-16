public class Main {
    public static void main(String[] args) {
        int[] tab = {-7,2,5,-1,4};
        selectionSort(tab);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Przechodzimy przez całą tablicę
        for (int i = 0; i < n - 1; i++) {
            // Znajdujemy najmniejszy element w pozostałej części tablicy
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Zamieniamy najmniejszy element z elementem na pozycji i
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
        // Wyświetlamy posortowaną tablicę
        System.out.print("Posortowana tablica: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}