package homework8;

public interface MyList {
    void add(Object value); //добавляет элемент в конец
    void remove(int index); //удаляет элемент под индексом
    void clear(); //очищает коллекцию
    int size(); //возвращает размер коллекции
    Object get(int index); //возвращает элемент под индексом
}
