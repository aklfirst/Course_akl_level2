public class Employee {
    public static String c = "=";
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private int department;
    private float salary;
    public static float totalSalary;
    public static float newSalary;
    public static float checkSalary;
    public static float maxSalary;
    public static float minSalary;
    public static int highestPaidEmployeeReference;
    public static int lowestPaidEmployeeReference;
    private static float averageSalary;
    public static int counter;
    private int id;
    private static int qtyPeopleInDepartment;

    static Employee[] employeeList = new Employee[20];

    public Employee(String firstName, String middleName, String lastName, int age, int department, float salary) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.department = department;
        this.salary = salary;
        id = ++counter;

    }

    public static String cWith = c.repeat(15);

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Сотрудник: " + getId() + "| " + getFirstName() + "| " + getMiddleName() + "| " + getLastName() + "| " + getAge() + "| " + getDepartment() + "| " + getSalary();
    }

    public static void printAllActiveEmployees() {

        for (int i = 0; i < counter; i++) {
            if (employeeList[i] != null) {
                System.out.println(employeeList[i]);
            } else {
                break;
            }

        }
        System.out.println(cWith);
    }

    public static void setSalaryIncrease(int department, float percent) {
        for (int i = 0; i < counter; i++) {
            if (department == 0) {
                newSalary = employeeList[i].getSalary() * (1 + percent / 100);
                employeeList[i].setSalary(newSalary);
            } else if (employeeList[i].getDepartment() == department) {
                newSalary = employeeList[i].getSalary() * (1 + percent / 100);
                employeeList[i].setSalary(newSalary);
            }
        }
    }

    public static float findFirstSalaryInDepartment(int department) {
        for (int i = 0; i < counter; i++) {
            if (employeeList[i].getDepartment() == department) {
                return employeeList[i].getSalary();
            }
        }
        System.out.println("Salary is not found");
        return 0;
    }

    public static int findFirstIdInDepartment(int department) {
        for (int i = 0; i < counter; i++) {
            if (employeeList[i].getDepartment() == department) {
                return employeeList[i].getId();
            }
        }
        System.out.println("Id is not found");
        return 0;

    }


    public static void getMinSalary(int department) {

        if (department == 0) {
            minSalary = employeeList[0].getSalary();
            lowestPaidEmployeeReference = 0;

            for (int i = 0; i < counter; i++) {
                if (employeeList[i].getSalary() < minSalary) {
                    minSalary = employeeList[i].getSalary();
                    lowestPaidEmployeeReference = i;
                }
            }
            System.out.println("Самая низкая зарплата из всех отделов: " + minSalary + " - " + employeeList[lowestPaidEmployeeReference].getFirstName() + " " + employeeList[lowestPaidEmployeeReference].getMiddleName() + " " + employeeList[lowestPaidEmployeeReference].getLastName() + " - отдел " + employeeList[lowestPaidEmployeeReference].getDepartment());
        } else {
            minSalary = findFirstSalaryInDepartment(department);
            lowestPaidEmployeeReference = findFirstIdInDepartment(department) - 1;
            for (int i = 0; i < counter; i++) {
                if ((employeeList[i].getDepartment() == department) && (employeeList[i].getSalary() < minSalary)) {
                    minSalary = employeeList[i].getSalary();
                    lowestPaidEmployeeReference = i;

                }

            }
            System.out.println("Самая низкая зарплата из отдела " + employeeList[lowestPaidEmployeeReference].getDepartment() + " - " + minSalary + " - " + employeeList[lowestPaidEmployeeReference].getFirstName() + " " + employeeList[lowestPaidEmployeeReference].getMiddleName() + " " + employeeList[lowestPaidEmployeeReference].getLastName());
        }
        System.out.println(cWith);
    }

    public static void getMaxSalary(int department) {

        if (department == 0) {
            maxSalary = employeeList[0].getSalary();
            highestPaidEmployeeReference = 0;

            for (int i = 0; i < counter; i++) {
                if (employeeList[i].getSalary() > maxSalary) {
                    maxSalary = employeeList[i].getSalary();
                    highestPaidEmployeeReference = i;
                }
            }
            System.out.println("Самая высокая зарплата из всех отделов: " + maxSalary + " - " + employeeList[highestPaidEmployeeReference].getFirstName() + " " + employeeList[highestPaidEmployeeReference].getMiddleName() + " " + employeeList[highestPaidEmployeeReference].getLastName() + " - отдел " + employeeList[highestPaidEmployeeReference].getDepartment());
        } else {
            maxSalary = findFirstSalaryInDepartment(department);
            highestPaidEmployeeReference = findFirstIdInDepartment(department) - 1;
            for (int i = 0; i < counter; i++) {
                if ((employeeList[i].getDepartment() == department) && (employeeList[i].getSalary() > maxSalary)) {
                    maxSalary = employeeList[i].getSalary();
                    highestPaidEmployeeReference = i;
                }
            }
            System.out.println("Самая высокая зарплата из отдела " + employeeList[highestPaidEmployeeReference].getDepartment() + " - " + maxSalary + " - " + employeeList[highestPaidEmployeeReference].getFirstName() + " " + employeeList[highestPaidEmployeeReference].getMiddleName() + " " + employeeList[highestPaidEmployeeReference].getLastName());
        }
        System.out.println(cWith);
    }

    public static void getTotalSalary(int department) {

        if (department == 0) {
            for (int i = 0; i < counter; i++) {
                if (employeeList[i] != null) {
                    totalSalary = totalSalary + employeeList[i].getSalary();

                }

            }
            System.out.println("Общий ФОТ в месяц: " + totalSalary);
        } else {
            for (int i = 0; i < counter; i++) {
                if (employeeList[i].getDepartment() == department) {
                    totalSalary = totalSalary + employeeList[i].getSalary();
                }
            }
            System.out.println("Общий ФОТ в месяц по отделу " + department + ": " + totalSalary);

        }
        System.out.println(cWith);
    }


    public static void getAverageSalary(int department) {

        if (department == 0) {
            for (int i = 0; i < counter; i++) {

                if (employeeList[i] != null) {
                    averageSalary = averageSalary + employeeList[i].getSalary();
                }
            }
            averageSalary = averageSalary / counter;
            System.out.println("Средняя зарплата в месяц: " + averageSalary);

        } else {
            for (int i = 0; i < counter; i++) {
                if (employeeList[i].getDepartment() == department) {
                    averageSalary = averageSalary + employeeList[i].getSalary();
                    qtyPeopleInDepartment++;
                }
            }
            averageSalary = averageSalary / qtyPeopleInDepartment;
            System.out.println("Средняя зарплата в месяц по отделу " + department + ": " + averageSalary);

        }
        System.out.println(cWith);
    }


    public static void printAllDepartmentEmployees(int department) {

        for (int i = 0; i < counter; i++) {
            if (employeeList[i].getDepartment() == department) {
                System.out.println("Сотрудник: " + employeeList[i].getId() + "| " + employeeList[i].getFirstName() + "| " + employeeList[i].getMiddleName() + "| " + employeeList[i].getLastName() + "| " + employeeList[i].getSalary());
            }

        }
        System.out.println(cWith);
    }

    public static void printLowerSalaryEmployees(float checkSalary) {

        for (int i = 0; i < counter; i++) {
            if (employeeList[i].getSalary() < checkSalary) {
                System.out.println("Сотрудник: " + employeeList[i].getId() + "| " + employeeList[i].getFirstName() + "| " + employeeList[i].getMiddleName() + "| " + employeeList[i].getLastName() + "| " + employeeList[i].getSalary());
            }

        }
        System.out.println(cWith);
    }

    public static void printHigherSalaryEmployees(float checkSalary) {

        for (int i = 0; i < counter; i++) {
            if (employeeList[i].getSalary() >= checkSalary) {
                System.out.println("Сотрудник: " + employeeList[i].getId() + "| " + employeeList[i].getFirstName() + "| " + employeeList[i].getMiddleName() + "| " + employeeList[i].getLastName() + "| " + employeeList[i].getSalary());
            }

        }
        System.out.println(cWith);
    }

}
