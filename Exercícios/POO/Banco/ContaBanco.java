/*Métodos:

abrirConta() :
 * mudar o atributo status. EX: status = true (conta aberta)
 * Ao abrir a conta, informar que tipo de conta é (poupança ou correte)
    *Ao abrir uma conta correte, a conta ganha $50,00 (Conta poupança: $150)
fecharConta():
    *Precisa sacar todo o dinheiro
    *E não pode fechar a conta se houver dívida (débito)
depositar():
    *A conta precisa está aberta (status = verdadeiro)
sacar():
    *Conta aberta(status=true)
    *Precisa ter saldo para se feito o saque (o saque não pode ser maior que o saldo)
pagarMensal():
    * Ao ser chamado, a mensalidade é cobrada do saldo
        * conta corrente: paga 12,00
        * Conta poupança: 20,00


*/
public class Contabanco{
    public String numConta;
    protected String tipo; //pedir o tipo da conta; CC - corrente PP- poupança
    private String dono;
    private float saldo = 0.0;
    private boolean status = false;

    public Contabanco(String numconta, String tipo, String  dono){
        this.numConta = numconta;
        this.tipo = tipo;
        this.dono = dono;
    }

    public void abrirConta(String tipo){
        if (!tipo.equals("cc") || !tipo.equals("pp")){
            System.out.println("O tipo de conta não existe, informe um tipo de conta válido ('PP'- Poupança | 'CC'- Corrente): ");
            abrirConta(tipo);
        }
        else{
            if (tipo.equals("cc")){
                saldo += 50.00;
            }
            else{
                saldo += 150.00;
            }
        }
    }

    public void fecharConta(){
        if (saldo == 0.0){

        }

    }

    public void depositar(){
        if (status == true){
            System.out.println("Dinheiro depositado com sucesso!");
        }

    }

}