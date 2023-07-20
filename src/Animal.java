public class Animal {
    private int Id;
    private int age;

    public Animal(int id, int age) {
        Id = id;
        this.age = age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Id=" + Id +
                ", age=" + age +
                '}';
    }
}
