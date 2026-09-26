package Clase7.Tema1.Ejercicio1;

public class Calculadora {

    public int operar(int num1, int num2) {
        return num1 + num2;
    }

    public double operar(double num1, double num2) {
        return num1 + num2;
    }

    public int operar(int[] nums) {
        int finalNum = 0;

        for (int i = 0; i < nums.length; i++) {
            finalNum += nums[i];
        }

        return finalNum;
    }

    
    
}
