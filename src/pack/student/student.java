package pack.student;

public class student {
    private String student_name;
    private  String course;

    public student(String student_name, String course) {
        this.student_name = student_name;
        this.course = course;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
