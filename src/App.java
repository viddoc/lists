//Tommy Hudson List Testing


public final class App {

    public static void main(String[] args) 
    {
        dynamicArray<Integer> intArr = new dynamicArray<Integer>();
        dynamicArray<String> strArr = new dynamicArray<String>("One", "Two", "Three", "Four", "Five");
        dynamicArray<Double> dblArr = new dynamicArray<Double>(1.0, 2.0, 3.0, 4.0, 5.0);
        intArr.append(1);
        intArr.append(2);
        intArr.append(3);
        intArr.append(4);
        intArr.append(5);
        intArr.print();
        strArr.print();
        dblArr.print();
        intArr.prepend(0);
        strArr.delete(4);
        dblArr.insert(0, 0.0);
        intArr.print();
        strArr.print();
        dblArr.print();
        System.out.println("The object at index 2 in the integer array is: " + intArr.get(2));
        System.out.println("The string array contains the object \"Ten\": " + strArr.contains("Ten"));
        System.out.println("The double array is empty: " + dblArr.isEmpty());
        intArr.search(10);
        strArr.search("Three");

        
    }
}
