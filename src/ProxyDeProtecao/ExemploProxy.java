public class ExemploProxy {
    public static void main(String[] args) {
        Usuario usuarioComum = new Usuario("Pedro", "USUARIO");
        Usuario admin = new Usuario("Joana", "ADMIN");

        ContaBancaria contaPedro = new ProxySeguranca("Pedro", 700.00, usuarioComum);
        ContaBancaria contaJoana = new ProxySeguranca("Joana", 2000.00, admin);

        contaPedro.verSaldo();  // Vai negar 
        contaJoana.verSaldo();  // Vai exibir 
    }
}
