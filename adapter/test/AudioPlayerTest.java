package com.saftware.pattern.adapter;

public class AudioPlayerTest {

	
	public static void main(String args[]){
		
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "Mayakkam Enna.mp3");
		
		audioPlayer.play("vlc", "uthamavillain.vlc");
		
		audioPlayer.play("mp4", "anegan.mp4");
		
		audioPlayer.play("mp", "anegan.mp");
	}
}
