class ServidorNetflix implements StreamingService {
    private String localizacao;
    private int usuariosConectados;
    private int capacidadeMaxima;

    public ServidorNetflix(String localizacao, int capacidadeMaxima) {
        this.localizacao = localizacao;
        this.capacidadeMaxima = capacidadeMaxima;
        this.usuariosConectados = 0;
    }

    public boolean estaCheio() {
        return usuariosConectados >= capacidadeMaxima;
    }

    @Override
    public void assistirFilme() {
        if (!estaCheio()) {
            usuariosConectados++;
            System.out.println("Usuário assistindo no servidor de " + localizacao + ". Conectados: " + usuariosConectados);
        } else {
            System.out.println("Servidor de " + localizacao + " está cheio! Não é possível conectar mais usuários.");
        }
    }

    @Override
    public void sairDoFilme() {
        if (usuariosConectados > 0) {
            usuariosConectados--;
            System.out.println("Usuário saiu do servidor de " + localizacao + ". Restam: " + usuariosConectados + " conectados.");
        }
    }

    public String getLocalizacao() {
        return localizacao;
    }
    
    public int getUsuariosConectados() {
        return usuariosConectados;
    }
}