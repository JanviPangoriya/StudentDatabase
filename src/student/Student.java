package student;

public class Student {
    private String name;
    private int rollno;
    private int year;
    private double cpi;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", year=" + year +
                ", cpi=" + cpi +
                '}';
    }

    public Student(String name, int rollno, int year, double cpi) {
        this.name = name;
        this.rollno = rollno;
        this.year = year;
        this.cpi = cpi;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }
}
