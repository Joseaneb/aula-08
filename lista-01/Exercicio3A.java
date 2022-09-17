import java.text.DecimalFormat;

public class Exercicio3A {
   
    /* Na disciplina de Programação Orientada a Objetos o aluno será avaliado por meio de 2 projetos práticos 
     * e 5 listas de exercícios. A nota para os projetos práticos é calculada por meio de uma média ponderada, 
     * com os seguintes pesos W = {w 1 , w 2 } = {2, 4}. A nota das listas de exercícios é calculada por meio 
     * de uma média geométrica. Por fim, Conceito Final é calculado por meio de uma média ponderada, os
     * projetos com peso 0,9 e as listas de exercícios com peso 0,1.
     */
    public static void main(String[] args) {

        double p1, p2;  // 02 projetos
        double l1, l2, l3, l4, l5;   // 05 listas de exercícios
        double mediaGeometrica=0;
        double mediaPonderada=0;
        double conceitoFinal=0;
        double calcListas=0;
        double calcProjetos=0;

        // pesos dos projetos W = {w1, w2 } = {2, 4}.
        double w1 = 2;
        double w2 = 4;

        p1 = Double.parseDouble(args[0]);
        p2 = Double.parseDouble(args[1]);
        l1 = Double.parseDouble(args[2]);
        l2 = Double.parseDouble(args[3]);
        l3 = Double.parseDouble(args[4]);
        l4 = Double.parseDouble(args[5]);
        l5 = Double.parseDouble(args[6]);

        // cálculos
        calcProjetos = Math.pow(p1,2) * Math.pow(p2,4);
        mediaPonderada = (Math.pow(calcProjetos, 1.0/6)) * 0.9;
        calcListas = (l1 * l2 * l3 * l4 * l5);
        mediaGeometrica = (Math.pow(calcListas, 1.0/5)) * 0.1;
        conceitoFinal = mediaPonderada + mediaGeometrica;

        // Arredondando valor Double em Java
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.0");
      
        // verifica se o aluno obteve conceito final maior ou igual que SEIS
        if (conceitoFinal >= 6) {
            System.out.println("Conceito final " + decimalFormat.format(conceitoFinal) + " aluno APROVADO");

        } else {
            System.out.println("Conceito final " + decimalFormat.format(conceitoFinal) + " aluno REPROVADO");
        }
    }
}