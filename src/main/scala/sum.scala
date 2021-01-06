object Sum{

	def id(x: Int): Int = x
	def cube(x: Int): Int = x*x*x
	def sum(f: Int => Int, a: Int, b: Int):Int={

		if (a > b) 0
		else
			f(a) + sum(f, a+1, b)
	}
	def main(args: Array[String]):Unit={

			val result: Int = Sum.sum(Sum.id, 1, 1)
			System.out.println("Result is="+result)
	
	}
}
