package org.phone;

public class InternalStorage {
	private void processor() {
		System.out.println("snapdrogan");
	}
	private void ramsize() {
		System.out.println("8gb");
	}
    

	   public static void main (String[]arg){
	
		InternalStorage a = new InternalStorage();
		a.processor();
		a.ramsize();
        ExternalStorage e = new ExternalStorage();
		e.size();
	}
}
