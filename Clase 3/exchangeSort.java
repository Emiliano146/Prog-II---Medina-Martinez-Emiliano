public class exchangeSort {
    public static void main(String[] args) {

        int[] burbuja = {3,5,9,2,1,6,0,7};

        System.out.print("Burbuja original: ");

        for (int num : burbuja) {
            System.out.print(num + " ");
        }

        // Ordenamiento

        for (int i = 0; i < burbuja.length; i++) {
            for (int j = 0; j < burbuja.length; j++) {

                if (burbuja[i] > burbuja[j]) {

                    //DEBUG//
                    System.out.println("Intercambiando " + burbuja[i] + " (i = burbuja[" + i + "]) con " + burbuja[j] + " (j = burbuja[" + j + "])");
                    //DEBUG//


                    int temp = burbuja[i];
                    burbuja[i] = burbuja[j];
                    burbuja[j] = temp;

                } 
            }
        }

        System.out.print("\nBurbuja ordenada: ");

        for (int num : burbuja) {
            System.out.print(num + " ");
        }
    }
}