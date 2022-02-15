package AdvancePoo;

import java.util.Scanner;

public class BankAccount {
	
	public static void main(String[] args) {
		
		double totalDinero;
		boolean salir = true;

		CuentaAhorro ca = new CuentaAhorro();
		CuentaCorriente cc = new CuentaCorriente();

		do {
			
			menuPrincipal();
			Scanner op = new Scanner(System.in);
			int num = op.nextInt();
	
			switch (num) {
				case 1:
					menuAccion();
					Scanner ac = new Scanner(System.in);
					int accion = ac.nextInt();
					if (accion == 1) {
						System.out.println("Ingrese el monto");
						Scanner d = new Scanner(System.in);
						int deposito = d.nextInt();
						ca.depositaDinero(deposito);
						System.out.println("Nuevo Saldo: " + ca.saldoCuentaAhorr);
					}else if (accion == 2) {
						System.out.println("Ingrese el monto");
						Scanner d = new Scanner(System.in);
						int deposito = d.nextInt();
						cc.depositaDinero(deposito);
						System.out.println("Nuevo Saldo: " + cc.saldoCuentaCorr);
					}
					break;
				case 2:
					menuAccion();
					Scanner a = new Scanner(System.in);
					int action = a.nextInt();
					if (action == 1) {
						System.out.println("Ingrese el monto");
						Scanner r = new Scanner(System.in);
						int retiro = r.nextInt();
						ca.retiraDinero(retiro);
						System.out.println("Nuevo Saldo: " + ca.saldoCuentaAhorr);
					} else if (action == 2) {
						System.out.println("Ingrese el monto");
						Scanner r = new Scanner(System.in);
						int retiro = r.nextInt();
						cc.retiraDinero(retiro);
						System.out.println("Nuevo Saldo: " + cc.saldoCuentaCorr);
					}
					break;
	
				case 3:
					totalDinero = ca.getSaldoCuentaAhorr() + cc.getSaldoCuentaCorr();
					System.out.println("Saldo Total: " + totalDinero);
					System.out.println("Saldo C.Ahorro: " + ca.getSaldoCuentaAhorr());
					System.out.println("Saldo C.Corriente: " + cc.getSaldoCuentaCorr());
					break;
			
				case 4:
					salir = false;
					break;
				default:
	
					break;
			}
		} while (salir);
	}

	public static void menuPrincipal() {
		System.out.println("Ingrese la opción que desea realizar");
		System.out.println("[1] Deposito");
		System.out.println("[2] Retiro");
		System.out.println("[3] Consultar saldo");
		System.out.println("[4] Salir");
	}

	public static void menuAccion() {
		System.out.println("Ingrese el tipo de cuenta");
		System.out.println("[1] Cuenta de Ahorro");
		System.out.println("[2] Cuenta Corriente");
	}

}
