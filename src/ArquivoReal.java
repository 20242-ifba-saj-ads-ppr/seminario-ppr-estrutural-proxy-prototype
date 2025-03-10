class ArquivoReal implements Arquivo {
    private String nomeArquivo;
    
    public ArquivoReal(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        carregar();
    }
    
    @Override
    public void carregar() {
        System.out.println("Carregando arquivo: " + nomeArquivo);
    }
    
    @Override
    public void exibir() {
        System.out.println("Exibindo arquivo: " + nomeArquivo);
    }
}
