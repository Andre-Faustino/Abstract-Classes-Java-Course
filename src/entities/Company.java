package entities;

public class Company extends Taxpayer {


	private Integer employeesNumber;
	
	public Company(String name, Double annualIncome, Integer employeesNumber) {
		super(name, annualIncome);
		this.employeesNumber = employeesNumber;
	}

	public Integer getEmployeesNumber() {
		return employeesNumber;
	}



	public void setEmployeesNumber(Integer employeesNumber) {
		this.employeesNumber = employeesNumber;
	}

	@Override
	public Double taxCalc() {
		if(employeesNumber > 10) {
			return getAnnualIncome() * 0.14;
		}else {
			return getAnnualIncome() * 0.16;
		}
	}



	

}
