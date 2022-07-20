package com.jb.dronelab.clr;

import com.jb.dronelab.bean.Customer;
import com.jb.dronelab.bean.Drone;
import com.jb.dronelab.bean.Repair;
import com.jb.dronelab.repositories.CustomerRepository;
import com.jb.dronelab.repositories.DroneRepository;
import com.jb.dronelab.repositories.RepairRepository;
import com.jb.dronelab.util.TablePrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@Order(3)
public class DBtest implements CommandLineRunner {
    @Autowired
    DroneRepository droneRepository;
    @Autowired //IOC - Inversion Of Control
    RepairRepository repairRepository;
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {
        Drone drone1 = Drone.builder()
                .drone("DJI")
                .endWarrantyDate(new Date())
                .isWarranty(true)
                .isCreated(new Date())
                .build();

        Drone drone2 = Drone.builder()
                .drone("Gucci")
                .endWarrantyDate(new Date())
                .isWarranty(true)
                .isCreated(new Date())
                .build();

        Drone drone3 = Drone.builder()
                .drone("PX4")
                .endWarrantyDate(new Date())
                .isWarranty(true)
                .isCreated(new Date())
                .build();

        //Method I
        //droneRepository.save(drone1);

        //Method II
        //droneRepository.saveAll(Arrays.asList(drone1,drone2,drone3));

        Repair repair1 = Repair.builder()
                .cost(2000.00)
                .description("Close encounter with a tree")
                .finishETA(new Date())
                .isCreated(new Date())
                .isUrgent(true)
                .build();

        //repairRepository.save(repair1);

        /*
        Customer customer = Customer.builder()
                .name("Jacob")
                .isVIP(true)
                .address("TLV")
                .isCreated(new Date())
                .repair(repair1)
                .drone(drone1)
                .drone(drone2)
                .drone(drone3)
                .build();
        */



        //customerRepository.save(customer);

        List<Customer> customers = customerRepository.findBynameStartingWith("Da");

        TablePrinter.print(customers);

        //TablePrinter.print(customer);
    }
}
