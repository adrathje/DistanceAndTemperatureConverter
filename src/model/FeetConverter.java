package model;

//Austin Rathje

public class FeetConverter {
	private double feet;
	private double meters;
	private final double FEET_CONVERSION = 0.3048;
	
	/**
	 * Default constructor that takes no arguments.
	 */
	public FeetConverter() {}
	
	/**
	 * Non-default constructor that takes all arguments.
	 * @param feet
	 */
	public FeetConverter(double feet) {
		this.feet = feet;
		calculateMeters(feet);
	}

	/**
	 * takes the number of meters and converts it to feet, updating attribute.
	 * @param meters
	 */
	public void calculateMeters(double feet) {
		double calculatedMeters = feet * FEET_CONVERSION;
		calculatedMeters = Math.round(calculatedMeters * 100.0) / 100.0;
		setMeters(calculatedMeters);
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