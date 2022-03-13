package by.tovpenets.register.impl;

import by.tovpenets.document.Document;
import by.tovpenets.register.Register;

public class RegisterImpl implements Register {

    private static final Document[] documents = new Document[10];
    private static int documentCount = 0;

    @Override
    public void put(Document document) {
        documents[documentCount] = document;
        documentCount++;
    }

    @Override
    public String getInfo(Document document) {
        return document.toString();
    }

    public void printElements() {
        for (Document document : documents) System.out.println(document);
    }

}
