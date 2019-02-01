package chapterTwo.exercices.preamble.partTwo.caseThree;

public class Result {

    private double mark;
    private Student student;
    private Course course;

    public Result(Course course, Student student, double mark) {
        this.course = course;
        this.student = student;
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
