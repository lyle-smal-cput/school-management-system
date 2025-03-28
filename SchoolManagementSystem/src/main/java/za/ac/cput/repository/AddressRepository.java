package za.ac.cput.repository;

import za.ac.cput.domain.Address;

import java.util.*;

/*AddressRepository.java
Address model class
Author: Ruth Ifeoma Onwutali (222369345)
Date: 25 March 2025
 */

public class AddressRepository implements IAddressRepository {

    private static IAddressRepository repository = null;
    private List<Address> addressList;

    AddressRepository() {
        addressList = new ArrayList<Address>();
    }//end of AddressRepository()

    public static IAddressRepository getRepository() {
        if (repository == null) {
            repository = new AddressRepository();
        }
        return repository;
    }//end of IAddressRepository()


    @Override
    public List<Address> getAll() {
        return null;
    }//end of getAll()

    @Override
    public Address create(Address address) {
        boolean success = addressList.add(address);
        if (success) {
            return address;
        }
        return null;
    }//end of create

    @Override
    public Address read(String postCode) {
        for (Address address : addressList) {
            if(address.getPostalCode().equals(postCode)){
                return address;
            }
        }
        return null;
    }//end of read

    @Override
    public Address update(Address address) {
        boolean success = addressList.add(address);
        if (success) {
            return address;
        }

        return null;
    }//end of update

    @Override
    public boolean delete(String code) {
        boolean success = addressList.remove(code);
        if (success) {
            return true;
        }
        return false;
    }//end of delete
}//end of class
