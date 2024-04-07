public class MainEx3 {
	public static void main(String[] args) {

		BasketBaller player1 = new BasketBaller("Player 1", new int[]{10, 5, 15}, new int[]{8, 12, 6}, new int[]{8, 10, 12});
		BasketBaller player2 = new BasketBaller("Player 2", new int[]{10, 20, 5}, new int[]{8, 12, 14}, new int[]{12, 11, 10});

		BasketBaller[] players = {player1, player2};

		System.out.println(getMaxTripleDoubler(players));

	}
	public static String getMaxTripleDoubler(BasketBaller[] players){
		int countTripleDoubles = 0;
		int point = 0;
		int rebound = 0;
		int assists1 = 0;
		String namePlayer = "";
		int maxTripleDoubles = 0;
		for (int i = 0; i < players.length; i++) {
			for (int j = 0; j < players[i].getPoints().length ; j++) {
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
