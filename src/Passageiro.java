public class Passageiro {
    private String cpf;
    private int idade;
    private String nome;
    private String email;
    private boolean vaiLevarPet;
    private String numeroColeira;


    public Passageiro(String cpf, int idade, String nome, String email, boolean vaiLevarPet) {
        this.cpf = cpf;
        this.idade = idade;
        this.nome = nome;
        this.email = email;
        this.vaiLevarPet = vaiLevarPet;
        this.numeroColeira = numeroColeira;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVaiLevarPet() {
        return vaiLevarPet;
    }

    public void setVaiLevarPet(boolean vaiLevarPet) {
        this.vaiLevarPet = vaiLevarPet;
    }


    public String getNumeroColeira() {
        return numeroColeira;
    }

    public void setNumeroColeira(String numeroColeira) {
        this.numeroColeira = numeroColeira;
    }
}
