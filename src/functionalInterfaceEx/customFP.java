package functionalInterfaceEx;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class course{
	private String name;
	private String categeory;
	private int score;
	private int noofstudents;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategeory() {
		return categeory;
	}
	public void setCategeory(String categeory) {
		this.categeory = categeory;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getNoofstudents() {
		return noofstudents;
	}
	public void setNoofstudents(int noofstudents) {
		this.noofstudents = noofstudents;
	}
	public String toString() {
		return name + ":" + noofstudents + ":" + score;
	}
	public course(String name, String categeory, int score, int noofstudents) {
		super();
		this.name = name;
		this.categeory = categeory;
		this.score = score;
		this.noofstudents = noofstudents;
	}
	
}
public class customFP{
	public static void main(String[] args) {
	List<course> courses=	List.of(new course("Spring", "jdksjbkjn", 23, 440944),
				new course("Springhh"," bvvhgvghv" , 23, 67567),
						new course("Springbhj", "jdksjbkkkjn", 29, 8786),
								new course("Sprinjhjbhjg", "hhjvhgf", 83, 767)
								);
	//allmatch,nonematch,anymatch
	Predicate<course> reviewscoreGreaterthan23 = course -> course.getScore()>19;
	Predicate<course> reviewscorelessthan23 = course -> course.getScore()<21;
	System.out.println(
	courses.stream().allMatch(reviewscoreGreaterthan23));
	System.out.println(
			courses.stream().noneMatch(reviewscorelessthan23));
	System.out.println(
			courses.stream().anyMatch(reviewscorelessthan23));
	
	Comparator<course> comparatobyincreaser=Comparator.comparing(course::getNoofstudents);
	System.out.println(courses.stream().sorted(comparatobyincreaser).collect(Collectors.toList()));
	
	Comparator<course> comparatobydecrease=Comparator.comparing(course::getNoofstudents).reversed();
	System.out.println(courses.stream().sorted(comparatobydecrease).collect(Collectors.toList()));
	
	Comparator<course> comparatobystudentsandscore=Comparator.comparingInt(course::getNoofstudents).thenComparingInt(course::getScore).reversed();
	System.out.println(courses.stream().sorted(comparatobystudentsandscore).collect(Collectors.toList()));

	//limit
	System.out.println(courses.stream().sorted(comparatobystudentsandscore).limit(2).collect(Collectors.toList()));
//skip
	System.out.println(courses.stream().sorted(comparatobystudentsandscore).skip(2).collect(Collectors.toList()));
//takewhile
	System.out.println(courses);
	//takewhile
	System.out.println(courses.stream().takeWhile(course ->course.getScore()>=23).collect(Collectors.toList()));
	//dropwhile
	System.out.println(courses.stream().dropWhile(course ->course.getScore()>=83).collect(Collectors.toList()));

	}

}
