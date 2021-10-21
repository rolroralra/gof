package structural.adapter.example;


import org.junit.jupiter.api.Test;

public class AdapterPatternDriver {
    
    @Test
    public void test_Adapter_Pattern_Example() {
    	Movable bugattiVeyron = new BugattiVeyron();
    	System.out.println("Bugatti Veyron Velocity: " + bugattiVeyron.getSpeed() + " MPH.");
    	MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
        System.out.println("Bugatti Veyron Velocity: " + bugattiVeyronAdapter.getSpeed() + " Km/h.");

    }
}
