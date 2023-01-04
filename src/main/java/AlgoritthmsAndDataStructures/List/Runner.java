package AlgoritthmsAndDataStructures.List;

public class Runner {
    public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insert(5);
    list.insert(10);
    list.insert(15);

    list.insertAt(0,50);

    list.show();
    }
}
