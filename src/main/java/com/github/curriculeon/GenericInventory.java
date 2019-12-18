package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class GenericInventory<SomeType> implements InventoryInterface<SomeType>, Iterable<SomeType> {
    private List<SomeType> inventory = new ArrayList();

    @Override
    public void add(SomeType someObject) {
        inventory.add(someObject);


    }

    @Override
    public Boolean contains(SomeType someObject) {
        return inventory.contains(someObject);

    }

    @Override
    public SomeType get(int indexOfElement) {
        return inventory.get(indexOfElement);

    }

    @Override
    public SomeType remove(int indexOfElement) {
        return inventory.remove(indexOfElement);

    }

    @Override
    public SomeType[] toArray(SomeType[] objectsToBeAdded) {
    return inventory.toArray(objectsToBeAdded);

    }

    @Override
    public Iterator<SomeType> iterator() {
        return (Iterator<SomeType>) inventory;
    }
}
