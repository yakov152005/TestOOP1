public class MainEx4 {
	public static void main(String[] args) {
		Person[] person ={
				new Person("Yakov", 60),
				new Person("daniel", 28),
				new Person("shani", 28),
				new Person("nicole", 28),
				new Person("Yaniv",30)
		};
		Person[] person2 ={
				new Person("Amit", 28),
				new Person("shilo", 28),
				new Person("yaniv", 28),
				new Person("shaked", 28),
				new Person("adi",30),
				new Person("Yoda",30),
				new Person("yona",30)
		};
		person[0].addChild(person2[0]);
		person[0].addChild(person2[1]);
		person[0].addChild(person2[2]);
		person2[0].addChild(person2[3]);
		person2[2].addChild(person2[4]);
		person[0].addChild(person2[5]);
		person[0].addChild(person2[6]);
		person[0].addChild(person[1]);
		person[1].addChild(person[2]);
		person[1].addChild(person[3]);
		person[2].addChild(person[4]);

		System.out.println(person[0].mostCommonStartingLetter());
	}
}
