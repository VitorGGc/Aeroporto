public class ComissarioDeBordo extends Passageiro {
    private int anosDeExperiencia;


    public ComissarioDeBordo(String cpf, int idade, String nome, String email, boolean vaiLevarPet, int anosDeExperiencia) {

        super(cpf, idade, nome, email, vaiLevarPet);
        this.anosDeExperiencia = anosDeExperiencia;
    }


    public int getAnosDeExperiencia() {
        return anosDeExperiencia;
    }

    public void setAnosDeExperiencia(int anosDeExperiencia) {
        this.anosDeExperiencia = anosDeExperiencia;
    }
}
