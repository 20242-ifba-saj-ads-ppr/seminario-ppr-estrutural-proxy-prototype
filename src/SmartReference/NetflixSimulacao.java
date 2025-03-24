public class NetflixSimulacao {
    public static void main(String[] args) {
        ProxyServidorNetflix proxy = new ProxyServidorNetflix();

        ServidorNetflix servidorSP = new ServidorNetflix("São Paulo", 2);
        ServidorNetflix servidorRJ = new ServidorNetflix("Rio de Janeiro", 3);
        ServidorNetflix servidorNY = new ServidorNetflix("Nova York", 1);

        proxy.adicionarServidor(servidorSP);
        proxy.adicionarServidor(servidorRJ);
        proxy.adicionarServidor(servidorNY);

        proxy.assistirFilme(); // SP
        proxy.assistirFilme(); // RJ
        proxy.assistirFilme(); // NY
        proxy.assistirFilme(); // SP
        proxy.assistirFilme(); // RJ
        proxy.assistirFilme(); // RJ
        proxy.assistirFilme(); // Todos cheios

        proxy.sairDoFilme();
        proxy.sairDoFilme();
        proxy.sairDoFilme();

        proxy.assistirFilme(); //Escolhe o menos cheio
    }
}