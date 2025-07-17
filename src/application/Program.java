package application;

import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "books");
        Seller seller = new Seller("Bob", 21, "bob@gmail.com", LocalDate.now(), 3000.0,obj);
        System.out.println(seller);

    }
}
