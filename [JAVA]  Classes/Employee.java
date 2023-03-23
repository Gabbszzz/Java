package atividade2;

public class Employee {
	String nome;
	String sobrenome;
	double salario;
	
	Employee(){
		
	}
	Employee(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
	
	}
	String getNome() {
		return this.nome;
	}
	
	String getSobrenome() {
		return this.sobrenome;
	}
	
	double getSalario() {
		return this.salario;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	void setSalario(double salario) {
		if(salario > 0) {
			this.salario = salario;
		}
		
	}
	double aumento() {
		if(this.salario > 0) {
			salario = salario*1.10;	
		}
		
		return salario;
	}
	
	
	
	

	

}
