package pkRemoveContainer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RemoveContainer {
	
	public static final String xmlFile = "c://test.xml";

	public static void main(String[] args) throws IOException {
		
				String contents = new String(Files.readAllBytes(Paths.get(xmlFile))); 
				System.out.println(contents);

	}

}
