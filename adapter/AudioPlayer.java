package com.saftware.pattern.adapter;

public class AudioPlayer implements MediaPlayer{

	MediaAdapter mediaAdapter=null;
	
	public void play(String type,String file){
	
		if(type.equals("mp3"))
			System.out.println("Playing MP3 "+file);
		else {
			mediaAdapter = new MediaAdapter();
			mediaAdapter.play(type, file);
			
		}
	}
}
