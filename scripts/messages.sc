def info(message: String): String={
	println(message)
	message
}

def error(message: String): String = {

	val fullMessage=s"""        
	|  ********************************************************************        
	|        
	|  ERROR: $message        
	|        
	|********************************************************************          
	|""".stripMargin
	println(fullMessage)
	fullMessage

}
