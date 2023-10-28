package entities;

public class Employee {
	private Integer idInteger;
	private String nameString;
	private Double salaryDouble;

	public Employee(Integer idInteger, String nameString, Double salaryDouble) {
		this.idInteger = idInteger;
		this.nameString = nameString;
		this.salaryDouble = salaryDouble;
	}

//	public Employee() {
//	}

	public Integer getIdInteger() {
		return idInteger;
	}

	public void setIdInteger(Integer idInteger) {
		this.idInteger = idInteger;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public Double getSalaryDouble() {
		return salaryDouble;
	}

//	public void setSalaryDouble(Double salaryDouble) {
//		this.salaryDouble = salaryDouble;
//	}

	public void salaryIncrease(Double percent) {
		this.salaryDouble *= (percent / 100 + 1);
	}

	@Override
	public String toString() {
		return getIdInteger() + ", " + getNameString() + ", " + String.format("%.2f", getSalaryDouble());
	}
}
