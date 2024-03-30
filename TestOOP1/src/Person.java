public class Person {
	private String name;
	private int age;
	private Person[] children;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.children = new Person[0];
	}

	public Person[] getChildren() {
		return children;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}


	public boolean hasChildren() {
		if (children.length > 0)
			return true;
		else
			return false;
	}

	public boolean isGrandFather() {
		for (int i = 0; i < children.length; i++) {
			if (children[i].hasChildren())
				return true;
		}
		return false;
	}

	public boolean addChild(Person child) {
		if (child.getAge() - this.getAge() >= 18 || child.getAge() >= 18) {
			Person[] newChildren = new Person[children.length + 1];
			for (int i = 0; i < children.length; i++) {
				newChildren[i] = children[i];
			}
			newChildren[children.length] = child;
			children = newChildren;
			return true;
		}else {
			return false;
		}

	}
	public Person getYoungestChild() {
		if (children.length == 0)
			return null;
		else {
			Person youngest = children[0];
			for (int i = 1; i < children.length; i++) {
				if (children[i].getAge() < youngest.getAge()) {
					youngest = children[i];
				}
			}
			return youngest;
		}
	}
	public char mostCommonStartingLetter() {
		String allNames = this.name +" " ;
		for (int i = 0; i < children.length; i++) {
			allNames +=children[i].name +" ";
			for (int j = 0; j < children[i].children.length; j++) {
				allNames += children[i].children[j].name +" ";
			}
		}
		return findMostCommonStartingLetter(allNames);
	}

	private char findMostCommonStartingLetter(String names) {
		int[] counts = new int[26];
		String res =names.trim();
		String[] strings = res.split(" ");
		for (int i = 0; i < strings.length ; i++) {
			char c = Character.toLowerCase(strings[i].charAt(0));
					counts[c - 'a']++;
			}

		int maxCount = 0;
		char mostCommonLetter = ' ';
		int index = 0;
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > maxCount) {
				maxCount = counts[i];
				mostCommonLetter = (char) ('a' + index);
			}
			index++;
		}
		return mostCommonLetter;
	}

	public int compareGrandchildren(Person other) {
		int thisGrandchildrenCount = countGrandchildren();
		int otherGrandchildrenCount = other.countGrandchildren();
		if (thisGrandchildrenCount > otherGrandchildrenCount) {
			return 1;
		} else if (thisGrandchildrenCount < otherGrandchildrenCount) {
			return -1;
		} else {
			return 0;
		}
	}

	private int countGrandchildren() {
		int count = 0;
		for (int i = 0; i < children.length; i++) {
			count += children[i].children.length;
		}
		return count;
	}
}



