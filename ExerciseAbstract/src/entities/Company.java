package entities;

public class Company extends TaxPayers {

	private Integer employees;

	public Company() {
	}

	public Company(String name, Double anualIncome, Integer employees) {
		super(name, anualIncome);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	@Override
	public double taxesPaid() {
		return (employees > 10) ? getAnualIncome() * .14 : getAnualIncome() * .16;
//		if (employees > 10) {
//			return getAnualIncome() * .14;
//		} else {
//			return getAnualIncome() * .16;
//		}
	}

}
