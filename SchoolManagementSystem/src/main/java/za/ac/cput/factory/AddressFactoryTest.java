package za.ac.cput.factory;
/*AddressFactoryTest.java
Address model class
Author: Ruth Ifeoma Onwutali (222369345)
Date: 25 March 2025
        */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Address;
import za.ac.cput.Entity.Address.AddressBuilder;

import static org.junit.jupiter.api.Assertions.*;

class AddressFactoryTest {

    AddressFactory addressFactory1;

    @BeforeEach
    void setUp() {

        addressFactory1 = new AddressFactory();
    }//end setUp()

    @Test
    public void testCreateAddress() {
        Address address = addressFactory1.createAddress();
        assertNotNull(address);
    }//testCreateAddress() test createAddress method works

    @Test
    public void testAddressCreatedUsingFactoryClass() {
        addressFactory1.createAddress("45", "Surrey",
                "Townsend",  "7460");
        assertEquals(true, addressFactory1 instanceof AddressFactory);
    }//testAddressCreatedUsingFactoryClass() to see that the address is created by the factory class





