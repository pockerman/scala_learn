def sync(src: os.Path, dest: os.Path) = {

	if (!os.exists(src)){
		println("Path does not exist", src)
		
	}
	else{

		for(srcSubPath <- os.walk(src)){
		
			val subPath = srcSubPath.subRelativeTo(src)
			val destSubPath = dest / subPath
			//println((os.isDir(srcSubPath), os.isDir(destSubPath)))
			
			(os.isDir(srcSubPath), os.isDir(destSubPath)) match {
			
				case (false, true) | (true, false) =>
				os.copy.over(srcSubPath, destSubPath, createFolders = true)
				case (false, false) 
				if !os.exists(destSubPath) 
				|| !os.read.bytes(srcSubPath).sameElements(os.read.bytes(destSubPath)) =>
				os.copy.over(srcSubPath, destSubPath, createFolders = true)
				case _ => // do nothing
			
			}
		}
	}

}

sync(os.pwd / "post", os.pwd / "post-copy")
