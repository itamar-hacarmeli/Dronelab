package com.jb.dronelab.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity //database
@Table(name="Drone")
//ORM - Object Relation Mapping
public class Drone {
    @Id //PK
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    //@Column(updatable = false) //can not change the value
    private int droneId;
    private String drone;
    private Date isCreated;
    private boolean isWarranty;
    private Date endWarrantyDate;
}
