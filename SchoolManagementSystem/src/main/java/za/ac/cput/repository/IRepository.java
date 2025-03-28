package za.ac.cput.repository;
/* IRepository.java
Repository interface
Author: Lyle Jason Smal (223236012)
Date: 28 March 2025
*/
public interface IRepository <T,ID>{

    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
}
