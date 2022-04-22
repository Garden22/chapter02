package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {

		Song s01 = new Song();
		s01.setArtist("아이유");
		s01.setTitle("좋은날");
		s01.setAlbum("Real");
		s01.setYear(2010);
		s01.setTrack(3);
		s01.setComposer("이민수");
		s01.showInfo();
		
		
		Song s02 = new Song();
		s02.setArtist("BIGBANG");
		s02.setTitle("거짓말");
		s02.setAlbum("Always");
		s02.setYear(2007);
		s02.setTrack(2);
		s02.setComposer("G-DARGON");
		s02.showInfo();
		
		
		Song s03 = new Song();
		s03.setArtist("버스커버스커");
		s03.setTitle("벚꽃엔딩");
		s03.setAlbum("버스커버스커1집");
		s03.setYear(2012);
		s03.setTrack(4);
		s03.setComposer("장범준");
		s03.showInfo();
		
		/*System.out.println(s01.toString());*/
	}

}
