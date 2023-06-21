public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;


    Badge(Employee employeeThatNeedsBadge ){
        keepTrackOfEmployeesNumber();
        employee = employeeThatNeedsBadge;
        generateBadgeIdCode();
    }

    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees++;
    }

   private void generateBadgeIdCode(){
        badgeIdCode = "Badge: " + "XYZ" + employee.name + employee.surname + "ZYX.";
   }

   public void showBadgeDetails(){
        System.out.println();
        System.out.println("employees number: " + totalNumberOfEmployees);
        System.out.println();
        System.out.println(employee.getEmployeeDetails());
        System.out.println(badgeIdCode);
   }
}
