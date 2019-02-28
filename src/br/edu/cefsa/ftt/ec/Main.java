package br.edu.cefsa.ftt.ec;

public class Main {

    public static void main(String[] args) {   
    	
    Fibonacci fibo = new Fibonacci();
	     
    for (int i = 0; i < 40; i++) {
            System.out.println(+ i + ": " + fibo.getFibonacci(i) );
        }
  
    }
	
	
}
