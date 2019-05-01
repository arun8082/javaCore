package com.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFileBufferReader {

	public static void main(String[] args) {
		try (BufferedReader bio = new BufferedReader(new FileReader("testFile2.txt"))) {
			String line=null;
			while ((line = bio.readLine()) != null)
				System.out.println(line);
			System.out.println("\nEnd of file............................");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
