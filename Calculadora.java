import java.util.Scanner;


public class Calculadora {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true){

        //Perguntas
        System.out.println("Digite o 1° número: ");
        double num_1 = input.nextDouble();
            
        System.out.println("Digite o 2° número: ");
        double num_2 = input.nextDouble();
        
        
        //Pergunta operação
        System.out.println("Escolha a operação: ");
            System.out.println("[1]" + "Adição");
            System.out.println("[2]" + "Subtração");
            System.out.println("[3]" + "Multiplicação");
            System.out.println("[4]" + "Divisão");
            System.out.println("[5]" + "Porcentagem");
            System.out.println("[6]" + "Apagar");
            System.out.println("[7]" + "Sair");
                int escolha = input.nextInt();

                //Calculando
                switch(escolha) {

                    case 1:
                    System.out.println("Resultado: " + (num_1 + num_2));
                    continue;

                    case 2:
                    if (num_1 < 0 && num_2 >= 0) {
                        System.out.println("Resultado: " + (-num_1 + num_2));
                        continue;
                    }
                
                    if (num_2 < 0) {
                        System.out.println("Resultado: " + (num_1 - (-num_2)));
                        continue;
                    }
                
                    if (num_1 >= 0 && num_2 >= 0) {
                        System.out.println("Resultado: " + (num_1 - num_2));
                        continue;
                    }
                
                    if (num_1 < 0 && num_2 < 0) {
                        System.out.println("Resultado: " + (-num_1 - (-num_2)));
                        continue;
                    }
                
                    case 3:
                    System.out.println("Resultado: " + (num_1 * num_2));
                    continue;

                    case 4:
                    if (num_2 == 0) {
                        System.out.println("Erro: divisão por zero");
                    } else {
                        System.out.println("Resultado: " + (num_1 / num_2));
                    }
                    continue;

                    case 5:
                    System.out.println("Resultado: " + num_1 * num_2 / 100);
                    continue;

                    case 6:
                    continue;

                    case 7:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                
                }
            }
    }   
}
