package co.edureka.java.threads;

import java.util.concurrent.TimeUnit;

class Printer{
	//public void printTable(int num) {
	synchronized public void printTable(int num) {
		for(int i=1;i<=10; i++) {
			int p = num * i;
			System.out.printf("%-10s   %d x %d = %d \n", Thread.currentThread().getName().toUpperCase(), num, i, p);
			try {
				TimeUnit.SECONDS.sleep(1);
			}catch(Exception ex) {}
		}
		System.out.println("-------------------------------------------------------");
		try {
			TimeUnit.SECONDS.sleep(4);
		}catch(Exception ex) {}		
	}
}

class ComputerThread1 extends Thread{
	Printer printer;
	int num;
	
	public ComputerThread1(Printer printer, int num) {
		super();
		this.printer = printer;
		this.num = num;
	}

	@Override
	public void run() {
		printer.printTable(num);
	}
}

class ComputerThread2 extends Thread{
	Printer printer;
	int num;
	
	public ComputerThread2(Printer printer, int num) {
		super();
		this.printer = printer;
		this.num = num;
	}

	@Override
	public void run() {
		printer.printTable(num);
	}
}

public class SynchroTest {

	public static void main(String[] args) {
		Printer printer = new Printer();
		
		ComputerThread1 comp1 = new ComputerThread1(printer, 6);
		ComputerThread2 comp2 = new ComputerThread2(printer, 8);
		
		comp1.start();
		comp2.start();
	}
}