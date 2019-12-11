package Ex1;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class M {

	public static void main(String[] args) throws IOException {
		ComplexFunction t = new ComplexFunction();
		String xa = "max(2.0,plus(3.0x,2.0x))";
	
		ComplexFunction a = new ComplexFunction(xa);
		System.out.println(a);

		
	

		
		

	}

}
