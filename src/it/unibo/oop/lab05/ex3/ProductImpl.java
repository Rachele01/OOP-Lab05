package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {
	
	private final String name; 
	private final double quantity; 

	public ProductImpl(final String n, final double q) {
		super(); 
		this.name = n; 
		this.quantity = q; 
	}

	public String getName() {	
		return name; 
	}

	public double getQuantity() {
		return quantity;
	}
	
	public int HashCode() {
		return name.hashCode(); 
	}
	
	public boolean equals(final Object obj) {
		if(obj instanceof Product) {
			final var pr = (Product) obj; 
			return name.equals(pr.getName()); 
		}
		return false; 
	}
	
	public final String toString() {
		return "ProductImpl [name =" + name + ", quantity =" + quantity + "]"; 
	}

}
