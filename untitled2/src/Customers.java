public class Customers {
    private String name;
    private float age;
    private String address;

    public Customers() {
    }

    public Customers(String name, float age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public float getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}




