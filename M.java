package Ex1;

public class M {

	public static void main(String[] args) {
	
		String k = "Plus(Plus(2x,3x),3x)";
		ComplexFunction f = new ComplexFunction();
		function a = new Polynom("2x");
		function b = new Polynom("3x");
		function c = new Polynom("3x");
		ComplexFunction f1 = new ComplexFunction("plus",a,b);
		ComplexFunction f2 = new ComplexFunction(c);
		ComplexFunction f3 = new ComplexFunction("plus",f1,f2);
		f.initFromString(k);
		
		
		
		System.out.println("***");
//		System.out.println(k);
		System.out.println("***");
		System.out.println(f3);
//		System.out.println("***");
//		System.out.println(f);
		
		
	

		
		

	}

}
