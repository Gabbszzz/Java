package atividade3;

public class Date {
	private int dia;
	private int mes;
	private int ano;
	
	
	public void setDia(int dia){
		if(dia > 0 && dia <= 31) {
			this.dia = dia;
		}

	}
	public void setMes(int mes){
		if(mes >=1 && mes <=12) {
			this.dia = mes;	
		} else {
			System.out.println("Mes inválido");
		}
		
	

	}
	public void setAno(int ano){
		this.dia = ano;
	

	}
	public Date() {
		
	}
	public String formatarData(int dia, int mes, int ano) {
		
		return dia +"/"+mes+"/"+ano;
	}
	
}
