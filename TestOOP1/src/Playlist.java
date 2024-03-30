public class Playlist {
	private String name;
	private Song[] songs;
	private int numOfSongs;
	public Playlist(String name, int capacity) {
		this.name = name;
		songs = new Song[capacity];
		numOfSongs = 0;
	}

	public boolean exists(String name,String performerName){
		for (int i = 0; i < numOfSongs; i++) {
			if (this.songs[i].getName().equals(name) && this.songs[i].getPerformerName().equals(performerName)){
				return true;
			}
		}
		return false;
	}

	public Song[] getSongs() {
		return songs;
	}

	public void addSong(Song song) {
		if (numOfSongs < songs.length) {
			songs[numOfSongs] = song;
			numOfSongs++;
		} else {
			System.out.println("Playlist is full. Cannot add song.");
		}
	}

	public int getNumOfSongs() {
		return numOfSongs;
	}
}
