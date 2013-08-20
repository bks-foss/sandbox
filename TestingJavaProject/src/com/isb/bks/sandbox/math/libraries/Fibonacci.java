package com.isb.bks.sandbox.math.libraries;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	private static List<BigInteger> fibCache = new ArrayList<BigInteger>();
	static {
		fibCache.add(BigInteger.ZERO);
		fibCache.add(BigInteger.ONE);
	}

	/**
	 * Precalculates fibonacci number lower than a given number
	 * 
	 * @param max
	 *            max number
	 * @return list of numbers
	 */
	public static List<Integer> findUpTo(int max) {
		List<Integer> ret = new ArrayList<Integer>();

		int num = 0, fibNum = 0;

		while (fibNum < max) {
			ret.add(fibNum);
			num += 1;
			fibNum = fib(num).intValue();
		}

		return ret;
	}

	/**
	 * Calculates the n-ism number of the fibonacci sequence, using the cache if it's available
	 * 
	 * @param n
	 *            number
	 * @return number calculated
	 */
	public static BigInteger fib(int n) {
		if (n >= fibCache.size()) {
			fibCache.add(n, fib(n - 1).add(fib(n - 2)));
		}
		return fibCache.get(n);
	}
}
