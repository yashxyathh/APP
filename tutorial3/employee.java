public class employee {
    private  String id,name;
    private int salary;
    employee(String id, String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }
    void display(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Salary: "+salary);
    }
    public static void main(String[] args) {
        employee e1=new employee("101", "yashasvi", 2000000);
        e1.display();
    }
}
