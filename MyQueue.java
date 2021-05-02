package homework8;

public interface MyQueue {
    void add(Object value); //добавляет элемент в конец
    void remove(int index); //удаляет элемент под индексом
    void clear(); //очищает коллекцию
    int size(); //возвращает размер коллекции
    Object peek(); //возвращает первый элемент в очереди (FIFO)
    Object poll(); //возвращает первый элемент в очереди и удаляет его из коллекции
}
