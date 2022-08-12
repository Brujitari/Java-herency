class Persona {
    int age;
    String name;
    String phone;
}
class Client extends Persona {
    int credit;
}

class Worker extends Persona {
    int salary;
}

public class Main {
    public static void main(String[] args) {
        Client myClient = new Client();
        myClient.age = 50;
        myClient.phone = "+34666666666";
        myClient.name = "Rodrigo Ramirez";
        myClient.credit = 200000;

        Worker myWorker = new Worker();
        myWorker.age = 50;
        myWorker.phone = "+34888888888";
        myWorker.name = "Azura Garcia";
        myWorker.salary = 200000;

        System.out.println("I am " + myClient.name + ", I am " + myClient.age +
                " years old and my phone is " + myClient.phone
                + " and my credit is " + myClient.credit + "$");
        System.out.println("I am " + myWorker.name + ", I am " + myWorker.age +
                " years old and my phone is " + myWorker.phone
                + " and my salary is " + myWorker.salary + "$");
    }
}