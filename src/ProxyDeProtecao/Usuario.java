public class Usuario {
    private final String nome;
    private final String papel;

    public Usuario(String nome, String papel) {
        this.nome = nome;
        this.papel = papel;
    }

    public String getNome() {
        return nome;
    }

    public String getPapel() {
        return papel;
    }
}