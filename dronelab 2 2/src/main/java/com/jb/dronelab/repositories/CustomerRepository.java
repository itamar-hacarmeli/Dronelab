package com.jb.dronelab.repositories;

import com.jb.dronelab.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    //And               finBylastNameAndFirstName (String lastName, String firstName)
    //Or                findByfirstNameOrfirstName(String userName1, String userName2)
    //Select * from Customers where firstName='Jacob' OR firstName='Daniel;
    //Between           findBystartDateBetween(LocalDate startDate, LocalDate endDate)
    //LessThan          findBycostLessThan(double cost)
    //GreaterThan       findBycostGreaterThen(double cost)
    //After             findBystartDateAfter(LocalDate localDate)
    //Before            findBystartDateBefore(LocalDate localDate)
    //IsNull            findBydronesIsNull()
    //IsNotNull,NotNull findBydrone(Is)NotNull()
    //Like              findBynameLike(String partUserName)
    //NotLike           findBynameNotLike(String partUserName)
    //StartingWith      findBynameStartingWith(String userName)
    //EndingWith        findBynameEndingWith(String userName)

    //find customer that was created lastYear (LocalDate localDate)-> 1/1/2021
    //SQL -> SELECT * From Customer WHERE created<? -> ResultList
    //isCreated -> Smart Dialect
    List<Customer> findByisCreatedBefore(LocalDate localDate);

    List<Customer> findByisCreatedBetween(LocalDate startDate, LocalDate endDate);
    // find by isCreated between startDate And endDate

    List<Customer> findBynameLike(String userName);

    //Smart Dialect
    List<Customer> findBynameStartingWith(String userName);


}
