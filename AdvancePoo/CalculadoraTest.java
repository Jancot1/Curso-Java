package AdvancePoo;

public class CalculadoraTest {
    public static void main(String[] args) {

		Calculadora ejercicio = new Calculadora();
		
		ejercicio.performOperation(10.5);
		
		ejercicio.performOperation("+");
		
		ejercicio.performOperation(5.2);
		
		ejercicio.performOperation("*");
		
		ejercicio.performOperation(10);
		
		// ejercicio.performOperation("/");
		
		// ejercicio.performOperation(3);
		
		ejercicio.getResults();
		
		
	}
    
}
