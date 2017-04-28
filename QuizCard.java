public class QuizCard {

	private String question;
	private String answer;

	public QuizCard(String q, String a) {
		question = q;
		answer = a;
	}

	public String getAnswer() {
		return answer;
	}

	public String getQuestion() {
		return question;
	}
}
