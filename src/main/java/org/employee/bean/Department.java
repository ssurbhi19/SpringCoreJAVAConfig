package org.employee.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Date;

public class Department
{
    @Value("${deptName}")
    private String deptName;

    @Autowired
    @Qualifier(value="dateConverter")
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void printDepartment() throws Exception
    {
        System.out.println("Department Name:"+this.deptName+" "+"Date:"+date);
    }

    //Annotation used for lifecycle method. @PostConstruct as init() and @PreDestroy as destroy()
    @PostConstruct
    protected void init(){
        System.out.println(getClass()+" init()");
    }
    @PreDestroy
    protected void destroy(){
        System.out.println(getClass()+" destroy()");
    }

}
