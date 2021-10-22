package test.location.location;

import test.location.visitor.Visitor;

public abstract class Location {
    
    public abstract void accept(Visitor v);
}

