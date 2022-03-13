package by.tovpenets.document;

import java.time.LocalDate;

public class FinancialInvoice extends Document {

    private long totalMonthAmount;
    private byte departmentCode;

    public FinancialInvoice() {}

    public FinancialInvoice(int number, LocalDate date, long totalMonthAmount, byte departmentCode) {
        this.number = number;
        this.date = date;

        this.totalMonthAmount = totalMonthAmount;
        this.departmentCode = departmentCode;
    }

    public long getTotalMonthAmount() {
        return totalMonthAmount;
    }

    public void setTotalMonthAmount(long totalMonthAmount) {
        this.totalMonthAmount = totalMonthAmount;
    }

    public byte getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(byte departmentCode) {
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "FinancialInvoice{" +
                "number=" + number +
                ", date=" + date +
                ", totalMonthAmount=" + totalMonthAmount +
                ", departmentCode=" + departmentCode +
                '}';
    }
}
