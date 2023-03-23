package atividade3;

public class DataTeste {
	public static void main(String[] args) {
		
		int dia = 01;
		int mes = 14;
		int ano = 1994;
		
		Date data = new Date();
		
		data.setDia(dia);
		data.setMes(mes);
		data.setAno(ano);
		
		System.out.println(data.formatarData(dia, mes, ano));
		
		
	}

}
