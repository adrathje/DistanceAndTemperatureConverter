package model;

//Austin Rathje

public class FahrenheitConverter {
	private double fahrenheit;
	private double celsius;

	/**
	 * Default constructor that takes no arguments.
	 */
	public FahrenheitConverter() {
	}

	/**
	 * Non-default constructor that takes all arguments.
	 * Runs methods fahrenheitConverter() and celsiusConverter()
	 * @param fahrenheit
	 * @param celsius
	 */
	public FahrenheitConverter(double fahrenheit) {
		this.fahrenheit = fahrenheit;
		fahrenheitConverter(fahrenheit);
	}

	/**
	 * calculates Celsius and updates attribute
	 * 
	 * @param fahrenheit
	 */
	public void fahrenheitConverter(double fahrenheit) {
		double calculatedCelsius = ((fahrenheit - 32) * 5 / 9);
		calculatedCelsius = Math.round(calculatedCelsius * 100.0) / 100.0;
		setCelsius(calculatedCelsius);
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
