import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class MediaDaSala {

    public static void main(String[] args) {

    int numeroAlunos, contador = 1;
    double nota, media = 0;

    Scanner input = new Scanner(System.in);

    System.out.println("Digite o número de alunos na turma: ");
    numeroAlunos = input.nextInt();

    while (contador <= numeroAlunos) {
        System.out.println("Digite a nota do aluno "+contador+": ");
        nota = input.nextDouble();
        media += nota;
        contador ++;
    }

    media /= numeroAlunos;

    System.out.println("A nota da turma é: "+media);
 }
    
}
