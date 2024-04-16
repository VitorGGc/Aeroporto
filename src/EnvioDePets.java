public class EnvioDePets {
    public void enviarPet(Passageiro passageiro) {
        if (passageiro.isVaiLevarPet()) {
            String numeroColeira = passageiro.getNumeroColeira();
            if (numeroColeira != null && !numeroColeira.isEmpty()) {
                System.out.println("Pet do passageiro " + passageiro.getNome() + " com número da coleira " + numeroColeira + " foi enviado.");
            } else {
                System.out.println("Pet do passageiro " + passageiro.getNome() + " foi enviado sem número da coleira.");
            }
        } else {
            System.out.println("O passageiro " + passageiro.getNome() + " não está levando um pet.");
        }
    }
}