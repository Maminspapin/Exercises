package Study.Link;

public class LinkListApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList();
        theList.insertFirst("мыло", 34.50);
        theList.insertFirst("шампунь", 176.30);
        theList.insertFirst("зубная паста", 47.80);
        theList.insertFirst("гель для душа", 101.20);
        theList.insertFirst("пена для бритья", 65.70);
        theList.insertFirst("огуречный лосьон", 35.20);

        theList.displayList();

        theList.deleteFirst();
        theList.deleteFirst();

        theList.displayList();

        /*Link f = theList.find("огуречный лосьон");
        if (f != null)
            System.out.println("Найдено... Цена для " + f.getName() + ": " + f.getPrice());
        else
            System.out.println("Не найдено...");*/

        Link f = theList.find("шампунь");
        if (f != null)
            System.out.println("Найдено... Цена для " + f.getName() + ": " + f.getPrice());
        else
            System.out.println("Не найдено...");

        Link d = theList.delete("шампунь");

        theList.displayList();
    }
}
