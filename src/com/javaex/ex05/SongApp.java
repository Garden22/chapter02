package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {

		Song GoodDay = new Song();
		GoodDay.setArtist("아이유");
		GoodDay.setTitle("좋은날");
		GoodDay.setAlbum("Real");
		GoodDay.setYear(2010);
		GoodDay.setTrack(3);
		GoodDay.setComposer("이민수");
		GoodDay.showInfo();
		
		
		Song Lie = new Song();
		Lie.setArtist("BIGBANG");
		Lie.setTitle("거짓말");
		Lie.setAlbum("Always");
		Lie.setYear(2007);
		Lie.setTrack(2);
		Lie.setComposer("G-DARGON");
		Lie.showInfo();
		
		
		Song Ending = new Song();
		Ending.setArtist("버스커버스커");
		Ending.setTitle("벚꽃엔딩");
		Ending.setAlbum("버스커버스커1집");
		Ending.setYear(2012);
		Ending.setTrack(4);
		Ending.setComposer("장범준");
		Ending.showInfo();

	}

}
