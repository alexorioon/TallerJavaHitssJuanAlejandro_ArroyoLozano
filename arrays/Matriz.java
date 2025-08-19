package arrays;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[3][2];
        int[][] matriz1 ={
            {1, 2, 3},
            {4, 5, 6, 7},
            {8, 9}
        };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }

        for (int[] fila : matriz1) {
            for (int elemento : fila) {
                System.out.print(elemento + "  ");
            }
            System.out.println();
        }
    }
}
