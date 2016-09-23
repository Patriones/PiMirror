package PiMirror;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException{
		PiMirror pi = new PiMirror();
		pi.weatherTime();
		System.out.println(pi.date);
		System.out.println(pi.temperature);
		System.out.println(pi.time);
		System.out.println(pi.condition);
		
	}
}
