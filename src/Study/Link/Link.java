package Study.Link;

public class Link {

    private String name;
    private double price;
    private Link next;

    public void displayLink() {
        System.out.println("{" + name + ", " + price + "}");
    }

    public Link(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public Link getNext() {
        return next;
    }
}