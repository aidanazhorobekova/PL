public class Person {
    private String name;
    private String lastname;
    private String email;
    private int age;

    public Person(String name, String lastname, String email, int age){
        setName(name);
        getName();
        setLastName(lastname);
        getLastName();
        setEmail(email);
        getEmail();
        setAge(age);
        getAge();
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setLastName(String lastname){
        this.lastname = lastname;
    }
    public String getLastName() {
        return lastname;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return name + "\n" + lastname + "\n" + email + "\n" + age;
    }
}
