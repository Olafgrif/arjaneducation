public class App extends Object {

    public static void main(String[] args) throws Exception {
        //int a = "1"; // gaat fout
        //String woordje = "dit2";
        Persoon arjan = new Persoon("Arjan", 100);
        // System.out.println(arjan.getHoogte());
        // arjan.setHoogte(182);
        // System.out.println(arjan.getHoogte());
        boolean iswaar = true;
        if (iswaar) {
            System.out.println(arjan);
        } else if (false) {
            System.out.println("Niet arjan");
        }
        
        int[] nummertjes = {1,2,3,4,5};

        for (int a : nummertjes) {
            System.out.println(a);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
          }
    }
}
