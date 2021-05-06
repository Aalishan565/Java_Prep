package _2_designPatterns.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Consumer {

    public static void main(String[] args) {
        List<Employee> employees= new ArrayList();
        Employee eng=new Engineer("Aalishan",1,"Tech");
        Employee sales=new SalesMan("Santosh",2,"Sale");
        Employee hr=new HRs("Abc",3,"Hr");
        employees.add(eng);
        employees.add(sales);
        employees.add(hr);
        for (Employee e:employees
             ) {
            System.out.println(e.toString());

        }

    }
}
