class Student {
    protected String studentName;
    protected int academicScore;

    public Student(String studentName, int academicScore) {
        this.studentName = studentName;
        this.academicScore = academicScore;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAcademicScore() {
        return academicScore;
    }
}

class Sports {
    protected int sportsScore;

    public Sports(int sportsScore) {
        this.sportsScore = sportsScore;
    }

    public int getSportsScore() {
        return sportsScore;
    }
}

class Result {
    private Student student;
    private Sports sports;

    public Result(Student student, Sports sports) {
        this.student = student;
        this.sports = sports;
    }

    public void displayScores() {
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Academic Score: " + student.getAcademicScore());
        System.out.println("Sports Score: " + sports.getSportsScore());
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", 85);
        Sports sports = new Sports(90);
        Result result = new Result(student, sports);
        result.displayScores();
    }
}
