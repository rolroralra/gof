package creational.singleton.lazyHolder.test;

import creational.singleton.lazyHolder.SingleObject;

public class MainLazyHolder {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        System.out.println(singleObject == SingleObject.getInstance());
        System.out.println(singleObject);
        System.out.println(SingleObject.getInstance());

    }
}
