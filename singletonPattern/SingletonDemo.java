package singletonPattern;

public class SingletonDemo {
    public static void main(String[] args) {
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        connection1.connect();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        connection2.connect();
        if(connection1 == connection2){
            System.out.println("Both are the same instance");
        } else {
            System.out.println("Different instances created");
        }
    }
}
