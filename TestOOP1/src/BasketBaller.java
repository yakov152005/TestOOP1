public class BasketBaller {
	private String name;
	private int[] points;
	private int[] rebounds;
	private int[] assists;

	public int countDoubleDoubles(){
		int countDouDoubles = 0;
		int point = 0;
		int rebound = 0;
		int assists1 = 0;
		for (int i = 0; i < points.length; i++) {
			point = points[i];
			rebound = rebounds[i];
			assists1 = assists[i];
			if (point > 9 && rebound > 9 || point >9 && assists1 > 9 ||
			rebound > 9 && assists1 > 9){
				countDouDoubles++;
			}
		}
		return countDouDoubles;
	}

	public String getName() {
		return name;
	}

	public int[] getAssists() {
		return assists;
	}

	public int[] getPoints() {
		return points;
	}

	public int[] getRebounds() {
		return rebounds;
	}
}
