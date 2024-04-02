class Student {
    protected String studentName;
    protected int academicScore;

    public Student(String studentName, int academicScore) {
        this.studentName = studentName;
        this.academicScore = academicScore;
    }
}

class Sports {
    protected int sportsScore;

    public Sports(int sportsScore) {
        this.sportsScore = sportsScore;
    }
}

class Result extends Student, Sports {
    public Result(String studentName, int academicScore, int sportsScore) {
        super(studentName, academicScore);
        this.sportsScore = sportsScore;
    }

    public void displayScores() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Academic Score: " + academicScore);
        System.out.println("Sports Score: " + sportsScore);
    }
}

public class Main {
    public static void main(String[] args) {
        Result result = new Result("John", 85, 90);
        result.displayScores();
    }
}
