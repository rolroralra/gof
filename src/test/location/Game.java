package test.location;

import java.util.ArrayList;
import java.util.List;

import test.location.location.Location;
import test.location.visitor.Visitor;

public class Game extends Location {

	List<Player> players = new ArrayList<>();
    List<Location> locations = new ArrayList<>();

    @Override
    public void accept(Visitor v) {
        for (Location e : this.locations) {
            e.accept(v);
        }
    }

}
