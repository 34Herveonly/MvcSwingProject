public class Model {
private String Firstname;
private String Lastname;
//private int age;
//private String gender;
public Model(String Firstname, String Lastname) {
    this.Firstname= Firstname;
    this.Lastname= Lastname;
  //  this.age = age;
    //this.gender = gender;

}
public String getLastname() {
    return Lastname;
}
public void setLastname(String lastname) {
    this.Lastname = lastname;
}

public String getFirstname() {
    return Firstname;
}
public void setFirstname(String name) {
    this.Firstname = name;
}
/*
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getGender() {
    return gender;
}
public void setGender(String gender) {
    this.gender = gender;
}
*/
}