package designPatternsFor23.factoryPattern.abstractFactory;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("This is mail sender...");
	}

}
