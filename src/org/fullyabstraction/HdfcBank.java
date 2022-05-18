package org.fullyabstraction;
//child
public class HdfcBank implements WorldBank,RbiBank {
	
@Override
public void deposit() {
System.out.println("deposit : 10%");	
}
@Override
	public void savings() {
System.out.println("savings : 8%");		
	}
@Override
	public void loan() {
System.out.println("loan : 6%");		
	}
private void fd() {
System.out.println("fd rate 70%");
}
private void fixed() {
System.out.println("fixed : 4%");
}
public static void main(String[] args) {
	HdfcBank h=new HdfcBank();
	h.deposit();
	h.savings();
	h.loan();
	h.fixed();
}
}
