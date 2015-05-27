package com.saftware.pattern.adapter;

public class MediaAdapter implements MediaPlayer {

	
	public void play(String type,String file){
		if(type.equals("mp4")){
			new MP4Player().playMP4(file);
		}else if(type.equals("vlc")){
			new VLCMediaPlayer().playVLC(file);
		}else{
			System.out.println("Cant play");
		}
	}
}
