package btsession03.thuchanh02;

public class Student {
    private String studentId;
    private String studentName;
    private  String sex;
    private String className;
    private int age;
    private String address;

    public Student() {
        studentId = "MSV001";
        studentName = "Hải";
        sex = "Nam";
        className = "HN240408";
        age = 26;
        address = "Hà Nội";
    }

    public Student(String studentId, String studentName, String sex, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", sex='" + sex + '\'' +
                ", className='" + className + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
