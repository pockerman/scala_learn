/// simple integrator example
def integrate(a: Double, b: Double, n: Int, callback: (Double => Double)): Double ={

	val h: Double = (b-a)/n
	
	var result: Double = callback(a)*0.5*h
	
	for(i <- Range.inclusive(1, n-1)){
	
		val x0 = a + i*h
		result += callback(x0)*h
	}
	
	result += callback(b)*0.5*h
	result
}

def square(x: Double): Double={

	x*x
}

println("Integration of x^2 in [0,1] is: "+integrate(0.0, 1.0, 10, square))
