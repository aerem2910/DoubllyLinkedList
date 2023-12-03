package GbList;

public class DoublyMain {
    public static void main(String[] args) {
        GbList<Integer> list = new DoublyLinkedList<>();
        System.out.println(list.isEmpty());
        System.out.println(list);
        list.add(1).add(2).add(3).add(4);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.update(99, 0);
        System.out.println(list);
    }
}

