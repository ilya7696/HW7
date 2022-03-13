package by.tovpenets.document;

import java.time.LocalDate;

public class ContractEmployee extends Document {

    private LocalDate dateOfClosed;
    private String name;

    public ContractEmployee() {}

    public ContractEmployee(int number, LocalDate date, LocalDate dateOfClosed, String name) {
        this.number = number;
        this.date = date;

        this.dateOfClosed = dateOfClosed;
        this.name = name;
    }

    public LocalDate getLocalDateOfClosed() {
        return dateOfClosed;
    }

    public void setLocalDateOfClosed(LocalDate dateOfClosed) {
        this.dateOfClosed = dateOfClosed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "number=" + number +
                ", date=" + date +
                ", dateOfClosed=" + dateOfClosed +
                ", name='" + name + '\'' +
                '}';
    }
}
