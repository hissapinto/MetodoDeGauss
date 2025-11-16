
import java.util.Scanner;

public class gauss {
    public static void imprimeMatriz(float[][] matriz){
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0 ; j<matriz[0].length; j++){
                System.out.printf("[%.2f] ", matriz[i][j]);
            }
            System.out.println("");
        }
    }

    public static float achaFator(float[][] matriz, int linha, int coluna){
        float fator = (matriz[linha][coluna]/matriz[coluna][coluna]); //o pivo é o de baixo
        return fator;
    }

    public static void alterarLinha(float[][] matriz, int linha, int coluna){
        float fator = achaFator(matriz, linha, coluna);
        for (int j = 0; j<matriz[0].length; j++){
            matriz[linha][j] = matriz[linha][j] - matriz[coluna][j]*fator;
        }
    }

    public static void matrizGauss(float[][] matriz){
        for(int i = 1; i<matriz.length; i++){
            for(int j = 0; j < i; j++){
                alterarLinha(matriz, i, j);
            }
        }
    }

    public static float[] resultado(float[][] matriz){
        float[] resultado = new float[matriz.length];
        
        for(int i = matriz.length-1; i >= 0; i--){
            float soma = 0;
            for(int j = i+1; j < matriz.length; j++){
                soma += matriz[i][j] * resultado[j];
            }
            resultado[i] = (matriz[i][matriz.length] - soma)/matriz[i][i];
        }
        return resultado;
    }

    public static void main(String[] args) {
        int linhas, colunas;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantas equações lineares são: ");
        linhas = scanner.nextInt();
        System.out.println("Digite quantas variáveis são: ");
        colunas = scanner.nextInt()+1;

        float[][] matriz = new float[linhas][colunas];
        for (int i = 0; i < linhas; i++){
            System.out.printf("\nPreencha os valores numéricos da equação %d.\n", (i+1));
            for(int j = 0; j < colunas; j++){
                System.out.printf("Elemento %d:\n", (j+1));
                matriz[i][j] = scanner.nextFloat();
            }
        }
        scanner.close();
        System.out.println("Matriz inicial");
        imprimeMatriz(matriz);
        matrizGauss(matriz);
        System.out.println("\nMatriz final");
        imprimeMatriz(matriz);
        float[] resultado = resultado(matriz);
        for(int i = 0; i < resultado.length; i++){
            if (Math.abs(resultado[i]) < 1e-6) resultado[i] = 0;
            System.out.printf("x%d = %.2f\n", (i+1), resultado[i]);
        }
    }
}
