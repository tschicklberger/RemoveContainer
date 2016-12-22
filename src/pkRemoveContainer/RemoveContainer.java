package pkRemoveContainer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RemoveContainer {
	
	public static final String xmlFile = "c://test.xml";
	public static final String xmlBulkNam = "BBkIDF";
	public static final String xmlBulkTag = "BBkIDFBlkSVV"; 
	public static final String xmlBulkTyp = "FIToFICstmrDrctDbt";
	

	public static void main(String[] args) throws IOException {
		
		int lng = 0;
		int pos = 0;
		
		int begPos = 0;
		int endPos = 0;
		
		String contents = new String(Files.readAllBytes(Paths.get(xmlFile))); 
		
		lng = contents.length();
		
		//System.out.println(contents);
		
		System.out.println("Laenge: " + lng);
		
		pos = contents.indexOf(xmlBulkNam + ":" + xmlBulkTag);
		
		if (pos == -1) {
			System.out.println("Tag nicht gefunden!");
		} else {
			System.out.println("Tag-Position:" + pos);
			
			pos = contents.indexOf(xmlBulkTyp);
			System.out.println("Typ-Position: " + pos);
		}
		
		
		begPos = pos + xmlBulkTyp.length() + 1;
		endPos = contents.indexOf("</" + xmlBulkNam + ":" + xmlBulkTyp);
		
		System.out.println("Start: " + begPos);
		System.out.println("Stopp: " + endPos);
		
		contents = contents.substring(begPos,endPos).replaceAll("sw3:", "");
		
		
		
				

	}

}
