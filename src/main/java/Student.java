public class Student {
    protected String name;
    protected String age;
    protected String origin;

    public Student(String name, String age, String origin) {
        this.name = name;
        this.age = age;
        this.origin = origin;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Student " +
                "name " + name + ", " + age + " years old" +
                ", from " + origin;
    }
}
