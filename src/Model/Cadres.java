package Model;

import java.util.Scanner;

public class Cadres {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private String address;

    public Cadres() {
    }

    public Cadres(Integer id, String name, Integer age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputCadres() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter id: ");
            this.id = scanner.nextInt();
            if (this.id < 0) {
                System.out.println("re-enter id!");
            }
        } while (this.id < 0);

        scanner.nextLine();

        System.out.println("Enter name: ");
        this.name = scanner.nextLine();

        do {
            System.out.println("Enter age: ");
            this.age = scanner.nextInt();
            if (this.age < 18 || this.age > 60) {
                System.out.println("re-enter age!");
            }
        } while (this.age < 18 || this.age > 60);

        scanner.nextLine();

        String regex = "^(Man|Woman|Other)$";
        do {
            System.out.println("Enter gender: ");
            this.gender = scanner.nextLine();
            if (!this.gender.matches(regex)) {
                System.out.println("re-enter gender!");
            }
        } while (this.gender.matches(regex) == false);

        System.out.println("Enter address: ");
        this.address = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Cadres{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
