package it.unibo.oop.lab05.ex3;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet; 
import java.util.Set; 

public class WarehouseImpl implements Warehouse {
	
	public final Set<Product> set = new HashSet<>(); 
	
	public WarehouseImpl() {
		
	}

	public void addProduct(Product p) {
		this.set.add(p);
	}

	public Set<String> allNames() {
		final Set<String> s = new HashSet<>(); 
		for(final Product p : this.set) {
			s.add(p.getName()); 
		}
		return s; 
	}
	
	public Set<Product> allProducts() {
		return set; 
	}

	public boolean containsProduct(Product p) {
		// TODO Auto-generated method stub		
		return set.contains(p);
	}

	//ritorna il num di volte che compare quel prodotto, -1 se non c'è
	public double getQuantity(String name) {
		// TODO Auto-generated method stub
		for(final Product p: this.set) {
			if(p.getName().equals(name)) {
				return p.getQuantity(); 
			}
		}
		return -1; 
	}

}
