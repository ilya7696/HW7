package by.tovpenets.document;

import java.time.LocalDate;

public class ContractSupplyGoods extends Document {

    private String type;
    private int count;

    public ContractSupplyGoods() {}

    public ContractSupplyGoods(int number, LocalDate date, String type, int count) {
        this.number = number;
        this.date = date;

        this.type = type;
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "ContractSupplyGoods{" +
                "number=" + number +
                ", date=" + date +
                ", type='" + type + '\'' +
                ", count=" + count +
                '}';
    }
}
