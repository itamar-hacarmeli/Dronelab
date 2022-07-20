package com.jb.dronelab.interceptor;

import com.jb.dronelab.bean.Customer;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import static com.jb.dronelab.util.MyUtil.printRow;
import static com.jb.dronelab.util.MyUtil.printVIP;

@Component
@Lazy
public class IDFinterceptor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Customer){
            Customer customer = (Customer) bean;
            /*
            if (customer.getId()==2){
                printVIP();
            }

             */
        }

        return bean;
    }
}
