 class Student {
     protected String studentName;
     protected int academicScore;

     public Student(String studentName, int academicScore) {
         this.studentName = studentName;
         this.academicScore = academicScore;
         // this.sportsScore = sportsScore;
     }

     public void displayAcademicScore() {
         System.out.println("Academic Score of: " + studentName + ":" + academicScore);
     }
 }
class Sports{
    protected int sportsScore;

    public Sports(int sportsScore){
        this.sportsScore = sportsScore;
    }
    public void displaySportsScore(){
        System.out.println("Sports Score: "+ sportsScore);
    }
}
class Result extends Student {
    private Sports sports;

    public Result(String studentName, int academicScore, int sportsScore){
        super(studentName, academicScore);
        this.sports = new Sports(sportsScore);
    }
   public void displayScores(){
        super.displayAcademicScore();
        sports.displaySportsScore();
    }
}
class Output{
    public static void main(String[] args){
        Result result = new Result("John",85,90);
        result.displayScores();
    }
}
