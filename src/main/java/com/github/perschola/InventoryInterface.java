package com.github.perschola;

public interface InventoryInterface<SomeType> {
    void add(SomeType someObject);

    Boolean contains(SomeType someObject);

    SomeType get(int indexOfElement);

    SomeType remove(int indexOfElement);

    SomeType[] toArray(SomeType[] objectsToBeAdded);
}
