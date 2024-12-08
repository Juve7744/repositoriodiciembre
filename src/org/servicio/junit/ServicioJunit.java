package org.servicio.junit;

public class ServicioJunit {
	
	public double salarioBono(double salario, double bono) {
		return salario + bono;
	}

	public double salarioPrestamo(double salario, double prestamo) {
		return salario - prestamo;
	}
	
	public double salarioporMes(double salario, double mes) {
		return salario * mes;
	}
	
}