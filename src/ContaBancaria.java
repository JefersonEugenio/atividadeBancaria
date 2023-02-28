public class ContaBancaria {

    private String conta;
    private String nome;
    private double saldo;
    private double limiteSaque = 300;
    public ContaBancaria(String conta, String nome, double saldo) {
        this.conta = conta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public double deposito(double valor) {
        if (valor > 0) {
            System.out.printf("Depositou: %.2f \n", valor);
            System.out.println("==================================");
            return saldo+=valor;
        } else {
            System.out.println("INVALIDO! Depositou menos do que ou igual 0, ou digite erro");
            System.out.println("==================================");
            return -1;
        }
    }

    public double saque(double valor) {
        System.out.printf("Sacar: %.2f \n", valor);
        System.out.println("==================================");
        if (saldo >= valor) {
            if (valor <= 300) {
                System.out.printf("Sacou dinheiro: %.2f \n", valor);
                System.out.println("==================================");
                saldo-=valor;
                return saldo;
            } else {
                System.out.println("Não sucesso saque!");
                System.out.println("Limite sacar: 300,00");
                System.out.println("==================================");
                return -1;
            }
        } else {
            System.out.println("Saldo insuficiente ");
            System.out.println("==================================");
            return -1;
        }
    }

    public void imprimirInformacoes() {
        System.out.println("Número da conta: " + conta);
        System.out.println("Titular: " + nome);
        System.out.printf("Valor seu saldo: %.2f \n", saldo);
        System.out.printf("Limite de saque: %.2f \n", limiteSaque);
    }

}
