import java.util.Arrays;

public class burbuja {
    public static void main(String[] args) {
        int[] matriz = {0,3,1,4,2,7,8,5};
        for (int n = 1; n < matriz.length; n++) {
            for (int i = 0; i < matriz.length - n; i++) {
                if (matriz[i] > matriz[i+1]) {
                    int temp = matriz[i+1];
                    matriz[i+1] = matriz[i];
                    matriz[i] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(matriz));
    }
}
