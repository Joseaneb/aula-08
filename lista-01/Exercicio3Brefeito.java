import java.util.Random;

public class Exercicio3Brefeito {
    
    public static void main(String[] args) {
        String[][] matriz = new String[9][9];
        int i = 0;
        int j = 0;
        int x = 0;
        int z = 0;
        int k = 0;

        Random r = new Random();


        //gera pontos em cada posição da matrix
        while(j<9){
            while(i<9){
                matriz[i][j] = ".";
                i++;                
            }
            i = 0;
            j++;
        }
        i = 0;
        j = 0;

        do{
            x = r.nextInt(9);
            z = r.nextInt(9);

            if (matriz[x][z] != "*"){
                matriz[x][z] = "*";
                k++;
            }
        }while (k < 10);

        //imprime a matriz
        while(j<9){
            while(i<9){
                System.out.print(matriz[i][j]);
                i++; 
                if (i == 9){
                    System.out.println("");
                }               
            }
            i = 0;
            j++;
        }
    }
}