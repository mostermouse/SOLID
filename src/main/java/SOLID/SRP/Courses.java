package SOLID.SRP;

import java.util.List;

public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multilyCreditAndCourseGrade() {
        return courses.stream()
                .mapToDouble(Course :: multiplyCreditAndCourseGrade)
                .sum();

        /*double multipliedCreditAndCourseGrade = 0;
        for(Course course : courses){
            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
        }
        return multipliedCreditAndCourseGrade;*/
    }

    public int calculateTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(Course :: getCredit)
                .sum();
    }
}
