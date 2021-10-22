package creational.prototype.example;



import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;


public class TreePrototypeDemo {
	

    public static void main(String[] args) {
    	double mass = 10.0;
        double height = 3.7;
        Position position = new Position(3, 7);
        Position otherPosition = new Position(4, 8);

        PlasticTree plasticTree = new PlasticTree(mass, height);
        plasticTree.setPosition(position);
        
        //cloning 
        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.copy();
        System.out.println(anotherPlasticTree.toString() + plasticTree.toString());
        
        anotherPlasticTree.setPosition(otherPosition);

        System.out.println(anotherPlasticTree.toString() + plasticTree.toString());
	}
}
