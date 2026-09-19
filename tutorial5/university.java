import java.util.Scanner;
class Employee{
    String name;
    int empid;
    double basicsalary;
    Employee(String name,int empid,double basicsalary){
        this.name=name;
        this.empid=empid;
        this.basicsalary=basicsalary;
    }
    double calculateSalary(){
        return basicsalary;
    }
}
class Professor extends Employee{
    Professor(String name,int empid,double basicsalary){
        super(name, empid, basicsalary);

    }
    @Override
    double calculateSalary() {
        return basicsalary+(basicsalary*0.40);
    }
}
class LabAssistant extends Employee{
    LabAssistant(String name,int empid,double basicsalary){
        super(name, empid, basicsalary);

    }
    @Override
    double calculateSalary() {
        return basicsalary+(basicsalary*0.20);
    }
}
class AdministrativeStaff extends Employee{
    AdministrativeStaff(String name,int empid,double basicsalary){
        super(name, empid, basicsalary);

    }
    @Override
    double calculateSalary() {
        return basicsalary+(basicsalary*0.15);
    }
}
public class university {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter name of Professor");
        String pname= sc.next();
        System.out.println("Enter Employee ID");
        int pid= sc.nextInt();
        System.out.println("Enter the salary");
        double psalary=sc.nextDouble();
        Professor p=new Professor(pname,pid,psalary);

        System.out.println("Enter name of LabAssistant");
        String lname= sc.next();
        System.out.println("Enter Employee ID");
        int lid= sc.nextInt();
        System.out.println("Enter the salary");
        double lsalary=sc.nextDouble();
        LabAssistant l=new LabAssistant(lname,lid,lsalary);
        
        System.out.println("Enter name of Administrative Staff");
        String adname= sc.next();
        System.out.println("Enter Employee ID");
        int adid= sc.nextInt();
        System.out.println("Enter the salary");
        double adsalary=sc.nextDouble();
       AdministrativeStaff ad=new AdministrativeStaff(adname,adid,adsalary);

       System.out.println("\t SALARY SLIP\n");
       System.out.println("Name: "+p.name);
       System.out.println("salary: "+p.calculateSalary());
       System.out.println("Name: "+l.name);
       System.out.println("salary: "+l.calculateSalary());
       System.out.println("Name: "+ad.name);
       System.out.println("salary: "+ad.calculateSalary());
       sc.close();

    }

    
}