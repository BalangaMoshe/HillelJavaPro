public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Niko", "Programmer", "niko.nikel@gmail.com", "+380932568745", 30);
        System.out.println("Employee: " + employee.getFullName() + ", " + employee.getPosition() + ", " + employee.getEmail()
                + ", " +  employee.getPhone());

        Car car = new Car();
        car.start();
    }
}
