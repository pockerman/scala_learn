class Integrator(val a: Double, val b: Double, val n: Int, val intType: String){

	
	def integrate(callback: Double => Double): Double = {
		
		var result: Double = 0.0
		
		if( intType.equals("Trapezoid")) { 

			val h: Double = (b-a)/n
			
			//var result: Double = callback(a)*0.5*h
			result += callback(a)*0.5*h
			
			for(i <- Range.inclusive(1, n-1)){
			
				val x0 = a + i*h
				result += callback(x0)*h
			}
			
			result += callback(b)*0.5*h
			result
		}
		
		
		//case intType => None { 
		println("No integrator has been defined")
		result
		
	}

}

def square(x: Double): Double = x*x
def cube(x: Double): Double = x*x*x

val integrator = new Integrator(0.0, 1.0, 10, "Trapezoid")
println("Integration of x^2 in [0,1] is: "+ integrator.integrate(square))

