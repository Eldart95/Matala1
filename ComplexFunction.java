package Ex1;

import java.util.Iterator;
import java.util.LinkedList;

public class ComplexFunction implements complex_function {
	public Operation Sign;
	public function left,right;
	public ComplexFunction() {
		
	}
	LinkedList<Object> func = new LinkedList<Object>();
	//g(f1(x), f2(x))
	public ComplexFunction(String s) {
		if(s.charAt(0)=='(' && s.charAt(s.length()-1)==')') { //case when s = (ax^b,cx^d)
			Sign = Operation.None;
			String temp = s.substring(1, s.length()-1);
			int i = 0;
			while(temp.charAt(i)!=',') {
				i++;
			}
			String temp2 = temp.substring(i+1);
			String temp1 = temp.substring(0, i);
			Polynom a = new Polynom(temp1);
			Polynom b = new Polynom(temp2);
			func.add(a); func.add(","); func.add(b);
			this.left=a;
			this.right=b;
			
			
			
			
		}
		
		else if(s.charAt(0)=='M' && s.charAt(1)=='a' && s.charAt(2)=='x') { // case when g=Min
			Sign = Operation.Min;
			String temp = s.substring(1, s.length());
			int i = 0;
			while(temp.charAt(i)!=',') {
				i++;
			}
			String temp2 = temp.substring(i+1);
			String temp1 = temp.substring(0, i);
			Polynom a = new Polynom(temp1);
			Polynom b = new Polynom(temp2);
			func.add(a); func.add(b);
			this.left=a;
			this.right=b;
			
		}
		
		else if(s.charAt(0)=='M' && s.charAt(1)=='i' && s.charAt(2)=='n') { // case when g=Max
			Sign = Operation.Max;
			String temp = s.substring(1, s.length());
			int i = 0;
			while(temp.charAt(i)!=',') {
				i++;
			}
			String temp2 = temp.substring(i+1);
			String temp1 = temp.substring(0, i);
			Polynom a = new Polynom(temp1);
			Polynom b = new Polynom(temp2);
			func.add(a); func.add(b);
			this.left=a;
			this.right=b;
			
			
		}
		
		else if(s.charAt(0)=='P' && s.charAt(1)=='l' && s.charAt(2)=='u' && s.charAt(2)=='s') {
			Sign = Operation.Plus;
			String temp = s.substring(1, s.length());
			int i = 0;
			while(temp.charAt(i)!=',') {
				i++;
			}
			String temp2 = temp.substring(i+1);
			String temp1 = temp.substring(0, i);
			Polynom a = new Polynom(temp1);
			Polynom b = new Polynom(temp2);
			func.add(a); func.add(b);
			this.left=a;
			this.right=b;
		}
		
		else if(s.charAt(0)=='T' && s.charAt(1)=='i' && s.charAt(2)=='m' && s.charAt(3)=='e' && s.charAt(4)=='s') {
			Sign = Operation.Times;
			String temp = s.substring(1, s.length());
			int i = 0;
			while(temp.charAt(i)!=',') {
				i++;
			}
			String temp2 = temp.substring(i+1);
			String temp1 = temp.substring(0, i);
			Polynom a = new Polynom(temp1);
			Polynom b = new Polynom(temp2);
			func.add(a); func.add(b);
			this.left=a;
			this.right=b;
			
		}
		
		else if(s.charAt(0)=='D' && s.charAt(1)=='i' && s.charAt(2)=='v' && s.charAt(3)=='i' && s.charAt(4)=='d') {
			Sign = Operation.Divid;
			String temp = s.substring(1, s.length());
			int i = 0;
			while(temp.charAt(i)!=',') {
				i++;
			}
			String temp2 = temp.substring(i+1);
			String temp1 = temp.substring(0, i);
			Polynom a = new Polynom(temp1);
			Polynom b = new Polynom(temp2);
			func.add(a); func.add(b);
			this.left=a;
			this.right=b;
		}
		
		else if(s.charAt(0)=='C' && s.charAt(1)=='o' && s.charAt(2)=='m' && s.charAt(2)=='p') {
			Sign = Operation.Comp;
			String temp = s.substring(1, s.length());
			int i = 0;
			while(temp.charAt(i)!=',') {
				i++;
			}
			String temp2 = temp.substring(i+1);
			String temp1 = temp.substring(0, i);
			Polynom a = new Polynom(temp1);
			Polynom b = new Polynom(temp2);
			func.add(a); func.add(b);
			this.left=a;
			this.right=b;
		}
		else {
			Sign = Operation.Error;
			throw new RuntimeException("Error");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public void plus(function f1) {
			
		String temp = this.toString();
		String temp2 = f1.toString();
		Polynom x = new Polynom (temp);
		Polynom y = new Polynom (temp2);
		x.add(y);
		
	}
	
	public void mul(function f1) {
		String temp = this.toString();
		String temp2 = f1.toString();
		Polynom x = new Polynom (temp);
		Polynom y = new Polynom (temp2);
		x.multiply(y);
	}
	
	public void div (function f1) {
		String temp = this.toString();
		String temp2 = f1.toString();
		Polynom x = new Polynom (temp);
		Polynom y = new Polynom (temp2);
		Polynom one = new Polynom("1");
		
		
	}
	
	public function left() {
		return this.left;
	}
	public function right() {
		return this.right;
	}
	
	public String toString() {
		if(this.Sign==Operation.Error) return "0";
		String ans ="";
		Iterator<Object> it = this.iteretor();
		while(it.hasNext()) {
		    Object nextItem = it.next();
		  
		    	ans+=nextItem;
		    
		    
		    
		}
		return ans;
		
	}



	private Iterator<Object> iteretor() {
		// TODO Auto-generated method stub
		return func.iterator();
	}
	

}
