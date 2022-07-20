package com.jb.dronelab.bean;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="Customer")
public class Customer {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private Date isCreated;
    private String name;
    private String address; //so hila will know it's address :)
    private Boolean isVIP; //like daniel

    //1:1 1:m N:M //@ManyToMany   //@OneToOne
    @OneToMany (cascade = CascadeType.ALL, //save all objects in list
            orphanRemoval = true, //remove all object without parents
            fetch = FetchType.LAZY, //fetch and load all object into list
            mappedBy = "droneId" //map bu field pointer , instead of class vs claSS
    )
    @Singular //lombok will deal with List
    private List<Drone> drones;

    @OneToMany (cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY,
            mappedBy = "repairId"
    )


    @Singular
    private List<Repair> repairs;
}
