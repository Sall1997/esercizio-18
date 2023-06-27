public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;


    public Badge(Employee employeeThatNeedsBadge ){
        keepTrackOfEmployeesNumber();
        employee = employeeThatNeedsBadge;
        generateBadgeIdCode();
    }

    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees++;
    }

   private void generateBadgeIdCode(){
        badgeIdCode = "Badge: " + "XYZ" + employee.getName() + employee.getSurname() + "ZYX.";
   }

   public void showBadgeDetails(){
        System.out.println();
        System.out.println("employees number: " + totalNumberOfEmployees);
        System.out.println();
        System.out.println(employee.getEmployeeDetails());
        System.out.println(badgeIdCode);
   }
}
