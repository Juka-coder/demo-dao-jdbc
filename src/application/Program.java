package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "books");
        Seller seller = new Seller("Bob", 21, "bob@gmail.com", LocalDate.now(), 3000.0,obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println(seller);

    }
}
