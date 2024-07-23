package tw.com.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ImageTools {
	public static  void updateFile(InputStream inputStream,String fileName)
			throws FileNotFoundException, IOException {
		Path inagePath = Paths.get("C:", "upload_images",fileName);
		File file =  inagePath.toFile();
		//part.getInputStream();
		try(InputStream inputStr = inputStream;
			FileOutputStream out = new FileOutputStream(file)){
			byte[] cache = new byte[1024];
			int index = -1;
			while( (index = inputStr.read(cache)) != -1) {
				out.write(cache, 0, index);
			}
			
		}
	}
	
	public static  List<String> getImageFileNames() throws IOException{
		Path imageDir = Paths.get("C:", "upload_images");
		List<String> imagesList =  Files.list(imageDir).
		map(p->p.getFileName().toString()).
		collect(Collectors.toList());
		return imagesList;
		
	}
}
