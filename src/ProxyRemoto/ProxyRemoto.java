public class ProxyRemoto implements ServicoRemoto {
    private ServicoRemotoReal servicoReal;

    @Override
    public String obterDados() {
        if (servicoReal == null) {
            servicoReal = new ServicoRemotoReal();
        }
        return servicoReal.obterDados();
    }
}