package Ex1;

import java.util.Iterator;
import java.util.LinkedList;

public class ComplexFunction implements complex_function {
	public Operation Sign;
	public function left,right;

	LinkedList<Object> func = new LinkedList<Object>();
	//g(f1(x), f2(x))
	public ComplexFunction() {
	
		
		/*
		 *binary tree, left and right
		 *init major function in recursion
		 *ops are making this.func the left of bigger complex function and the new one its right. 
		 *checks are instanceof monom,polynom or null 
		 *check if op is an enum with switch case
		 *
		 */
		
		
	}
	
	
	
	public ComplexFunction(Operation sign2, function left2, function right2) {
		this.Sign=sign2;
		this.left=left2;
		this.right=right2;
	}



	public Operation getOp() {
		return this.Sign;
	}
	
	public double f(double x) {
		return 0;
		
	}
	public function initFromString(String s) { //"g(f1,f2)
		//use recusrion to slice the string to polynoms monoms and nulls
		if(s.charAt(0)>=48 && s.charAt(0)<=57) {
			function f = new Polynom(s);
		//	func.add(f);
			return f;
			
		}
		//(Plus(3x,3x),2x)
		int j = 0;
		while(s.charAt(j)!='(') {
			j++;
		}
		String temp = s.substring(0,j);
		
		switch(temp) {
		case "":
			this.Sign=Operation.None;
			int c1=0;
			int c2=0;
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)=='(') c1++;
				if(s.charAt(i)==')') c1--;
				if(s.charAt(i)==',' && c1==1) {
					c2=i;
				}
			}
			
			String l = s.substring(1,c2);
			String r = s.substring(c2+1,s.length()-1);

			function left = this.initFromString(l);
			function right = this.initFromString(r);
			this.left=left;
			this.right=right;
			function cf = new ComplexFunction(Sign,left,right);
			func.add(cf);
			break;
		
		case "Plus":
			this.Sign=Operation.Plus;
			//s=(2x-3,4x+2) // temp = ""
			int q1=0;
			int q2=0;
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)=='(') q1++;
				if(s.charAt(i)==')') q1--;
				if(s.charAt(i)==',' && q1==1) {
					q2=i;
				}
			}
			
			String l1 = s.substring(5,q2);
			String r1 = s.substring(q2+1,s.length()-1);

			function left1 = this.initFromString(l1);
			function right1 = this.initFromString(r1);
			
			this.left=left1;
			this.right=right1;
			ComplexFunction cf1 = new ComplexFunction(Sign,left1,right1);
			func.add(cf1);
			break;
		}
		
		
		return null;
	}
	public function copy() {
		String a = this.toString();
		function x = new ComplexFunction();
		return x;
	}
	public boolean equals(Object obj) {
		//use equals from monom and polynom
	return false;
	}
	
	
	
	
	
	public void plus(function f1) {
			
		if(f1 instanceof Polynom) {
			
		}
		
	}
	
	public void mul(function f1) {
		String temp = this.toString();
		String temp2 = f1.toString();
		Polynom x = new Polynom (temp);
		Polynom y = new Polynom (temp2);
		x.multiply(y);
	}
	
	public void div (function f1) {
		
		
		
	}
	
	public function left() {
		if(this.left!=null) return this.left;
		 
		
		return null;
	}
	public function right() {
		if(this.right!=null) return this.right;
		
		return null;
	}
	
	public String toString() {
		if(this.Sign==Operation.Error) return "";
		String ans ="";
		 ans+=this.Sign+"(";
		Iterator<Object> it = this.iteretor();
		while(it.hasNext()) {		
		    Object nextItem = it.next();
		   
		    if(nextItem instanceof Polynom) {
		    	ans+=nextItem;
		    	ans+=',';
		    	
		    }
		    if(nextItem instanceof ComplexFunction) {
		    	if(((ComplexFunction) nextItem).left==null && ((ComplexFunction) nextItem).right==null) {
		    		ans+="";
		    	}
		    	else { ans+=((ComplexFunction) nextItem).getOp();
		    	ans+='(';
		    	}
		    	if(((ComplexFunction) nextItem).left==null) {
		    		ans+="";
		    	}
		    	else 	ans+=((ComplexFunction) nextItem).left+",";
		    	
		    	if(((ComplexFunction) nextItem).right==null) {
		    		ans+="";
		    	}
		    	else {	ans+=((ComplexFunction) nextItem).right;
		    	ans+=')';
		    	}
		    }
		 
		}
		
		return ans+=')';
		
	}



	public Iterator<Object> iteretor() {
		return func.iterator();
	}
	

	

}
