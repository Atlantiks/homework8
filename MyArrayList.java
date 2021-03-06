package homework8;


public class MyArrayList implements MyList {

    private Object[] array;
    private int positionToAddTo;

    public MyArrayList() {
        clear();
    }

    @Override
    public void add(Object value) {
        if (positionToAddTo >= array.length) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            this.array = newArray;
        }
        array[positionToAddTo++] = value;
    }

    @Override
    public void remove(int index) {
        Object[] newArray = new Object[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) newArray[j++] = array[i];
        }
        array = newArray;

    }

    @Override
    public void clear() {
        this.array = new Object[10];
        positionToAddTo = 0;
    }

    @Override
    public int size() {
        return positionToAddTo;
    }

    @Override
    public Object get(int index) {
        try {
            return array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Размер коллекции меньше запрашиваемого индекса");
        }
        return null;
    }
}
