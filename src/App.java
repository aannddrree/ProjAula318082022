public class App {
    public static void main(String[] args) {

        //Person person = new Person(1, "André");
        //System.out.println(person);

        Employee employee = new Employee();
        employee.setId(2);
        employee.setName("João Paulo");
        employee.setSalary(10000);
        employee.calculateSalary();
        System.out.println(employee);

        Provider provider = new Provider(3, "Pedro");
        //provider.setId(3);
        //provider.setName("Pedro");
        System.out.println(provider);


        //**************************************

        IProvider provider2 = new Provider(4, "Teste", "123456789");
        System.out.println("Qtd. Caracteres: " + provider2.getSizeDocument());


    }
}
