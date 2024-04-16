public class EntradaSaida {
    public void registrarEntrada(Passageiro passageiro) {
        System.out.println(passageiro.getNome() + " entrou no aeroporto.");
    }

    public void registrarSaida(Passageiro passageiro) {
        System.out.println(passageiro.getNome() + " saiu do aeroporto.");
    }
}
