import java.util.Scanner;

public class ProgramaMedia{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        Float n1 = teclado.nextFloat();
        System.out.println("Digite sua segunda nota: ");
        Float n2 = teclado.nextFloat();
        Float media = (n1+n2)/2;
        System.out.println("sua nota: "+ media);
        if (media>=60){
            System.out.println("Parabéns! Você foi Aprovado.");
        }
        else{
            System.out.println("Que pena, Você foi Reprovado.");
        }
    }
}