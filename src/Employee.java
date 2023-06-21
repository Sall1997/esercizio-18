
public class Employee {
    String name;
    String surname;
    String address;

    Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress){
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }

    public String  getEmployeeDetails(){
        return String.format("Name: %s;\nSurname: %s;\nAddress: %s;",name, surname, address);
    }
}
