package Study.Link;

public class LinkList {

    private Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(String name, double price) {
        Link newLink = new Link(name, price);
        newLink.setNext(first);
        first = newLink;
    }

    public Link find(String keyName) {
        if (!isEmpty()){
            Link current = first;
            while (current.getName() != keyName) {
                if (current.getNext() == null) return null;
                else current = current.getNext();
            }
            return current;
        }
        return null;
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.getNext();
        return temp;
    }

    public Link delete (String keyName) {
        if (!isEmpty()) {
            Link current = first;
            Link previous = first;

            while (current.getName() != keyName) {
                if (current.getNext() == null)
                    return null;
                else {
                    previous = current;
                    current = current.getNext();
                }
            }
            if (current == first)
                first = first.getNext();
            else
                previous.setNext(current.getNext());

            return current;
        }
    return null;
    }

    public void displayList(){
        if (!isEmpty()) {
            System.out.println("List (first --> last): ");
            Link current = first;
            while (current != null) {
                current.displayLink();
                current = current.getNext();
            }
            System.out.println();
        }
        else System.out.println("No data");
    }
}