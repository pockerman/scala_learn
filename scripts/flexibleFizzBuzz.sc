/// This is exercise 3.5 from book Hands on Scala
def flexibleFizzBuzz(callback: String => Unit): Unit = {

	for(i <- Range.inclusive(1, 100)){
	
		callback(
		
			if ( i % 3 == 0 && i % 5 ==0) "FizzBuzz"
			else if (i % 3 == 0) "Fizz"
			else if (i % 5 == 0) "Buzz"
			else i.toString
		)
	}
}

// call the function
flexibleFizzBuzz(s => println(s))
