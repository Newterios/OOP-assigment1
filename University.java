// University.java
import java.util.ArrayList;
import java.util.List;

public class University {
    private String universityName;
    private String location;
    private List<Course> courses;
    private List<Professor> professors;

    public University() {
        this.courses = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    public University(String universityName, String location) {
        this.universityName = universityName;
        this.location = location;
        this.courses = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void addProfessor(Professor professor) {
        this.professors.add(professor);
    }

    @Override
    public String toString() {
        return "University: " + universityName + ", Location: " + location +
                ", Courses: " + courses.size() + ", Professors: " + professors.size();
    }
}
