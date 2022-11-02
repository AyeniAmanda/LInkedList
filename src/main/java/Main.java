public class Main {
    public static void main (String[] args){
        LinkedList  list = new LinkedList();
        list.insert(12);
        list.insert(3);
        list.insert(9);

        list.insertAtStart(1);

        list.insertAt(2,19);

       list.deleteAt(2);

        list.show();

    }
}
