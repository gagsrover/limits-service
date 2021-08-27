package de.gags.microservices.limitsservice;

public class LimitConfig {
	
	private int min;
	
	private int max;

	public LimitConfig(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}

	public LimitConfig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

}
