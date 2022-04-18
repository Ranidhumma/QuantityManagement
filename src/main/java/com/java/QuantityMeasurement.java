package com.java;

public class QuantityMeasurement {

	public Double value;
	private Object feet;

	public QuantityMeasurement(double value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuantityMeasurement other = (QuantityMeasurement) obj;
		if (feet == null) {
			if (other.feet != null)
				return false;
		} else if (!feet.equals(other.feet))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

}