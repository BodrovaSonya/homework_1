/**
 *  Поиск максимального элемента в массиве.
 *  Для начала задать массив слов.Размерность массива произвольна, задается в консоли.
 *  После чего в консоли вводятся слова в количестве равном заданной длине массива.
 *  В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль
 */

public class Array {
    private String array[];
    private int arr_length;

    public void setArray(String arr[]){
        if (arr.length != this.array.length)
            System.out.println("Input correct array");
        for (int i = 0; i < arr.length; i++){
            this.array[i] = arr[i];
        }
    }
    public String[] getArray() {
        return array;
    }
}
