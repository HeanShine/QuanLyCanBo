package Model;

import java.util.Scanner;

public class Engineer extends Cadres {

    private String branch;

    public Engineer(String branch) {
        this.branch = branch;
    }

    public Engineer(Integer id, String name, Integer age, String gender, String address, String branch) {
        super(id, name, age, gender, address);
        this.branch = branch;
    }

    public Engineer() {

    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void inputEngineer() {
        Scanner scanner = new Scanner(System.in);
        super.inputCadres();
        System.out.println("Enter branch: ");
        this.branch = scanner.nextLine();
    }


    @Override
    public String toString() {
        return "Engineer{" +
                "id='" + super.getId() + '\'' +
                ", age=" + super.getName() +
                ", gender='" + super.getGender() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                "branch='" + branch + '\'' +
                '}';
    }
}
