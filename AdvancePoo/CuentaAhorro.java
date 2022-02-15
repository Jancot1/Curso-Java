package AdvancePoo;

import java.util.ArrayList;
import java.util.Random;

public class CuentaAhorro {
    String numCuenta;
	public static int cantCuentas;
    public static double saldoCuentaAhorr = 1000;

    public String numeroDeCuenta() {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		int nCuenta = 0;
		Random random = new Random();
		
		for(int j = 0; j < 1; j++) {
			for(int i = 0; i < 10; i++) {
				nCuenta = random.nextInt(999999999);
				nCuenta = nCuenta + 999999999;
			}
			arrayList.add(nCuenta);
		}
        numCuenta = Integer.toString(nCuenta);
        System.out.println("Número de cuenta del cliente: " + numCuenta);
		return numCuenta;
	}

	// Constructor
	public CuentaAhorro(){
		cantCuentas = cantCuentas + 1;
	}

	public CuentaAhorro(String numCuenta){
		this.numeroDeCuenta();
	}

	public CuentaAhorro(String numCuenta, Double saldoCuentaAhorr) {
		this.numeroDeCuenta();
	}

	// Getter y Setter
	public double getSaldoCuentaAhorr() {
		return saldoCuentaAhorr;
	}

	public void setSaldoCuentaAhorr(double saldoCuentaAhorr) {
		this.saldoCuentaAhorr = saldoCuentaAhorr;
	}


	// Metodos Estaticos
	public static double depositaDinero(double deposito) {

		if (deposito <= 0 ) {
			System.err.println("Monto insuficiente, no puede realizar la transferencia");
		} else {
			saldoCuentaAhorr = saldoCuentaAhorr + deposito;
		}
		return saldoCuentaAhorr;
	}

	public static double retiraDinero(double retiro) {
		if (retiro <=  0) {
			System.err.println("Saldo insuficiente, no puede retirar más dinero");
		} else {
			saldoCuentaAhorr = saldoCuentaAhorr - retiro;
		}
		return saldoCuentaAhorr;
	}

	public static int cantidadCuenta() {
		return cantCuentas;
	}
}
