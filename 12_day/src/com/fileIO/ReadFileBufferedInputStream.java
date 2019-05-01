package com.fileIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class ReadFileBufferedInputStream {

	public static void main(String[] args) {
		try (BufferedInputStream bio = new BufferedInputStream(new FileInputStream("testFile.txt"))) {
			int i;
			while ((i = bio.read()) != -1)
				System.out.println(i);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
