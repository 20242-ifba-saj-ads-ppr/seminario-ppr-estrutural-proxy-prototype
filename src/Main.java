public class Main {
    public static void main(String[] args) {
        Arquivo arquivo = new ProxyArquivo("documento.pdf");
        
        System.out.println("Arquivo criado, mas ainda não carregado.");
        arquivo.exibir(); 
        System.out.println("Exibindo novamente...");
        arquivo.exibir(); 
    }
}
