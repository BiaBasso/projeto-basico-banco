
public class Conta {
	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		if(saldo >= valor){
			this.saldo -= valor;
		} else{
			throw new RuntimeException("Saldo insuficiente");
		}
	}	
	
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;		
	}	
	
	public void setSaldo(double saldo) {
		this.setSaldo(saldo);
	}
	public void atualizadorDeContas(double saldo) {
		this.saldo = saldo;
	}
}
