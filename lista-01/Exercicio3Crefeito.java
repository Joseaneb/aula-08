import java.util.Scanner;

public class Exercicio3Crefeito {
    


    public static void main(String[] args) {
        String[][] matriz = new String[9][9];
        int i = 0;
        int j = 0;
        int cont = 0;

        Scanner entrada = new Scanner(System.in);

        //percorre os carateres do arquivo e insere na matriz
        while(entrada.hasNext() && j<9){
            String linhas = entrada.nextLine();
            String sub;
            while(i<9){
                char c = linhas.charAt(i);
                sub = Character.toString(c);
                matriz[i][j] = sub;
                i++;
            }
            i = 0;
            j++;
        }

        i = 0;
        j = 0;

        //totaliza as minas presentes nas casas adjacentes
        while(j<9){
            while(i<9){

                if (matriz[i][j].equals(".")){
                    if (i>0 &&  j>0){
                        if (matriz[i-1][j-1].equals("*")){
                            cont++;
                        }
                    }
                    if (i>0){
                        if (matriz[i-1][j].equals("*")){
                            cont++;
                        }
                    }
                    if (i>0 &&  j<8){
                        if (matriz[i-1][j+1].equals("*")){
                            cont++;
                        }
                    }
                    if (j<8){
                        if (matriz[i][j+1].equals("*")){
                            cont++;
                        }
                    }
                    if (i<8 &&  j<8){
                        if (matriz[i+1][j+1].equals("*")){
                            cont++;
                        }
                    }
                    if (i<8){
                        if (matriz[i+1][j].equals("*")){
                            cont++;
                        }
                    }
                    if (i<8  &&  j>0){
                        if (matriz[i+1][j-1].equals("*")){
                            cont++;
                        }
                    }
                    if (j>0){
                        if (matriz[i][j-1].equals("*")){
                            cont++;
                        }
                    }
                    if (cont > 0){
                        matriz[i][j] =  Integer.toString(cont);
                    }
                    cont = 0;
                }
                i++;
            }
            i = 0;
            j++;
        }

        i = 0;
        j = 0;

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