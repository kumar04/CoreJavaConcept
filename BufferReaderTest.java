package com.file.bufferapi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferReaderTest {

	public static String upperCase(String input) {
		StringBuffer buffer = new StringBuffer();
		if (input != null) {
			input = input.toUpperCase();
			for (int i = 0; i < input.length(); i++) {
				if (i % 2 == 0) {
					buffer.append(input.charAt(i));
				} else {
					char ch = (char) (input.charAt(i) + 32);
					buffer.append(ch);
				}

			}
		}
		return buffer.toString();

	}

	public static void main(String args[]) { // reading-side
		System.out.println(upperCase("reader"));
		FileReader fr = null;
		BufferedReader br = null;
		// writing-side
		try {
			fr = new FileReader("/Users/rpatra/Documents/workspace/file-api/src/com/file/bufferapi/input.txt");
			FileWriter fw = new FileWriter(
					"/Users/rpatra/Documents/workspace/file-api/src/com/file/bufferapi/output.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			br = new BufferedReader(fr);

			String s1;
			String[] outputText = null;
			String outputFormat = null;
			while ((s1 = br.readLine()) != null) {
				outputText = s1.split(" ");
				// outputFormat =
				bw.write(s1);
				bw.newLine();
				System.out.println(s1);
			}

			bw.close();
			fw.close();
			br.close();
			fr.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
