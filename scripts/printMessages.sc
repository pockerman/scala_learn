/// This is exercise 3.6 from book Hands on Scala

class Msg(val id: Int, val parent: Option[Int], val txt: String)

def printMessages(messages: Array[Msg]): Unit = {

	def printMsg(parent: Option[Int], indentSymbol: String): Unit = {
	
		for(message <- messages if message.parent == parent){
		
			println(s"$indentSymbol#${message.id} ${message.txt}")
			printMsg(Some(message.id), indentSymbol + "    ")
		}
	}
	
	printMsg(None, "")

}

// test
printMessages(Array(
  new Msg(0, None, "Hello"),
  new Msg(1, Some(0), "World"),
  new Msg(2, None, "I am Cow"),
  new Msg(3, Some(2), "Hear me moo"),
  new Msg(4, Some(2), "Here I stand"),
  new Msg(5, Some(2), "I am Cow"),
  new Msg(6, Some(5), "Here me moo, moo")
))
