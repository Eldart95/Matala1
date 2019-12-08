package Ex1;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;


public class Functions_GUI implements functions{
	
	public static void main(String[] args) {
		
	}
	
	
	LinkedList<function> func = new LinkedList<function>();
	
	Color [] colors = {Color.BLUE, Color.DARK_GRAY, Color.MAGENTA, Color.GREEN, Color.ORANGE, Color.CYAN, Color.RED, Color.PINK,Color.YELLOW };

	@Override
	public boolean add(function arg0) {
		return func.add(arg0);
	}

	@Override
	public boolean addAll(Collection<? extends function> arg0) {
		return func.addAll(arg0);
	}

	@Override
	public void clear() {
		func.clear();
		
	}

	@Override
	public boolean contains(Object arg0) {
		return func.contains(arg0);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return func.containsAll(c);
	}

	@Override
	public boolean isEmpty() {
		return func.isEmpty();
	}

	@Override
	public Iterator<function> iterator() {
		return func.iterator();
	}

	@Override
	public boolean remove(Object o) {
		return func.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return func.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return func.retainAll(c);
	}

	@Override
	public int size() {
		return func.size();
	}

	@Override
	public Object[] toArray() {
		return func.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return func.toArray(a);
	}

	@Override
	public void initFromFile(String file) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveToFile(String file) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawFunctions(int width, int height, Range rx, Range ry, int resolution) {
		StdDraw.setCanvasSize(width+5, height+5); // setting the canvas size
		StdDraw.setXscale(rx.get_min()-3, rx.get_max()+3); // setting the x scale
		StdDraw.setYscale(ry.get_min()-3, ry.get_max()+3); // setting the y scale 
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.005);
		
		StdDraw.setFont(new Font("TimesRoman", Font.BOLD, 15));
		StdDraw.line(rx.get_min(), 0, rx.get_max(), 0); //setting the x axis
		StdDraw.line(0, ry.get_min(), 0, ry.get_max()); //setting the y axis
		
		Iterator<function> x = this.iterator();
		while(x.hasNext()) {
			function y = x.next();
			double step = (Math.abs(rx.get_min())+Math.abs(rx.get_max()))/resolution;
			int R = (int)(Math.random()*256);
			int G = (int)(Math.random()*256);
			int B= (int)(Math.random()*256);
			Color color = new Color(R, G, B);
			StdDraw.setPenColor(color);
			for (double i = rx.get_min(); i < rx.get_max(); i+=step) {
				StdDraw.line(i, y.f(i), i+step, y.f(i+step));
			}
		}
		
		
		
		
		
	}

	@Override
	public void drawFunctions(String json_file) {
		// TODO Auto-generated method stub
		
	}
	

}
