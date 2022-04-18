package com.Java;

import org.junit.Assert;
import org.junit.Test;

import com.java.QuantityMeasurement;

public class QuantityTest {
	@Test
	public void given1ftand1ftShouldReturEqual() {
		QuantityMeasurement qmeasurement1 = new QuantityMeasurement(1.0);
		QuantityMeasurement qmeasurement2 = new QuantityMeasurement(1.0);
		Assert.assertEquals(qmeasurement1, qmeasurement2);

	}
}
