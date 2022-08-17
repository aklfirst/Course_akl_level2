public class Main {
    public static void main(String[] args) {
        Employee klepov = new Employee("Александр", "Анатольевич", "Клепов", 48, 5, 200_000);
        Employee frolov = new Employee("Дмитрий", "Викторович", "Фролов", 40, 2, 100_000);
        Employee volosevich = new Employee("Дмитрий", "Борисович", "Волосевич", 49, 3, 50_000);
        Employee karpov = new Employee("Анатолий", "Владимирович","Карпов", 35, 4, 60_000);
        Employee kasparov = new Employee("Гарии","Гарич","Каспаров",30, 1, 90_000);
        Employee elkin = new Employee("Андрей", "Всеволодович","Елькин",43, 1, 190_000);
        Employee palkin = new Employee("Василий","Андреевич","Палкин",44, 2, 110_000);
        Employee ivanov = new Employee("Иван1","Иванович","Иванов",38, 2, 120_000);
        Employee ivanov2 = new Employee("Иван2","Иванович","ВторойИванов",34, 2, 125_000);
        Employee ivanov3 = new Employee("Иван3","Иванович","ТретийИванов",36, 3, 130_000);
        Employee ivanov4 = new Employee("Иван4","Иванович","ЧетвертыйИванов",38, 3, 150_000);
        Employee ivanov5 = new Employee("Иван5","Иванович","ПятыйИванов",34, 3, 180_000);
        Employee ivanov6 = new Employee("Иван6","Иванович","ШестойИванов",34, 4, 80_000);
        Employee ivanov7 = new Employee("Иван7","Иванович","СедьмойИванов",37, 4, 40_000);
        Employee ivanov8 = new Employee("Иван8","Иванович","ВосьмойИванов",31, 4, 45_000);
        Employee ivanov9 = new Employee("Иван9","Иванович","ДевятыйИванов",43, 4, 55_000);
        Employee ivanov10 = new Employee("Иван10","Иванович","ДесятыйИванов",53, 4, 155_000);
        Employee.employeeList[0] = klepov;
        Employee.employeeList[1] = frolov;
        Employee.employeeList[2] = volosevich;
        Employee.employeeList[3] = karpov;
        Employee.employeeList[4] = kasparov;
        Employee.employeeList[5] = elkin;
        Employee.employeeList[6] = palkin;
        Employee.employeeList[7] = ivanov;
        Employee.employeeList[8] = ivanov2;
        Employee.employeeList[9] = ivanov3;
        Employee.employeeList[10] = ivanov4;
        Employee.employeeList[11] = ivanov5;
        Employee.employeeList[12] = ivanov6;
        Employee.employeeList[13] = ivanov7;
        Employee.employeeList[14] = ivanov8;
        Employee.employeeList[15] = ivanov9;
        Employee.employeeList[16] = ivanov10;

        Employee. setSalaryIncrease (0, 10);
        Employee.printAllActiveEmployees();


        Employee. getMinSalary(3);
        Employee.getMaxSalary(4);
        Employee.getTotalSalary(4);
        Employee.getAverageSalary(2);
        Employee.printAllDepartmentEmployees(1);
        Employee.printLowerSalaryEmployees(100000);
        Employee.printHigherSalaryEmployees(100000);


    }
}