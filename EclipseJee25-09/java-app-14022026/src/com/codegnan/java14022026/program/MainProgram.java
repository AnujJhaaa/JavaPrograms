package com.codegnan.java14022026.program;

import com.codegnan.java14022026.file.FileHandling;

public class MainProgram {
	public static void main(String[] args) {
		FileHandling file = new FileHandling();
		
		//file.readFileUsingCharacterStream("/Users/anujjha/Downloads/20MB-TESTFILE.ORG.pdf");
		file.readFileUsingBufferedCharacterStream("/Users/anujjha/Downloads/20MB-TESTFILE.ORG.pdf");
		
		//file.writeFileUsingBytesStream("/Users/anujjha/Downloads/20MB-TESTFILE.ORG.pdf","/Users/anujjha/Downloads/20MB-TESTFILEcopy.ORG.pdf");
		file.writeFileUsingBufferedBytesStream("/Users/anujjha/Downloads/20MB-TESTFILE.ORG.pdf","/Users/anujjha/Downloads/20MB-TESTFILEcopy.ORG.pdf");
		
	}
}
