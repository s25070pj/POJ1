public class AutoShop {
    public static void main(String[] args) {

        Sedan sedan = new Sedan(160, 20000.0, "red", 10);
        System.out.println(sedan.toString());
        Ford ford1 = new Ford(156,4452,"black", 2005, 10);
        System.out.println(ford1.toString());
        Ford ford2 = new Ford(155,5000,"pink", 1998, 5);
        System.out.println(ford2.toString());
        Truck truck = new Truck(200,500000,"gold", 5000);
        System.out.println(truck.toString());
    }
}
