package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTest {

    @Test
    public void testGetFirstName() {
        Woman woman = new Woman("Anna", "Petrenko", 65);
        Assert.assertEquals(woman.getFirstName(), "Anna");
    }

    @Test
    public void testGetLastName() {
        Woman woman = new Woman("Anna", "Petrenko", 65);
        Assert.assertEquals(woman.getLastName(), "Petrenko");
    }

    @Test
    public void testGetAge() {
        Woman woman = new Woman("Anna", "Petrenko", 65);
        Assert.assertEquals(woman.getAge(), 65);
    }

    @Test
    public void testGetPartnerLastName() {
        Woman woman = new Woman("Anna", "Petrenko", 65);
        Man partner = new Man("Ivan", "Ivanov", 70);
        woman.setPartner(partner);

        Assert.assertEquals(woman.getLastName(),
                "Ivanov");
    }

    @Test
    public void testIsRetired() {
        Woman woman = new Woman("Anna", "Petrenko", 65);
        Assert.assertTrue(woman.isRetired(), "Expected retired");

    }
}
