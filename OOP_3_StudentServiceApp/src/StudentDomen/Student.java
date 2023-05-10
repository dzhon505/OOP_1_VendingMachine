package StudentDomen;

public class Student extends User implements Comparable<Student>{
    private long studId;
    public Student(String fName, String lName, int age, long studId) {
        super(fName, lName, age);
        this.studId = studId;
    }

    public long getStudId() {
        return studId;
    }

    public void setStudId(long studId) {
        this.studId = studId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() + '\'' +
                "studId=" + studId +
                '}';

    }

    @Override
    public int compareTo(Student o) {
        if (this.studId == o.studId){
            return 0;
        }
        if (this.studId < o.studId){
            return -1;
        }return 1;
    }
}
