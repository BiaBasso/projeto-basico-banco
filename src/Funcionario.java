
public class Funcionario {
	private String nome;
	private double salario;
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public double getBonus(){
		return this.salario * 0.2;
	}
}

class TestaFuncionario{
	public void main (String[]args){
		Funcionario patricia = new Funcionario();
		
		patricia.setSalario(1000.0);
		
		System.out.println(patricia.getBonus());
		
	}
}
