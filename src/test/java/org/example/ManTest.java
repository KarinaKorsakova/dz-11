package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManTest {

    @Test
    public void testGetFirstName() {
        Man man = new Man("Ivan", "Ivanov", 70);
        Assert.assertEquals(man.getFirstName(), "Ivan");
    }

    @Test
    public void testGetLastName() {
        Man man = new Man("Ivan", "Ivanov", 70);
        Assert.assertEquals(man.getLastName(), "Ivanov");
    }

    @Test
    public void testGetAge() {
        Man man = new Man("Ivan", "Ivanov", 70);
        Assert.assertEquals(man.getAge(), 70);
    }

    @Test
    public void testIsRetired() {
        Man man = new Man("Ivan", "Ivanov", 70);
        Assert.assertTrue(man.isRetired(), "Expected retired");

    }
}
