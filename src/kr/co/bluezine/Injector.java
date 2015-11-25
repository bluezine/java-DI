package kr.co.bluezine;

public class Injector {
	
	private Print print;
	public Injector() {
		this.print = new Print() {
			@Override
			public void print() {
				System.out.println("Success!");
			}
		};
	}
	
	public void print() {
		print.print();
	}
}
