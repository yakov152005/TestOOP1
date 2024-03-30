public class MainEx2 {
	public static void main(String[] args) {

	}
	public static Candidate mostSuitable(Candidate[] candidates, int type){
		int maxAvg = 0;
		int avg = 0;
		int maxYears = 0;
		int years = 0;
		int minSalary = 0;
		int salaryExpectations = 0;
		int currentCandidate = 0;
		for (int i = 0; i < candidates.length; i++) {
			if (type == 1){
				if (candidates[i].suitableApplicant() == 1) {
					avg = candidates[i].getAvgGrades();
				}
				if (avg > maxAvg){
					maxAvg = avg;
					currentCandidate = i;
				}
			}else if (type == 2){
				if (candidates[i].suitableApplicant() == 2) {
					years = candidates[i].getYearsOfExperience();
				}
				if (years > maxYears){
					maxYears = years;
					currentCandidate = i;
				}
			}else if (type == 0){
				if (candidates[i].suitableApplicant() == 0){
					salaryExpectations = candidates[i].getSalaryExpectations();
				}
				if (salaryExpectations < minSalary){
					minSalary = salaryExpectations;
					currentCandidate = i;
				}
			}
		}
		return candidates[currentCandidate];
	}
}
