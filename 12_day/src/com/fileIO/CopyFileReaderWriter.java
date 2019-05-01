package com.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CopyFileReaderWriter {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("testFile2.txt")); BufferedWriter bw = new BufferedWriter(new FileWriter("testFile2cpy.txt", true)); PrintWriter pw = new PrintWriter(new FileWriter("testFile3cpy.txt"))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				bw.write(line);// appended
				pw.println(line);// new file create
			}
			System.out.println("File copied............");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
