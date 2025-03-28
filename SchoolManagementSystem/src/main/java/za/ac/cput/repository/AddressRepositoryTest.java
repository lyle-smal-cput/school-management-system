package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Repository.AddressRepository;
import za.ac.cput.Entity.Address;

import static org.junit.jupiter.api.Assertions.*;

/*AddressRepositoryTest.java
Address model class
Author: Ruth Ifeoma Onwutali (222369345)
Date: 25 March 2025
 */

class AddressRepositoryTest {

    IAddressRepository addressRepository;
    Address.AddressBuilder address;


    @BeforeEach
    void setUp() {
        addressRepository = AddressRepository.getRepository();
        address = new Address.AddressBuilder("45", "Dingle",
                "Townsend", "7750");
    }//end of setUp()

    @Test
    public void testCreate() {
        Address addressCreated = addressRepository.create(address.build());
        assertNotNull(addressCreated);
    }//end of testCreate

    @Test
    public void testUpdate() {
        addressRepository.create(address.build());
        address.setPostalCode("7460");
        Address addressUpdated = addressRepository.update(address.build());
        //assertNotNull(addressUpdated);
        assertEquals(address.build().getPostalCode(), addressUpdated.getPostalCode());
    }//end testUpdate

    @Test
    public void testRead() {
        addressRepository.create(address.build());
        Address addressRead = addressRepository.read(address.build().getPostalCode());
        assertNotNull(addressRead);
        assertEquals(address.build().getPostalCode(), addressRead.getPostalCode());
    }//end testRead

    @Test
    public void testDelete() {
        addressRepository.create(address.build());
        Address addressCreated = addressRepository.create(address.build());
        boolean addressDelete = addressRepository.delete(addressCreated.getPostalCode());
        assertTrue(addressDelete);
    }//end testDelete

}