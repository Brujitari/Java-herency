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
        myClient.name = "Rodrigo de la Rosa Ramírez";
        myClient.credit = 200000;

        Worker myWorker = new Worker();
        myWorker.age = 50;
        myWorker.phone = "+34888888888";
        myWorker.name = "Rodrigo de la Rosa Ramírez";
        myWorker.salary = 200000;

        System.out.println(myClient.age);
        System.out.println(myClient.phone);
        System.out.println(myClient.name);
        System.out.println(myClient.credit);
        System.out.println(myWorker.age);
        System.out.println(myWorker.phone);
        System.out.println(myWorker.name);
        System.out.println(myWorker.salary);
    }
}