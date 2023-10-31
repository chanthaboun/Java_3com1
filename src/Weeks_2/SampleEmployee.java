package Weeks_2;

public class SampleEmployee {

//    generate void main type: (psvm)
    public static void main(String[] args) {
//        Create object emp1 form Employee
        Employee emp1 = new Employee();
        emp1.setEmpId("A001");
        emp1.setEmpName("Chanthaboun");
        emp1.setEmpSalary(20000);

        System.out.println("IdEmployee:" + emp1.getEmpId());
        System.out.println("Name:" + emp1.getEmpName());
        System.out.println("Salary:" + emp1.getEmpSalary() + "kip");
        
//       generate  System.out.println type:  sout 
        
        

    }
    
    
}
