/**
 * 
 */
package project2b;

/**
 * @author kwick
 *
 */
public class EmployeeRecord {

	public String firstName, lastName;
	public double hours, payRate, gross, tax, net;
	
	/**
	 * EmployeeRecord empty default constructor
	 */
	public EmployeeRecord() {
		firstName = "";
		lastName = "";
		payRate = gross = tax = net = 0.0;
	}

	/**
	 * Paramatarized Constructor
	 * @param firstName
	 * @param lastName
	 * @param hours
	 * @param payRate
	 */
	public EmployeeRecord(String firstName, String lastName, double hours, double payRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.hours = hours;
		this.payRate = payRate;
	}
	
	/**
	 * Copy Constructor
	 * @param e
	 */
	public EmployeeRecord(EmployeeRecord e) {
		this.firstName = e.firstName;
		this.lastName = e.lastName;
		this.hours = e.hours;
		this.payRate = e.payRate;
	}

	
	/**
	 * toString()
	 */
	@Override
	public String toString() {
		return "EmployeeRecord [firstName=" + firstName + ", lastName=" + lastName + ", hours=" + hours + ", payRate="
				+ payRate + ", gross=" + gross + ", tax=" + tax + ", net=" + net + "]";
	}
	
}
