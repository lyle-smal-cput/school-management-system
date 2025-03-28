package za.ac.cput.repository;

import java.util.List;

/*IAddressRepository.java
Address model class
Author: Ruth Ifeoma Onwutali (222369345)
Date: 25 March 2025 */

import za.ac.cput.domain.Address;


public interface IAddressRepository extends IRepository<Address, String> {

    List<Address> getAll();
}