package com.fizzBuzz;
//Me Califico Eugenia Perez 6 / 6
public class FizzBuzz {
	   public void creaFizz(){
		   
			for (int i = 1; i <100; i ++) {
				if(i % 15 == 0) {
					System.out.println(i + ":  Fizz Buzz");
				}else if (i % 3 == 0){
					System.out.println(i + ":  Fizz");
				}else if (i % 5 == 0){
					System.out.println(i + ": Buzz");
				}
			}
		   
	   }
	

		
	}
