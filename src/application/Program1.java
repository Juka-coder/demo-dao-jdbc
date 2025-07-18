package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST NUMBER 1 department insert ===");
        Department newDepartment = new Department(null, "TI");
        departmentDao.insert(newDepartment);

        System.out.println("New deparment ID = " + newDepartment.getId());
        System.out.println("=== TEST NUMBER 2 department findbyid ===");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("=== TEST NUMBER 3 department update ===");
        department = departmentDao.findById(10);
        department.setName("Adm");
        departmentDao.update(department);
        System.out.println("Update completed!");

        System.out.println("=== TEST NUMBER 4 department delete ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        System.out.println("=== TEST NUMBER 5 department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department department1 : list) {
            System.out.println(department1);
        }
    }
}
