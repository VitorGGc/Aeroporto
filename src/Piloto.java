public class Piloto extends Passageiro {
    private String breve; //licença


    public Piloto(String cpf, int idade, String nome, String email, boolean vaiLevarPet, String breve) {

        super(cpf, idade, nome, email, vaiLevarPet);
        this.breve = breve;
    }


    public String getBreve() {
        return breve;
    }

    public void setBreve(String breve) {
        this.breve = breve;
    }
}
