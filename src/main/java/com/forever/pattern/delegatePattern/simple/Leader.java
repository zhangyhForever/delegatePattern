package com.forever.pattern.delegatePattern.simple;

import java.util.HashMap;
import java.util.Map;

public class Leader {

    private Map<String, Employee> employees = new HashMap<String, Employee>();

    public Leader(){
        employees.put("加密", new EmployeeA());
        employees.put("架构", new EmployeeB());
    }

    public void dispatch(String command){
        employees.get(command).dosomething();
    }
}
