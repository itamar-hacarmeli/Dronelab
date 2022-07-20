package com.jb.dronelab.bean;

import com.jb.dronelab.aop.Iurgent;
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
@Entity
@Table(name = "Repair")
public class Repair {
    @Id //PK
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int repairId;
    private Date isCreated;
    private boolean isUrgent;
    private String description;
    private Double cost;
    private Date finishETA;

    //aop - it will pop up a message on screen :)
    @Iurgent
    public void setUrgent(boolean urgent) {
        isUrgent = urgent;
    }
}
