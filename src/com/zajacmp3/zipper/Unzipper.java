package com.zajacmp3.zipper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Unzipper {
	public static void unzip(String args[]) throws IOException{
		System.out.println("Unzipping");
		File plik = new File(args[0]); //Source file
		FileInputStream fin = new FileInputStream(plik);
		ZipInputStream zin = new ZipInputStream(fin);

		ZipEntry ze = zin.getNextEntry();
		String name = ze.getName();

		FileOutputStream fout = new FileOutputStream(new File(args[1]));
		byte[] buffer = new byte[1024];
		int read = 0;
		System.out.println(name);
		while((read = zin.read(buffer)) !=-1){
			//Szyfrowanie szyfrowanie = new Szyfrowanie();
			//buffer = szyfrowanie.odszyfrowanie(buffer);
			fout.write(buffer, 0, read);
		}
		zin.closeEntry();
		fin.close();
		zin.close();
		fout.close();
	}
}