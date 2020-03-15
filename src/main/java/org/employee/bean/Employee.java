package org.employee.bean;

import org.employee.bean.Department;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

public class Employee implements InitializingBean, DisposableBean
{
    @Value("${name}")
    String name;
    @Value("${age}")
    int age;
    @Value("${salary}")
    double salary;

    private Department department;

    public Employee(Department department)
    {
        this.department= department;
    }

    public void print() throws Exception
    {
        System.out.println("Name:"+name+" "+"Age:"+age+" "+"Salary:"+salary);
        department.printDepartment();
    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println(getClass()+" destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(getClass()+" init()");
    }
}
