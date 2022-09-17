import java.util.Random;

public class Exercicio3B {
    /*O jogo campo minado é composto por uma matriz quadrada, sendo que existem minas em algumas 
     * casas da matriz. O usuário escolhe uma casa se ali contiver uma mina, então o jogo encerrado. 
     * Se não houver uma mina, então tem-se a seguinte situação: (1) se não houver qualquer mina nas
     * casas adjacentes (horizontal, vertical e diagonal), então a casa escolhida e as casas adjacentes 
     * a esta são reveladas; (2) quando uma casa é revelada, se houver minas nas casas adjacentes, 
     * então é exibido um número que indica o total de minas que estão em volta da casa revelada.
     * Desenvolva um aplicativo Java que gere uma matriz quadrada de tamanho 9 e espalhe, de maneira 
     * aleatória, 10 minas. Por fim, imprima a matriz resultante. Para as casas vazias imprima o 
     * caractere ponto (.) e para as casas que possuem mina, imprima o caractere asterisco (*). 
     * Exemplo:
     * .........
     * .........
     * ....*..*.
     * .........
     * .....*..*
     * ....*....
     * ......**.
     * .....*...
     * ..*...*..
     */
 
    public static void main(String[] args) {
        Random gerador = new Random();  
        int sortearLinha;
        int sortearColuna;
        int x, y;
        int cont = 0;
        
        int[] vetor = new int[9];
        char[][] matriz = {
            {'.','.','*','.','.','.','.','.','.'},
            {'*','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','*','.','.','*','.'},
            {'.','.','.','.','.','.','.','.','*'},
            {'.','.','.','.','.','*','.','.','.'},
            {'.','.','.','.','*','.','.','.','.'},
            {'.','.','.','.','.','.','*','.','.'},
            {'.','.','.','.','.','*','.','.','.'},
            {'.','.','.','.','.','.','.','*','.'},
        };
           
        while(cont < 10){
            sortearLinha = gerador.nextInt(0+9);
            sortearColuna = gerador.nextInt(0+9);
            
            while(sortearLinha == sortearColuna){
               sortearLinha = gerador.nextInt(0+9);
               sortearColuna = gerador.nextInt(0+9);
            } 
            for(x = 0; x < 9; x++){
               for(y = 0; y < 9; y++){
                   vetor[x] = matriz[y][sortearLinha];
                   matriz[y][sortearLinha] = matriz[y][sortearColuna];
                   matriz[y][sortearColuna] = (char) vetor[x];
                }
            }
            cont++;
        }  
        System.out.println("Campo Minado: "); 
        mostrarMatriz(matriz);
        
    }  
    public static void mostrarMatriz(char[][] matriz){
        int x;
        int y; 
          
        for(x = 0; x < 9; x++){
            for(y = 0; y < 9; y++){
              System.out.print(" " + matriz[x][y] + " ");
            }    
           System.out.println(" ");
        }
          
    }
} 
    
      