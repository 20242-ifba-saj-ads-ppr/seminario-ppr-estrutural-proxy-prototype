public class ExemploProxyRemoto {
    public static void main(String[] args) {
        ServicoRemoto servico = new ProxyRemoto();
        System.out.println(servico.obterDados());
    }
}