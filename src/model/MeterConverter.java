package model;

//Austin Rathje

public class MeterConverter {
	private double feet;
	private double meters;
	private final double METER_CONVERSION = 3.28084;
	
	/**
	 * Default constructor that takes no arguments.
	 */
	public MeterConverter() {}
	
	/**
	 * Non-default constructor that takes all arguments.
	 * @param meters
	 */
	public MeterConverter(double meters) {
		this.meters = meters;
		calculateFeet(meters);
	}

	/**
	 * takes the number of meters and converts it to feet, updating attribute.
	 * @param meters
	 */
	public void calculateFeet(double meters) {
		double calculatedFeet = meters * METER_CONVERSION;
		calculatedFeet = Math.round(calculatedFeet * 100.0) / 100.0;
		setFeet(calculatedFeet);
	}
	
	/**
	 * @return the meters
	 */
	public double getMeters() {
		return meters;
	}

	/**
	 * @param meters the meters to set
	 */
	public void setMeters(double meters) {
		this.meters = meters;
	}

	/**
	 * @return the feet
	 */
	public double getFeet() {
		return feet;
	}

	/**
	 * @param feet the feet to set
	 */
	public void setFeet(double feet) {
		this.feet = feet;
	}

}
