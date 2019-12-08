package Ex1;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class M {

	public static void main(String[] args) {
		
		ComplexFunction we = new ComplexFunction("Plus(3x,3x)");
		Functions_GUI qq = new Functions_GUI();
		Range x = new Range(0,5);
		Range y = new Range(0,5);
		qq.drawFunctions(1050, 1050, x, y, 60);
	

		function e = new Polynom("4x^2");
		function f = new Polynom("2x+5x^3+15");
		ComplexFunction f4 = new ComplexFunction("divid",e,f);	
		
		function g = new Polynom("x");
		function h = new Polynom("x");
		
		ComplexFunction f5 = new ComplexFunction("mul",g,h);
		
		
	//	System.out.println(x);
		System.out.println("***");
//		System.out.println(k);
		System.out.println("***");
//		System.out.println(f3);
//		System.out.println("***");
//		System.out.println(f4.f(5));
		
		
		
		
	

		
		

	}

}
