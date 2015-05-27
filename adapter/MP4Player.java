package com.saftware.pattern.adapter;

public class MP4Player implements AdvancedMediaPlayer{

	public void playVLC(String file) {
		
		System.out.println("Cannot play VLC"+file);
	}

	public void playMP4(String file) {
		System.out.println("Playing MP4 file"+file);
		
		
	}
	
}
