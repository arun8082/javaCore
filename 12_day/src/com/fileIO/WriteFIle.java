package com.fileIO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.stream.IntStream;

public class WriteFIle {

	public static void main(String[] args) {
		try (BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("testFile.txt", true))) {
			System.out.println(fos);
			//char[] content = "this is test file".toCharArray();

			IntStream.range(0, 100).forEach(i -> {
				try {
					fos.write((int) i);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			
			byte b = '1';
			fos.write(b);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
