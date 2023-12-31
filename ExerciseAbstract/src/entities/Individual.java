package entities;

public class Individual extends TaxPayers {

	private double healthExpenditures;

	public Individual() {
	}

	public Individual(String name, Double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	@Override
	public double taxesPaid() {
		return (getAnualIncome() < 2000 ? getAnualIncome() * .15 - healthExpenditures * .50
				: getAnualIncome() * .25 - healthExpenditures * .50);
//		if (getAnualIncome() < 20000) {
//			return getAnualIncome() * .15 - healthExpenditures * .50;
//		} else {
//			return getAnualIncome() * .25 - healthExpenditures * .50;
//		}
	}

}
