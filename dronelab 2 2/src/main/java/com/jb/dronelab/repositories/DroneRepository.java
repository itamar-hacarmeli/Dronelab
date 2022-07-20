package com.jb.dronelab.repositories;

import com.jb.dronelab.bean.Drone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //not must to write , but nice to tell others what you are doing....
public interface DroneRepository extends JpaRepository <Drone, Integer> {

}
