public class ContaBancariaReal implements ContaBancaria {
    private final String titular;
    private final double saldo;

    public ContaBancariaReal(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public void verSaldo() {
        System.out.printf("Saldo da conta de %s: R$ %.2f%n", titular, saldo);
    }
}