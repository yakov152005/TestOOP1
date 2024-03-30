public class MainEx1 {
	public static void main(String[] args) {
		Song s1 = new Song("7 Rings", "Ariana Grande", 185);
		Song s2 = new Song("Hello", "Ariana Grande", 200);
		Song s3 = new Song("Dark", "Eminem", 400);
		System.out.println(s1);
		Playlist[] playlist = new Playlist[2];
		playlist[0] = new Playlist("Yakov",10);
		playlist[1] = new Playlist("Ariana",10);
		playlist[0].addSong(s3);
		playlist[1].addSong(s1);
		playlist[1].addSong(s2);
		String res = longestPlaylist(playlist);
		System.out.println(res);


	}
	public static String longestPlaylist(Playlist[] playlists){
		int currentLength = 0;
		String longestPlaylist = "";
		for (int i = 0; i < playlists.length; i++) {
			int playlistLength = 0;
			for (int j = 0; j < playlists[i].getNumOfSongs(); j++) {
				playlistLength += playlists[i].getSongs()[j].getLength();
			}
			if (playlistLength > currentLength){
				currentLength = playlistLength;
				longestPlaylist = playlists[i].getSongs()[i]+"";
			}
		}
		return longestPlaylist;
	}
}
