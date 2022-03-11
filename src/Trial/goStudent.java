package Trial;

public class goStudent {
  void go () {
    Student stud1 = new Student(2016);
    stud1.setName("Peter");
    System.out.println(stud1.getName());
    System.out.println(stud1.getYearOfBirth());
  }
  public static void main(String[] args) {
    new goStudent().go();
  }
}
