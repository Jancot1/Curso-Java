package AdvancePoo;

import java.util.ArrayList;
import java.util.Random;

public class CuentaCorriente {
    String numCuenta;
    public static int cantCuentas;
    public static double saldoCuentaCorr = 1000;

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
    public CuentaCorriente(){
		cantCuentas = cantCuentas + 1;
    }

    public CuentaCorriente(String numCuenta){
        this.numeroDeCuenta();
    }

    // Getter y Setter
    public double getSaldoCuentaCorr() {
		return saldoCuentaCorr;
	}

	public void setSaldoCuentaCorr(double saldoCuentaCorr) {
		this.saldoCuentaCorr = saldoCuentaCorr;
	}


    // Metodos Estaticos
    public static double depositaDinero(double deposito) {

		if (deposito <= 0 ) {
			System.err.println("Monto insuficiente, no puede realizar la transferencia");
		} else {
			saldoCuentaCorr = saldoCuentaCorr + deposito;
		}
		return saldoCuentaCorr;
	}

	public static double retiraDinero(double retiro) {
		if (saldoCuentaCorr <=  0 || saldoCuentaCorr < retiro) {
			System.err.println("Saldo insuficiente, no puede realizar la operación");
		} else {
			saldoCuentaCorr = saldoCuentaCorr - retiro;
		}
		return saldoCuentaCorr;
	}

    public static int cantidadCuenta() {
        return cantCuentas;
    }
}
