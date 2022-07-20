package com.jb.dronelab.services;

import org.springframework.stereotype.Service;

import static com.jb.dronelab.util.MyUtil.printUrgent;

@Service
public class UrgentService {
    public void showUrgent(){printUrgent();}
}
