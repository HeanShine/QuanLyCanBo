package MenuManage;

import Manage.ManagerCadres;
import Model.Engineer;
import Model.Staff;
import Model.Worker;

import java.util.Scanner;

public class MenuManageCadres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        ManagerCadres managerCadres = new ManagerCadres();

        while (true) {
            System.out.println("1. Add cadres");
            System.out.println("2. Show cadres");
            System.out.println("3. Search cadres");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            do {
                System.out.println("enter selection : ");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please Re-enter");
                }
            } while (choice != 1 && choice != 2 && choice != 3 && choice != 4);

            switch (choice) {
                case 1:
                    System.out.println("1. Add staff");
                    System.out.println("2. Add engineer");
                    System.out.println("3. Add worker");
                    System.out.println("Enter your choice: ");
                    int choice1 = 0;

                    do {
                        System.out.println("enter selection : ");
                        try {
                            choice1 = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please Re-enter");
                        }
                    } while (choice1 != 1 && choice1 != 2 && choice1 != 3);

                    switch (choice1) {
                        case 1:

                            Staff staff = new Staff();
                            staff.inputStaff();
                            managerCadres.addCadres(staff);
                            break;
                        case 2:
                            Engineer engineer = new Engineer();
                            engineer.inputEngineer();
                            managerCadres.addCadres(engineer);
                            break;
                        case 3:
                            Worker worker = new Worker();
                            worker.inputWorker();
                            managerCadres.addCadres(worker);
                            break;
                    }
                    break;

                case 2:
                    managerCadres.showCadres();
                    break;
                case 3:
                    int idSearch;

                    do {
                        System.out.print("Nhập id can bo muốn tim kiem : ");

                        while (!scanner.hasNextInt()) {
                            System.out.println("Đây không phải là số. Vui lòng nhập lại.");
                            scanner.next();
                        }

                        idSearch = scanner.nextInt();
                    } while (idSearch <= 0);
                    managerCadres.searchCadres(idSearch);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}

