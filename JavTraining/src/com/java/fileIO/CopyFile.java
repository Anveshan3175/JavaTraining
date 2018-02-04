package com.java.fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String args[])  {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} 
		catch(IOException e){
			e.printStackTrace();
		}
		
		finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}