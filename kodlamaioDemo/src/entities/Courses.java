package entities;

public class Courses {
    private int id;
    private String courseName;
    private int coursePrice;

    public Courses(int id,String courseName,int coursePrice) {
        this.id = id;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getCourseName() {

        return courseName;
    }

    public void setCourseName(String courseName) {

        this.courseName = courseName;
    }

    public int getCoursePrice() {

        return coursePrice;
    }

    public void setCoursePrice(int coursePrice) {

        this.coursePrice = coursePrice;
    }
}
