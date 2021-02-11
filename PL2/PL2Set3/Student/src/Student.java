public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private Double gpa;
    private String degree;

    public Student(String firstName, String lastName, String email, Double gpa, String degree) {
        setFirstName(firstName);
        getFirstName();
        setLastName(lastName);
        getLastName();
        setEmail(email);
        getEmail();
        setGpa(gpa);
        getGpa();
        setDegree(degree);
        getDegree();
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setGpa(Double gpa){
        this.gpa = gpa;
    }
    public Double getGpa() {
        return gpa;
    }
    public void setDegree(String degree){
        this.degree = degree;
    }
    public String getDegree() {
        return degree;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gpa=" + gpa +
                ", degree='" + degree + '\'' +
                '}';
    }
}
