public class MainEx3 {
	public static void main(String[] args) {

	}
	public static String getMaxTripleDoubler(BasketBaller[] players){
		int countTripleDoubles = 0;
		int point = 0;
		int rebound = 0;
		int assists1 = 0;
		String namePlayer = "";
		int maxTripleDoubles = 0;
		for (int i = 0; i < players.length; i++) {
			for (int j = 0; j < players[i].getName().length() ; j++) {
				point = players[i].getPoints()[j];
				rebound = players[i].getRebounds()[j];
				assists1 = players[i].getAssists()[j];
				if (point > 9 && rebound > 9 && assists1 > 9) {
					countTripleDoubles++;
				}
			}
			if (countTripleDoubles > maxTripleDoubles){
				maxTripleDoubles = countTripleDoubles;
				namePlayer = players[i].getName();
			}
			countTripleDoubles = 0 ;
		}
		return namePlayer;
	}
}
