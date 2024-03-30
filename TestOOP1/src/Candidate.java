public class Candidate {
	private int yearsOfExperience;
	private int salaryExpectations;
	private String programmingLanguages;
	private int avgGrades;
	public final String[] pLanguages = {"JAVA", "JAVASCRIPT", "PYTHON"};

	public int getAvgGrades() {
		return avgGrades;
	}
	public int getSalaryExpectations() {
		return salaryExpectations;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public String getProgrammingLanguages() {
		return programmingLanguages;
	}
	public int suitableApplicant(){
		int res = 0;
		int counter = 0;
		if (this.avgGrades >= 80 && this.salaryExpectations <= 16000){
			for (int i = 0; i < pLanguages.length; i++) {
				if (this.programmingLanguages.contains(pLanguages[i])){
					counter++;
				}
			}
			if (counter>=2){
				res = 1;
			}
		}else if (this.yearsOfExperience >=3 && this.salaryExpectations <= 30000){
			for (int i = 0; i < pLanguages.length; i++) {
				if (this.programmingLanguages.contains(pLanguages[i])){
					counter++;
				}
			}
			if (counter == 3){
				res = 2;
			}
		}
		return res;
	}
}
