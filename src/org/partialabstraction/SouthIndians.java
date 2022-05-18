package org.partialabstraction;
//child
public class SouthIndians extends Indians {
	@Override
	public void breakfast() {
		System.out.println("Idly or Dosa or Pongal");
	}
	private void dressing() {
System.out.println("saree or dhoti");
	}
	public static void main(String[] args) {
		SouthIndians s = new SouthIndians();
		s.breakfast();
		s.dressing();
		s.aadharCard();
		s.panCard();
		s.voterId();
		
	}
	

}
