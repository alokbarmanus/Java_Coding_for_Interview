package java8.calculate.avg.score.of.students;

public class Student {
	
	private final String name;
	private final String subject;
	private final double score;
	
	public Student(String name, String subject, double score) {
		super();
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public double getScore() {
		return score;
	}

}
