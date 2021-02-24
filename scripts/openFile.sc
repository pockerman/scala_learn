import java.io.File


def openFile(filename: String): File = {

	val file = new File(filename)
	val exists = file.exists
	exists match{
	
	case true => file
	case false => error(s"Data directory path doesn't exist! $shakespeare")
	
	}

}
