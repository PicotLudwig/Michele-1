package groceryAssignment;

public class Main {

    public static void main(String[] args) {
        Item tin = new Item("sardine", 500, 500);
        FreshItem fresh = new FreshItem("sardine", 500, 500, "2012-04-11");
        FreshItem fresh2 = new FreshItem("sardine x3", 1500, 1500, "2012-04-11");
        System.out.println(tin.taxRatePerTenThousand());     // affiche: 1000
        System.out.println(fresh.taxRatePerTenThousand());   // affiche: 1000
        System.out.println(fresh2.taxRatePerTenThousand());  // affiche:  990
        Invoice invoice = new Invoice();
        invoice.add(tin);
        invoice.add(fresh);
        invoice.add(fresh2);
        System.out.println(invoice.totalAmount());  // affiche: 2500
        System.out.println(invoice.totalTax());     // affiche:  248


    }
}
