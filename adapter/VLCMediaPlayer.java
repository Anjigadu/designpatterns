package com.saftware.pattern.adapter;

public class VLCMediaPlayer implements AdvancedMediaPlayer{

	public void playVLC(String file) {
		System.out.println("Playing VLC file"+file);
		
	}

	public void playMP4(String file) {
		System.out.println("Cannot play MP4"+file);
		
	}
	
	

}
