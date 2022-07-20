package com.jb.dronelab.aop;

import com.jb.dronelab.services.UrgentService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UrgentAspect {
    @Autowired
    private UrgentService urgentService;

    @After("@annotation(Iurgent)")
    public void handle(){urgentService.showUrgent();}
}
