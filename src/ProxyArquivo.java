public class ProxyArquivo implements Arquivo {
    private ArquivoReal arquivoReal;
    private final String nomeArquivo;
    
    public ProxyArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
    
    @Override
    public void carregar() {
        if (arquivoReal == null) {
            arquivoReal = new ArquivoReal(nomeArquivo);
        }
    }
    
    @Override
    public void exibir() {
        carregar();
        arquivoReal.exibir();
    }
}
