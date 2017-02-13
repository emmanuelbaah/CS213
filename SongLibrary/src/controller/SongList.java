package controller;

import java.util.ArrayList;

public class SongList {
	
	public Node<Song> PlayList;
	public int size;
	
	public SongList(){
		PlayList = new Node<Song>();
		size = 0;
	}
	
	public void display(){
		
	}
	
	private boolean findSong(String song, ArrayList<Song> songList){
		boolean found = false;
		Song curr = new Song(song,songList.get(0).getArtist());
		for(int i = 0; i < songList.size(); i++){
			if(curr.equals(songList.get(i))){
				found = true;
				break;
			}
		}
		return found;
	}
	
	public void add(String name, String artist) throws Exception{
		ArrayList<Song> artistList = findArtist(artist);
		if(list == null){
			//artist not found, so can add
			
		}else{
			
		}
	}
	
	public void addSong(String song, String artist){
		Song newSong = new Song(song,artist);
		Node<Song> curr = new Node<Song>();

		for(curr = PlayList; curr!=null;){
			if(curr.data.compareTo(newSong) < 0){
				if(curr.right == null){
					curr.right = new Node<Song>(newSong);
				}else{
					curr = curr.right;
				}
			}else if(curr.data.compareTo(newSong) > 0){
				if(curr.left == null){
					curr.left = new Node<Song>(newSong);
				}else{
					curr = curr.left;
				}
			}else{ //song already exists
				System.out.println("THROW EXCEPTION OR SOMETHING");
			}
		}
	}
	
	public void add(Song song){
		
	}
	public Song getSong(Song song){
		
	}
	public void delete(Song song){
		if(PlayList==null || size == 0)
			return;
		if(size == 1){
			size = 0;
			PlayList = null;
		}
			
	}
	public void edit(){
		
	}
	
	public String toString(){
		return PlayList.toString();
	}
}
