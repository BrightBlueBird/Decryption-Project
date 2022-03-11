package Trial;

public class Student {
  private String name;
  private double avgGrade;
  private int yearOfBirth;

  void setName(String set) {
    if (!set.equals(""))
      name = set;
    else
      name = "N/A";
  }
  Student () {}
  Student (int y) { // konstruktør som sætter yearOfBirth
    yearOfBirth = y;
  }

  String getName () {
    return name;
  }
  int getYearOfBirth () {
    return yearOfBirth;
  }

}
