package entities;

public class Individual extends Taxpayer{

	private Double healthCosts;
		
	
	public Individual(String name, Double annualIncome, Double healthCosts) {
		super(name, annualIncome);
		this.healthCosts = healthCosts;
	}
	
	public Double getHealthCosts() {
		return healthCosts;
	}

	public void setHealthCosts(Double healthCosts) {
		this.healthCosts = healthCosts;
	}



	@Override
	public Double taxCalc() {
		if(getAnnualIncome() >= 20000) {
			return getAnnualIncome() * 0.25 - healthCosts * 0.5;
		}else {
			return getAnnualIncome() * 0.15 - healthCosts * 0.5;
		}
	}
	

	
}
