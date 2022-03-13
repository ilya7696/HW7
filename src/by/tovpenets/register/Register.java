package by.tovpenets.register;

import by.tovpenets.document.Document;

public interface Register {

    void put(Document document);

    String getInfo(Document document);

    void printElements();
}
