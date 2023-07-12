package exampleBill.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class bill {
    private int id_bill;
    private String descrption;
    private Date date;
    private clients Clients;
    private itemBill[] item_principal;
    private int indexItem;
    public static final int MAX_ITEMS = 10;
    private static int lastId;

    public bill(String descrption, clients clients) {
        this.descrption = descrption;
        this.Clients = clients;
        this.item_principal = new itemBill[MAX_ITEMS];
        this.id_bill = ++lastId;
        this.date = new Date();
    }

    public int getId_bill() {
        return id_bill;
    }

    public void setId_bill(int id_bill) {
        this.id_bill = id_bill;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public clients getClients() {
        return Clients;
    }

    public void setClients(clients clients) {
        Clients = clients;
    }

    public itemBill[] getItem_principal() {
        return item_principal;
    }

    public void addItemBill(itemBill item) {
        if (indexItem < MAX_ITEMS) {
            this.item_principal[indexItem++] = item;
        }
    }

    public float calculateTotal() {
        float total = 0.0f;
        for (itemBill items : this.item_principal) {
            if (items == null) {
                continue;
            }
            total += items.calculateImport();

        }
        return total;
    }

    public String seeDetails() {
        StringBuilder sb = new StringBuilder("Bill number: ");
        SimpleDateFormat df = new SimpleDateFormat("dd' of' MMMM, YYYY");
        sb.append("Date of issue: ").
                append(df.format(this.date)).append("\n");
        sb.append(id_bill).
                append("\nClient: ").
                append(this.Clients.getName()).
                append("\tNit: ").
                append(this.Clients.getNit()).
                append("\nDescription: ").
                append(this.descrption).
                append("\n").
                append("\n#\tName\t$\tAmount\tTotal\n");


        for (itemBill temp : this.item_principal) {
            if (temp == null) {
                continue;
            }
            sb.append(temp).append("\n");


        }
        sb.append("\nGrand tolta: ").append(calculateTotal());

        return sb.toString();
    }
}
