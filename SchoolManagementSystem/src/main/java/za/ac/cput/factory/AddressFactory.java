package za.ac.cput.factory;
/*AddressFactory.java
Address model class
Author: Ruth Ifeoma Onwutali (222369345)
Date: 25 March 2025
 */

import za.ac.cput.domain.Address;

public class AddressFactory {

    public static Address createAddress(){
        return new Address.AddressBuilder()
                .setHouseNum("03")
                .setStreetName("Dingle")
                .setArea("Goodwood")
                .setPostalCode("7460")
                .build();
    }//end static class

    public static Address createAddress(String houseNum, String streetName, String area, String postalCode) {
        if(houseNum.isEmpty() || houseNum==null){
            return null;
        }
        if(streetName.isEmpty() || houseNum==null){
            return null;
        }
        if(area.isEmpty() || houseNum==null){
            return null;
        }
        if(postalCode.isEmpty() || postalCode==null){
            return null;
        }
        return new Address.AddressBuilder()
                .setHouseNum(houseNum)
                .setStreetName(streetName)
                .setArea(area)
                .setPostalCode(postalCode)
                .build();
    }//end of statc constructor
}//end of class

