package Model;

import java.util.Scanner;

public class Staff extends Cadres {
    private String job;

    public Staff(String job) {
        this.job = job;
    }

    public Staff(Integer id, String name, Integer age, String gender, String address, String job) {
        super(id, name, age, gender, address);
        this.job = job;
    }

    public Staff() {

    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void inputStaff() {
        Scanner scanner = new Scanner(System.in);
        super.inputCadres();
        System.out.println("Enter job: ");
        this.job = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + super.getId() + '\'' +
                ", age=" + super.getName() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                "job='" + job + '\'' +
                '}';
    }
}
