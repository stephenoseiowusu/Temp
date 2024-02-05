package Day4;

import java.text.DecimalFormat;

public class Employee {
	
	public String name,  phonenumber;
	private double salary, bonus;
    protected int noOfHours, age;
    DecimalFormat decimalFormat;
    public Employee(String name, int age,String phonenumber, double salary, double bonus) {
    	this.name = name;
    	this.age = age;
    	this.salary = salary;
    	this.phonenumber = phonenumber;
    	this.bonus = bonus;
    	
    }
    
    private static boolean CompareTwoEmployeesFirstName(Employee one, Employee two) {
    	if(one.name.equalsIgnoreCase(two.name)) {
    		System.out.println("They are equal");
    		return true;
    	}else {
    		return false;
    	}
    }
    
    public double getSalaryPlusBonus() {
    	return (this.salary + this.bonus);
    }
    private void updateHours(int hours) {
    	this.noOfHours = hours;
    }
    public void setSalary(double salaray) {
    	this.salary = salary;
    }
    public void setPhoneNumber(String phonenumber) {
    	this.phonenumber = phonenumber;
    }
    private void setSalaray(double salary) {
    	this.salary = salary;
    }
    
    public double getPayPerWeek() {
    	return this.salary / 52;
    }
    
    public static void main(String[]args) {
    	Employee emp1 = new Employee("Josh",51,"7884938273",99000,2500);
    	Employee emp2 = new Employee("Josh",51,"7884938273",90000,1500);
    	Employee.CompareTwoEmployeesFirstName(emp1, emp2);
    	double fullSalaryEmployeeOne = emp1.getSalaryPlusBonus();
    	double fullSalaryEmployeeTwo = emp2.getSalaryPlusBonus();
    	System.out.println("Employee 1 full salary: " + fullSalaryEmployeeOne);
    	System.out.println("Employee 2 full salary: " + fullSalaryEmployeeTwo);
    	emp1.updateHours(40);
    	emp2.updateHours(40);
    	//DecimalFormat decimalFormat = new DecimalFormat("#.##");
    	//System.out.println("Weekly take home is approx. : " +  decimalFormat.format(Math.round(emp1.getPayPerWeek())));
    	
    }
    
}
