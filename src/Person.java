public abstract class Person implements IPerson {

    public  Person(){}

    @Override
    public double calculateSalary() {
        return 0;
    }

    @Override
    public double calculateAge() {
        return 0;
    }

    @Override
    public String printerReport() {
        return null;
    }

    public  Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    private int id;
    private String name;

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

    @Override
    public String toString() {
        return "ID: " + this.id + " Nome: " + this.name;
    }
}
