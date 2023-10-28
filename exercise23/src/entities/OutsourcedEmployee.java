package entities;

public class OutsourcedEmployee extends Employee {

	private Double additionalCharge;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	@Override
	public Double payment() {
//		return super.payment() + 1.1 * additionalCharge;
		return super.payment() + 1.1 * additionalCharge;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
