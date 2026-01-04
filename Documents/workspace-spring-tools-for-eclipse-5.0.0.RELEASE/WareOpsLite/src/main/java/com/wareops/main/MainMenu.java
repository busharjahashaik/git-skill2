package com.wareops.main;

import com.wareops.dao.*;
import com.wareops.entity.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // DAO instances
        WarehouseDAO warehouseDAO = new WarehouseDAO();
        SupplierDAO supplierDAO = new SupplierDAO();
        CustomerDAO customerDAO = new CustomerDAO();
        ProductDAO productDAO = new ProductDAO();
        BinDAO binDAO = new BinDAO();
        PurchaseReceiptDAO purchaseReceiptDAO = new PurchaseReceiptDAO();
        PurchaseItemDAO purchaseItemDAO = new PurchaseItemDAO();
        StockLedgerDAO stockLedgerDAO = new StockLedgerDAO();
        SalesOrderDAO salesOrderDAO = new SalesOrderDAO();
        OrderItemDAO orderItemDAO = new OrderItemDAO();
        DispatchDAO dispatchDAO = new DispatchDAO();
        ReturnLogDAO returnLogDAO = new ReturnLogDAO();

        int mainChoice;

        do {
            System.out.println("\n=== WareOps Lite ===");
            System.out.println("1. Warehouse");
            System.out.println("2. Supplier");
            System.out.println("3. Customer");
            System.out.println("4. Product");
            System.out.println("5. Bin");
            System.out.println("6. Purchase Receipt");
            System.out.println("7. Purchase Item");
            System.out.println("8. Stock Ledger");
            System.out.println("9. Sales Order");
            System.out.println("10. Order Item");
            System.out.println("11. Dispatch");
            System.out.println("12. Return Log");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            mainChoice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (mainChoice) {
                case 1 -> entityMenuWarehouse(warehouseDAO, sc);
                case 2 -> entityMenuSupplier(supplierDAO, sc);
                case 3 -> entityMenuCustomer(customerDAO, sc);
                case 4 -> entityMenuProduct(productDAO, sc);
                case 5 -> entityMenuBin(binDAO, sc);
                case 6 -> entityMenuPurchaseReceipt(purchaseReceiptDAO, sc);
                case 7 -> entityMenuPurchaseItem(purchaseItemDAO, sc);
                case 8 -> entityMenuStockLedger(stockLedgerDAO, sc);
                case 9 -> entityMenuSalesOrder(salesOrderDAO, sc);
                case 10 -> entityMenuOrderItem(orderItemDAO, sc);
                case 11 -> entityMenuDispatch(dispatchDAO, sc);
                case 12 -> entityMenuReturnLog(returnLogDAO, sc);
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }

        } while (mainChoice != 0);

        sc.close();
    }

    // ------------------- Entity Menus -------------------

    private static void entityMenuWarehouse(WarehouseDAO dao, Scanner sc) {
        int choice;
        do {
            System.out.println("\n--- Warehouse Menu ---");
            System.out.println("1. Add Warehouse");
            System.out.println("2. View All Warehouses");
            System.out.println("3. Update Warehouse");
            System.out.println("4. Delete Warehouse");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    // AUTO-GENERATED ID: no longer ask for warehouseId
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter city: ");
                    String city = sc.nextLine();

                    System.out.print("Enter status (ACTIVE/INACTIVE): ");
                    String status = sc.nextLine();

                    Warehouse w = new Warehouse(name, city, status);
                    dao.save(w);  // Hibernate will generate warehouse_id
                    System.out.println("Warehouse added with ID: " + w.getWarehouseId());
                }
                case 2 -> {
                    List<Warehouse> list = dao.getAll();
                    System.out.println("ID | Name | City | Status");
                    for (Warehouse w : list) {
                        System.out.println(w.getWarehouseId() + " | " + w.getName() + " | " + w.getCity() + " | " + w.getStatus());
                    }
                }
                case 3 -> System.out.println("Update logic here...");
                case 4 -> System.out.println("Delete logic here...");
                case 0 -> System.out.println("Back to main menu...");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }

    private static void entityMenuSupplier(SupplierDAO dao, Scanner sc) {
        System.out.println("Supplier menu skeleton - add/view/update/delete similar to Warehouse");
    }

    private static void entityMenuCustomer(CustomerDAO dao, Scanner sc) {
        System.out.println("Customer menu skeleton - add/view/update/delete");
    }

    private static void entityMenuProduct(ProductDAO dao, Scanner sc) {
        System.out.println("Product menu skeleton - add/view/update/delete/deactivate");
    }

    private static void entityMenuBin(BinDAO dao, Scanner sc) {
        System.out.println("Bin menu skeleton - add/view/update/delete");
    }

    private static void entityMenuPurchaseReceipt(PurchaseReceiptDAO dao, Scanner sc) {
        System.out.println("PurchaseReceipt menu skeleton - add/view/update/delete");
    }

    private static void entityMenuPurchaseItem(PurchaseItemDAO dao, Scanner sc) {
        System.out.println("PurchaseItem menu skeleton - add/view/update/delete");
    }

    private static void entityMenuStockLedger(StockLedgerDAO dao, Scanner sc) {
        System.out.println("StockLedger menu skeleton - view movements, etc.");
    }

    private static void entityMenuSalesOrder(SalesOrderDAO dao, Scanner sc) {
        System.out.println("SalesOrder menu skeleton - add/view/update/delete");
    }

    private static void entityMenuOrderItem(OrderItemDAO dao, Scanner sc) {
        System.out.println("OrderItem menu skeleton - add/view/update/delete");
    }

    private static void entityMenuDispatch(DispatchDAO dao, Scanner sc) {
        System.out.println("Dispatch menu skeleton - add/view/update/delete/mark delivered");
    }

    private static void entityMenuReturnLog(ReturnLogDAO dao, Scanner sc) {
        System.out.println("ReturnLog menu skeleton - add/view/update/delete/close");
    }
}
