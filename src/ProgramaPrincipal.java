import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Por favor, insira as informações sobre o passageiro:");

        System.out.print("Nome: ");
        String nomePassageiro = scanner.nextLine();

        System.out.print("CPF: ");
        String cpfPassageiro = scanner.nextLine();

        System.out.print("Idade: ");
        int idadePassageiro = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Email: ");
        String emailPassageiro = scanner.nextLine();


        System.out.print("Você vai levar um pet? (responda 'sim' ou 'não'): ");
        String respostaPet = scanner.nextLine();
        boolean vaiLevarPet = respostaPet.equalsIgnoreCase("sim");


        Passageiro passageiro = new Passageiro(cpfPassageiro, idadePassageiro, nomePassageiro, emailPassageiro, vaiLevarPet);


        System.out.println("\nAgora, insira as informações sobre o piloto:");

        System.out.print("Nome do piloto: ");
        String nomePiloto = scanner.nextLine();

        System.out.print("Número da licença para pilotar: ");
        String brevePiloto = scanner.nextLine();


        Piloto piloto = new Piloto(cpfPassageiro, idadePassageiro, nomePiloto, emailPassageiro, vaiLevarPet, brevePiloto);


        System.out.println("\nAgora, insira as informações sobre o comissário de bordo:");

        System.out.print("Nome do comissário: ");
        String nomeComissario = scanner.nextLine();

        System.out.print("Anos de experiência do comissário: ");
        int anosExperienciaComissario = scanner.nextInt();
        scanner.nextLine();


        ComissarioDeBordo comissario = new ComissarioDeBordo(cpfPassageiro, idadePassageiro, nomeComissario, emailPassageiro, vaiLevarPet, anosExperienciaComissario);


        EntradaSaida entradaSaida = new EntradaSaida();
        EnvioDeMala envioDeMala = new EnvioDeMala();
        EnvioDePets envioDePets = new EnvioDePets();



        entradaSaida.registrarEntrada(passageiro);


        envioDePets.enviarPet(passageiro);


        entradaSaida.registrarSaida(passageiro);


        scanner.close();
    }
}
