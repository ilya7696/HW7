package by.tovpenets;

/*
    Создать систему для учета документов.

    Создать класс Регистр, который будет иметь методы:
        - сохранения документа в регистре
        - предоставление информации о документе

    Система может работать с тремя типами документов:
    1) Контракт на поставку товаров
        Содержит поля:
            - Номер документа
            - Тип товаров
            - Количество товаров
            - Дата документа

    2) Контракт с сотрудником
        Содержит поля:
            - Номер документа
            - Дата документа
            - Дата документа
            - Дата окончания контракта
            - Имя сотрудника

    3) Финансовая накладная
        Содержит поля:
            - Итоговая сумма за месяц
            - Дата документа
            - Номер документа
            - Код департамента


    - Класс регистр должен содержать внутри себя массив и при добавлении
    документа в регистр этот добавляемый документ должен добавляться в
    массив;
    - Массив для класса регистра должен быть размером 10;
    - Для полей "Дата документа" следует использовать тип данных LocalDate;
    - В методе предоставления информации о документе следует выводить
    на экран информацию о переданном входным параметром документе;
    - Каждый класс для описания документов должен содержать конструктор
    с параметрами и без;
    - Для имитации работы системы создайте класс Main, который будет
    содержать только один метод public static void main
    В этом методе напишите код для создания каждого из типов
    документов, добавления их в регистр и вывода информации о документе;
    - Все классы разместить по пакетам;
    - При выполнении задания использовать понятия интерфейсов и
    абстрактных классов.
*/

import by.tovpenets.document.ContractEmployee;
import by.tovpenets.document.ContractSupplyGoods;
import by.tovpenets.document.Document;
import by.tovpenets.document.FinancialInvoice;
import by.tovpenets.register.Register;
import by.tovpenets.register.impl.RegisterImpl;
import java.time.LocalDate;

public class Main {

    private final static LocalDate CURRENT_DATE = LocalDate.now();
    private final static Register REGISTER = new RegisterImpl();

    public static void main(String[] args) {
        Document supply = new ContractSupplyGoods(1, CURRENT_DATE, "SupplyType", 10);
        Document employee = new ContractEmployee(2, CURRENT_DATE, CURRENT_DATE.plusDays(12), "Ilya");
        Document invoice = new FinancialInvoice(3, CURRENT_DATE, 10_234_999L, (byte) 120);

        REGISTER.put(supply);
        REGISTER.put(employee);
        REGISTER.put(invoice);

        System.out.println(REGISTER.getInfo(supply));
        System.out.println(REGISTER.getInfo(employee));
        System.out.println(REGISTER.getInfo(invoice));

        System.out.println("\n\n\n");

        REGISTER.printElements();
    }
}