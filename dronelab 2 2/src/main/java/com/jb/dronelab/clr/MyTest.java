package com.jb.dronelab.clr;

import com.jb.dronelab.composed.DroneLab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
@Order(2)
public class MyTest implements CommandLineRunner {
    @Autowired
    private DroneLab droneLab;
    @Autowired
    ApplicationContext ctx;

    @Override
    public void run(String... args) throws Exception {
        /*
        //droneLab.addRepair(2, false, "Another one bites the dust", 1700.00, new Date());
        //droneLab.addRepair(1, true, "Just bought one and crashed it", 700.00, new Date());
        //printRow();
        //TablePrinter.print(droneLab.getCustomerList());
        //printRow();
        //droneLab.getSummary();

        //write our data to our DATABASE
        //create the connection between our spring server and our mysql server
        DroneRepository droneRepo = ctx.getBean(DroneRepository.class);
        //create the bean
        //DroneDB drone1 = DroneDB.builder().created(new Date()).isWarranty(true).drone("DJI M300").endWarrantyDate(new Date()).build();
        //DroneDB drone2 = DroneDB.builder().created(new Date()).isWarranty(true).drone("PX4 Gucci").endWarrantyDate(new Date()).build();
        //DroneDB drone3 = DroneDB.builder().created(new Date()).isWarranty(true).drone("Daniel - carshed drone").endWarrantyDate(new Date()).build();

        //droneDB.saveAll(Arrays.asList(drone1,drone2,drone3));
        //DroneDB myDrone = droneRepo.getOne(4);
        //TablePrinter.print(myDrone);

        //List<DroneDB> myDrones = droneRepo.findAll();
        //TablePrinter.print(myDrones);

        //DroneDB singleDrone = droneRepo.getOne(10);
        //TablePrinter.print(singleDrone);

        //we can recive data or not recive data...
        Optional<DroneDB> myDrone = droneRepo.findById(4);
        if (!myDrone.isEmpty()){
            TablePrinter.print(myDrone);
        } else {
            System.out.println("No Drones was found...");
        }
        printRow();
        //count , sum, aggregate function
        System.out.printf("you have %d drones in the system\n\n",droneRepo.count());

        //System.out.println("Saved........");
        */
    }

    private void printRow() {
    }
}
