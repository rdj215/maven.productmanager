package com.github.curriculeon.iteminventory;

import com.github.curriculeon.GenericInventory;
import com.github.curriculeon.Item;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/16/2019.
 */
public class RemoveTest {
    // given
    private void test(Item[] expectedItems, Item[] objectsToBeAdded, int indexOfElement) {
        Item[] actualItems = expectedItems.clone();
        GenericInventory<Item> genericInventory = new GenericInventory<>();
        for (Item someObject : objectsToBeAdded) {
            genericInventory.add(someObject);
            Boolean itemHasBeenAdded = genericInventory.contains(someObject);
            Assert.assertTrue(itemHasBeenAdded);
        }

        // when
        genericInventory.remove(indexOfElement);
        actualItems = genericInventory.toArray(actualItems);

        // then
        Assert.assertArrayEquals(expectedItems, actualItems);
    }


    @Test
    public void test0() {
        Item item1 = new Item("Milk");
        Item item2 = new Item("Bread");
        Item item3 = new Item("Eggs");
        Item item4 = new Item("Yogurt");
        Item[] objectsToBeAdded = new Item[]{item1, item2, item3, item4};
        Item[] expectedItems = new Item[]{item2, item3, item4};
        Integer indexToRemove = 0;
        test(expectedItems, objectsToBeAdded, indexToRemove);
    }


    @Test
    public void test1() {
        Item item1 = new Item("Milk");
        Item item2 = new Item("Bread");
        Item item3 = new Item("Eggs");
        Item item4 = new Item("Yogurt");
        Item[] objectsToBeAdded = new Item[]{item1, item2, item3, item4};
        Item[] expectedItems = new Item[]{item1, item3, item4};
        Integer indexToRemove = 1;
        test(expectedItems, objectsToBeAdded, indexToRemove);
    }


    @Test
    public void test2() {
        Item item1 = new Item("Milk");
        Item item2 = new Item("Bread");
        Item item3 = new Item("Eggs");
        Item item4 = new Item("Yogurt");
        Item[] objectsToBeAdded = new Item[]{item1, item2, item3, item4};
        Item[] expectedItems =  new Item[]{item1, item2, item4};
        Integer indexToRemove = 2;
        test(expectedItems, objectsToBeAdded, indexToRemove);
    }
}
