package entities;

public class OrderItem {

	private Integer quantity;
	private Product product;

	public OrderItem() {
	}

	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public Double subTotal() {
		return product.getPrice() * quantity;
	}

	public String toString() {
		return product + ", Quantity: " + quantity + ", Subtotal: $" + String.format("%.2f", subTotal());
	}
}
