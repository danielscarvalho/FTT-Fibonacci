package br.edu.cefsa.ftt.ec;

public class Fibonacci {

	    long getFibonacci(int n) {
	        if (n < 2) {
	            return n;
	        } else {
	            return getFibonacci(n - 1) + getFibonacci(n - 2);
	        }
	    }    
}
