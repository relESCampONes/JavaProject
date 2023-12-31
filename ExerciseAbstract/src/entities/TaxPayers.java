package entities;

public abstract class TaxPayers {

	private String name;
	private Double anualIncome;

	public TaxPayers() {
	}

	public TaxPayers(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public abstract double taxesPaid();

}
