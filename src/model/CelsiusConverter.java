package model;

// Austin Rathje

public class CelsiusConverter {
	private double fahrenheit;
	private double celsius;

	/**
	 * Default constructor that takes no arguments.
	 */
	public CelsiusConverter() {
	}

	/**
	 * Non-default constructor that takes all arguments.
	 * Runs methods fahrenheitConverter() and celsiusConverter()
	 * @param fahrenheit
	 * @param celsius
	 */
	public CelsiusConverter(double celsius) {
		this.celsius = celsius;
		celsiusConverter(celsius);
	}

	/**
	 * calculates Fahrenheit and updates attribute
	 * 
	 * @param celsius
	 */
	public void celsiusConverter(double celsius) {
		double calculatedFahrenheit = ((celsius * 9 / 5) + 32);
		calculatedFahrenheit = Math.round(calculatedFahrenheit * 100.0) / 100.0;
		setFahrenheit(calculatedFahrenheit);
	}

	/**
	 * @return the fahrenheit
	 */
	public double getFahrenheit() {
		return fahrenheit;
	}

	/**
	 * @param fahrenheit the fahrenheit to set
	 */
	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	/**
	 * @return the celsius
	 */
	public double getCelsius() {
		return celsius;
	}

	/**
	 * @param celsius the celsius to set
	 */
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

}
