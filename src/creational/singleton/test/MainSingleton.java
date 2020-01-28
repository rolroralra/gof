package creational.singleton.test;

import creational.singleton.SingleObject;

public class MainSingleton {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();

        System.out.println(singleObject == SingleObject.getInstance());
        System.out.println(singleObject);
        System.out.println(SingleObject.getInstance());

        // Compile Error
//        SingleObject anotherObject = new SingleObject();
    }

}
