package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public abstract class Product {
	private final String name;

	private final BigDecimal price;

	private final BigDecimal taxPercent;

	protected Product(String name, BigDecimal price, BigDecimal tax) {

		if (name == null || name == "") {
			throw new IllegalArgumentException("Product name cannot be null or empty");
		}
		
		if (price == null || price.compareTo(new BigDecimal(0)) < 0) {
			throw new IllegalArgumentException("Product price cannot be null");
		}


		this.name = name;
		this.price = price;
		this.taxPercent = tax;

	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public BigDecimal getTaxPercent() {
		return taxPercent;
	}

	public BigDecimal getPriceWithTax() {
		return price.add(price.multiply(taxPercent));

	}

	public Object getTax() {
		// TODO Auto-generated method stub
		return null;
	}

}
