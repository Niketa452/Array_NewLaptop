public class Employee {

    int age;
    int id;
    String name;
    String department;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(int id, int age, String name, String department){
        this.id=id;
        this.age=age;
        this.name=name;
        this.department=department;
    }
public String toString(){
        return "ID : " +  id + " Age : " + age + " Name : " + name + " , Department : " + department;
    }
}
