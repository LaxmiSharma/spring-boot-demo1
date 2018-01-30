package com.auth0.samples.authapi.security;

public class Test {
	static String n_squares(int n) {
		StringBuffer s = new StringBuffer("0");
		int n_squared = n * n;
		for (int i = 0; i < n_squared; i++) {
			s.append(", " + i);
		}
		return s.toString();
	}

	/*
	 * @Override public void run() { try { Thread.sleep(2000);
	 * System.out.println("A"); } catch (Exception ie) { } }
	 */

	public static void main(String[] args) {
		System.out.println(this);
		
System.out.println(12>>2);
		long startTime = System.currentTimeMillis();
		n_squares(2000);
		long endTime = System.currentTimeMillis();
		System.out.println("time taken : " + (endTime - startTime));
		Integer i = new Integer(99);
		i = 10;
		/*System.out.println(i);
		System.out.println(i.valueOf(10));*/

		/*
		 * Test test = new Test(); test.start();
		 */

	}
}