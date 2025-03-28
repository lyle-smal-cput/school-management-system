package za.ac.cput.domain;
/*Address.java
Address model class
Author: Ruth Ifeoma Onwutali (222369345)
Date: 25 March 2025
 */

public class Address {
    private String houseNum;
    private String streetName;
    private String area;
    private String postalCode;

    public Address(){

    }

    public Address(AddressBuilder builder) {
        this.houseNum = builder.houseNum;
        this.streetName = builder.streetName;
        this.area = builder.area;
        this.postalCode = builder.postalCode;
    }

    public String getHouseNum() {
        return houseNum;
    }
    public String getStreetName() {
        return streetName;
    }
    public String getArea() {
        return area;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNum=" + houseNum +
                ", streetName='" + streetName + '\'' +
                ", area='" + area + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }



    public static class AddressBuilder {
        private String houseNum;
        private String streetName;
        private String area;
        private String postalCode;

        public AddressBuilder() {

        }

        public AddressBuilder(String houseNum, String streetName, String area, String postalCode) {
            this.houseNum = houseNum;
            this.streetName = streetName;
            this.area = area;
            this.postalCode = postalCode;

        }
        public AddressBuilder setHouseNum(String HouseNum) {
            this.houseNum = HouseNum;
            return this;
        }
        public AddressBuilder setStreetName(String StreetName) {
            this.streetName = streetName;
            return this;
        }
        public AddressBuilder setArea(String Area) {
            this.area = area;
            return this;
        }
        public AddressBuilder setPostalCode(String PostalCode) {
            this.postalCode = PostalCode;
            return this;
        }
        public Address build() {

            return new Address(this);
        }
    }//end static class


}//end class

