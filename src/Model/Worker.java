package Model;

import java.util.Scanner;

public class Worker extends Cadres {
    private String level;

    public Worker() {
    }

    public Worker(Integer id, String name, Integer age, String gender, String address, String level) {
        super(id, name, age, gender, address);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void inputWorker() {
        Scanner scanner = new Scanner(System.in);
        super.inputCadres();

        String regexLevel = "[1-9]|10";
        do {
            System.out.println("Enter level: ");
            this.level = scanner.nextLine();
            if (!this.level.matches(regexLevel)) {
                System.out.println("Level must be from 1 to 10");
            }
        } while (!this.level.matches(regexLevel));
    }


    @Override
    public String toString() {
        return "Worker{" +
                "id='" + super.getId() + '\'' +
                ", age=" + super.getName() +
                ", gender='" + super.getGender() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                "level='" + level + '\'' +
                '}';
    }
}
