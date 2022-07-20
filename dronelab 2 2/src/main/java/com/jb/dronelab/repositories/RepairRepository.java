package com.jb.dronelab.repositories;

import com.jb.dronelab.bean.Repair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepairRepository extends JpaRepository<Repair,Integer> {

}
