package com.demo.service;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class HelloWorld2Service implements JavaDelegate {
    public void execute(DelegateExecution execution) {
        System.out.println("Hello World again!");
    }
}
