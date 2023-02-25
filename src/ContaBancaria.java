public class ContaBancaria {

    private String conta;
    private String nome;
    private double saldo;
    private double limiteSaque;
    public ContaBancaria(String conta, String nome, double saldo, double limiteSaque) {
        this.conta = conta;
        this.nome = nome;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public double deposito(double valor) {
        System.out.println("Depositou: " + valor);
        System.out.println("==================================");
        return saldo+=valor;
    }

    public double saque(double valor) {
        System.out.println("Sacar: " + valor);
        System.out.println("==================================");
        if (saldo >= valor) {
            System.out.println("Sacou dinheiro: " + valor);
            System.out.println("==================================");
            saldo-=valor;
            return saldo;
        } else {
            System.out.println("Saldo insuficiente ");
            System.out.println("==================================");
            return -1;
        }
    }

    public void imprimirInformacoes() {
        System.out.println("Número da conta: " + conta);
        System.out.println("Titular: " + nome);
        System.out.println("Valor saldo: " + saldo);
        System.out.println("Limite de saque: " + limiteSaque);
    }

}
