public class Main {
    public static void main(String[] args) {
        int tab[] = new int[]{1,2,3,5,6,8,9};

        for (int i = 0; i < tab.length; i++) {
            if ( i % 2 ==0){
                System.out.println(tab[i]);
            }
        }
    }
}
