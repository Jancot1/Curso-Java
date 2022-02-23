package AdvancePoo;

import java.util.ArrayList;

public class Calculadora implements java.io.Serializable{

    private double operandOne;
	private String operation;
	private String operationF;
	private double operandTwo;

	ArrayList <Double> suma = new ArrayList <Double>();
	ArrayList <Double> resta = new ArrayList <Double>();
	ArrayList <Double> multiplicar = new ArrayList <Double>();
	ArrayList <Double> dividir = new ArrayList <Double>();
	
	// Setter
	public void setOperandOne(int operandOne) {
		this.operandOne = operandOne;
	}
	
	public void setOperandTwo(int operandTwo) {
		this.operandTwo = operandTwo;
	}
	
	// Operacion
	public void performOperation (String operacion) {
		if (operacion == "+") {
			this.operation = operacion;
		} else if (operacion == "-") {
			this.operation = operacion;
		} else if (operacion == "=") {
			this.operation = operacion;
		} else if (operacion == "/") {
			this.operation = operacion;
		} else if (operacion == "*") {
			this.operation = operacion;
		} else {
			System.out.println("Operacion invalida");
		}
	}

	// Numeros
	public void performOperation(double variable) {
		if (operandOne == 0) {
			operandOne = variable;
		} if (operandOne != 0) {
			operandTwo = variable;
			// Suma
		} if (operation == "+") { 
			suma.add(operandOne);
			operandOne = operandTwo;
			operationF = "+";
			// Resta
		} if (operation == "-") {  
			resta.add(operandTwo);
			operandOne = operandTwo;
			operationF = "-";
			// Multiplicacion
		} if (operation == "*") {  
			multiplicar.add(operandOne);
			multiplicar.add(operandTwo);
			operandOne = operandTwo;
			operationF = "*";
			// Division
		} if (operation == "/") {  
			dividir.add(operandTwo);
			operandOne = operandTwo;
			operationF = "/";
		} if (operation == "=" && operationF =="+") {  
			suma.add(operandOne);
		} if (operation == "=" && operationF == "*") {
		} if (operation == "=" && operationF == "/") {
		}	 if (operation == "=" && operationF =="-") {  
			resta.add(operandOne);
		}
	}
	
	public void getResults() {
		double totalsum = 0;
		for(int i = 0; i < suma.size(); i++) {
			totalsum = (double) (suma.get(i) + totalsum);
		}
		
		double totalrest = 0;
		for(int i = 0; i < resta.size(); i++) {
			totalrest = (double) (resta.get(i) + totalrest);
		}
		
		double multiplicacion = 1;
		for(int i = 0; i < multiplicar.size(); i++) {
			multiplicacion = (double) (multiplicar.get(i) * multiplicacion);
		}
		
		double division = 1;
		for(int i = 0; i < dividir.size(); i++) {
			division = (double) (dividir.get(i) * division);
		}
		
		double resultado = totalsum +  multiplicacion - totalrest;
		double resultado1 = resultado / division;
		System.out.println("Resultado de la operación: " + resultado1);
		
		operationF = null;
    }
}
