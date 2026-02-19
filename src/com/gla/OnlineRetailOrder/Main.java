package com.gla.OnlineRetailOrder;
class Main {
    public static void main(String[] args) {
        Order o1 = new Order(101, "19-02-2026");
        Order o2 = new ShippedOrder(102, "18-02-2026", "TRK123");
        Order o3 = new DeliveredOrder(103, "15-02-2026", "TRK456", "17-02-2026");

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}
