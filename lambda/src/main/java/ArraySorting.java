public class ArraySorting {

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
//      as.sort();

        QuickSort qs = new QuickSort();
        BubleSort bs = new BubleSort();
        as.sort(qs);
        as.sort(bs);

        Sorting noLambda = new QuickSort();
        noLambda.sort();

        Sorting quickSort = () -> System.out.println("Quick Sorting");
        as.sort(quickSort);

        Sorting bubleSort = () -> System.out.println("Buble Sorting");
        as.sort(bubleSort);

        as.sort(() -> System.out.println("Buble Sorting"));



    }
//  Behaviour parameterization
    private void sort(Sorting sorting) {
        sorting.sort();
    }

}


interface MyLambda{
    void print();
}
