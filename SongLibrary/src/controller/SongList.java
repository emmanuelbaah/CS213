package controller;

import java.util.ArrayList;

public class SongList {
	
	public Node<Song> PlayList;
	public int size;
	public ArrayList<Song> list;
	
	public SongList(){
		PlayList = new Node<Song>();
		size = 0;
		 list = new ArrayList<Song>();
		
	}
	
	public void display(){
		
	}
	
	private int findSong(String name, String artist){
		int i = 0;
		int result = 0;
		if(size == 0)
			return -2;
		Song curr = new Song(name,artist);
		for(i = 0; i < list.size()-1; i++){
			result = curr.compareTo(list.get(i));
			if( result == 0)
				return i;
		}
		return i;
	}
	
	
	public void add(Song song) throws Exception{
		int index = findSong(song.getName(),song.getArtist());
		if(index == -2) //first addition
			list.add(song);
		else if(list.get(index).equals(song)) //song already exists
			throw new IllegalArgumentException();
		else
			list.add(index,song);
		size++;
	}
		
	//Pass in the song that is to be deleted
	public void delete(Song song){
		if(list==null || size == 0)
			return;
		if(list.size() == 1){
			size = 0;
			list.remove(0);
		}
		int index = findSong(song.getName(),song.getArtist());
		if(index == -1) //song did not exist in list
			throw new IllegalArgumentException();
		list.remove(index);
		size--;
	}

	//Pass in the song to be edited
	public void edit(Song song) throws Exception{
		if(list==null || size == 0)
			return;
		if(list.size() == 1){
			size = 0;
			list.remove(0);
		}
		int index = findSong(song.getName(),song.getArtist());
		if(index == -1) //song did not exist in list
			throw new IllegalArgumentException();
		list.remove(index);
		add(song);
	}
	
	public void addSong2(String song, String artist){
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
	
	public String toString(){
		return list.toString();
	}
}
