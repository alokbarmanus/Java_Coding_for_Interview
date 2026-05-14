package java8.calculate.avg.score.of.students;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class CalculateAverageScoreForStudents {

	public static void main(String[] args) {
		List<Student> studentArray = Arrays.asList(
				new Student("Peter", "Math", 90),
				new Student("Peter", "Science", 85),
				new Student("Peter", "History", 80),
				new Student("John", "Math", 90),
				new Student("John", "Science", 80),
				new Student("John", "History", 70)
				);
		
		// 1. Calculate overall average score across all students and subjects
		
		OptionalDouble overallAvarage = studentArray.stream().mapToDouble(Student::getScore).average();
		
		overallAvarage.ifPresent(avg -> System.out.println("Overall Avarage: "+avg));
		
		// 2. Calculate average score grouped by student name
		Map<String, Double> avarageByStudent = studentArray.stream().collect(Collectors.groupingBy(
				Student::getName, Collectors.averagingDouble(Student::getScore)));
		System.out.println("Average by student: "+avarageByStudent);
		
		// 3. Calculate average score grouped by subject
		Map<String, Double> avarageBySubject = studentArray.stream().collect(Collectors.groupingBy(
				Student::getSubject, Collectors.averagingDouble(Student::getScore)));
		System.out.println("Avarage by Subject: "+avarageBySubject);
		
	}

}
