public class Song {
	private String name;
	private String performerName;
	private int length;

	public Song(String name, String performerName, int length){
		this.name = name;
		this.performerName = performerName;
		this.length = length;
	}

	public String toString(){
		return getClass().getSimpleName() +"---> " + name +
				"/" + performerName + ":" + length;
	}

	public String getName() {
		return name;
	}

	public String getPerformerName() {
		return performerName;
	}

	public int getLength() {
		return length;
	}
}
