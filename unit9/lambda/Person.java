package lambda;

import java.time.LocalDate;

public class Person {

  private String name;
  private LocalDate birthDate;
  private String emailAddress;
  private Sex gender;

  public Person(String name, LocalDate birthDate, String emailAddress, Sex gender) {
    this.name = name;
    this.birthDate = birthDate;
    this.emailAddress = emailAddress;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Sex getGender() {
    return gender;
  }

  public void setGender(Sex gender) {
    this.gender = gender;
  }

  public void printPerson() {
    System.out.printf("name : %s, Email : %s, Gender : %d, BirthDate : %s", name, emailAddress, gender);
  }

}

enum Sex {
  FEMALE, MALE;
}
