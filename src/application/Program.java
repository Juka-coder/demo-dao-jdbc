package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== TEST NUMBER 1 seller findbbyid ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        System.out.println("=== TEST NUMBER 2 seller findbbyid ===");
        Department department = new Department(3, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller seller1 : list) {
            System.out.println(seller1);
        }
        System.out.println("=== TEST NUMBER 2 seller findALL ===");
        list = sellerDao.findAll();
        for (Seller seller1 : list) {
            System.out.println(seller1);
        }
        System.out.println("=== TEST NUMBER 3 seller insert ===");
        Seller newSeller = new Seller("Greg", null, "greg@gmail.com", LocalDate.now(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted | New ID = " + newSeller.getId());
    }
}
