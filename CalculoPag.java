package TrabalhoCubas;

public class CalculoPag { 

	 private int horastrab;
	 private double salariohora;
	 private int dependentes;
	 private double salariobruto;
	 private double inss;
	 private double ir;
	 private double salliquido;
	 
	public CalculoPag(int horastrab, double salariohora, int dependentes) {
			this.horastrab = horastrab;
			this.salariohora = salariohora;
			this.dependentes = dependentes;
		}
	
		
	public double calculoSalarioBruto() {
		return salariobruto = horastrab * salariohora + (50 * dependentes);
	}
	public double calculoDescontoInss() {
		if(salariobruto > 1000 ) {
			return inss = salariobruto * 9/100;
		}
		else {
			return inss = salariobruto * 8.5/100;
		}
	}
	public double calculoImpostoRenda() {
		if(salariobruto <= 500 ) { 
			return ir = 0;
		}
		else if(salariobruto > 1000) {
			return ir = salariobruto * 7/100;
		}
		
		else {
			return ir = salariobruto * 5/100;
		}
	}
	public double calculoSalarioLiquido() {
		return salliquido = salariobruto - inss - ir;
	}
}
