package com.zajacmp3.zipper;

public class Szyfrowanie {
	public byte[] szyfrowanie(byte[] buffer){
		for(int temp = 0 ; temp < buffer.length ; temp++){
			buffer[temp] = (byte) (buffer[temp] ^ (byte)2);
		}
		return buffer;
	}
	public byte[] odszyfrowanie(byte[] buffer){
		for(int temp = 0 ; temp < buffer.length ; temp++){
			buffer[temp] = (byte) (buffer[temp] ^ (byte)2);
		}		
		return buffer;
	}
}
