package com.isb.bks.sandbox.math.problems;

import java.math.BigInteger;
import java.util.List;

import com.isb.bks.sandbox.math.EulerProblem;
import com.isb.bks.sandbox.math.libraries.PrimeNumbers;

public class Euler3 implements EulerProblem {

	@Override
	public String execute() {
		String resultado = "";
		BigInteger num = new BigInteger("600851475143");
		List<BigInteger> Listado = PrimeNumbers.primeFactors(num);
		resultado = Listado.get(Listado.size() - 1).toString();

		return resultado;
	}

}
