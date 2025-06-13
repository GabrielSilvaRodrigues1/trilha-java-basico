public class ContaTerminal{
    private int numero;
    private String agencia;
    private String nomeCliente;
    private float saldo;
    public ContaTerminal(int numero, String agencia, String nomeCliente, float saldo){
        this.numero=numero;
        this.agencia=agencia;
        this.nomeCliente=nomeCliente;
        this.saldo=saldo;
    }
    public int getNumero(){
        return numero;
    }
    public String getAgencia(){
        return agencia;
    }
    public String getNomeCliente(){
        return nomeCliente;
    }
    public Float getSaldo(){
        return saldo;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    public void setAgencia(String agencia){
        this.agencia=agencia;
    }
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente=nomeCliente;
    }
    public void setSaldo(float saldo){
        this.saldo=saldo;
    }
    public String mensagem(){
        return String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
            nomeCliente, agencia, numero, saldo
        );
    }
}