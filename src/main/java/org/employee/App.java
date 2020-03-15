package org.employee;

import org.employee.bean.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) throws Exception
    {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
        Employee employee= context.getBean("employee", Employee.class);
        employee.print();
        context.close();
    }
}
