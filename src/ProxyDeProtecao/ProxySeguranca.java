public class ProxySeguranca implements ContaBancaria {
    private final ContaBancariaReal contaReal;
    private final Usuario usuarioAtual;

    public ProxySeguranca(String titular, double saldo, Usuario usuarioAtual) {
        this.contaReal = new ContaBancariaReal(titular, saldo);
        this.usuarioAtual = usuarioAtual;
    }

    @Override
    public void verSaldo() {
        if (!usuarioAtual.getPapel().equalsIgnoreCase("ADMIN")) {
            System.out.printf("Acesso negado para %s. Você não tem permissão para ver o saldo.%n", usuarioAtual.getNome());
            return;
        }

        contaReal.verSaldo();
    }
}