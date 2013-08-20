package com.isb.bks.sandbox.math.problems;

import java.math.BigInteger;

import com.isb.bks.sandbox.math.EulerProblem;
import com.isb.bks.sandbox.math.libraries.PrimeNumbers;

public class Euler7 implements EulerProblem {

	@Override
	public String execute() {

		int numero = 10001;
		PrimeNumbers.preCalculate(numero);
		BigInteger getPrimeNumber = PrimeNumbers.getPrimeNumber(numero - 1);

		return String.valueOf(getPrimeNumber);
	}

}
