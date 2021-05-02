package homework8;

public class TestEverything {
    public static void main(String[] args) {
        MyList testList = new MyArrayList();
        MyLinkedList testList2 = new MyLinkedList();
        MyHashMap testMap = new MyHashMap();

        testList.add(0);
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        testList.add(6);
        testList.add(7);
        testList.add(8);
        testList.add(9);
        System.out.println(testList.size());
        System.out.println(testList.get(4));

        testList2.add(0);
        testList2.add(1);
        testList2.add(2);
        testList2.add(3);

        System.out.println(testList2.get(25));
        System.out.println(testList2.poll());
        System.out.println(testList2.poll());

        testMap.put("KEY",12);
        testMap.put("ANOTHER_KEY",14);
        testMap.put("KEY",1);
        System.out.println(testMap.size);
        System.out.println(testMap.get("KEY"));
        System.out.println(testMap.get("ANOTHER_KEY"));

    }



}
