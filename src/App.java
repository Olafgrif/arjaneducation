public class App extends Object {

    public static void main(String[] args) throws Exception {
        //int a = "1"; // gaat fout
        //String woordje = "dit2";
        // Persoon arjan = new Persoon("Arjan", 100);

        // Persoon olaf = new Persoon("Olaf", 99);
        
        //arjan = olaf;

        Persoon anon = new Persoon(100);

        System.out.println(anon);

        int hoi = 5;
        hoi += 5;
        hoi = hoi + 5;

        // String dag = "Maandag"
        // switch(dag)
        // {
        //     case "Maandag":
        //     System.out.println("Het is maandag");
        //     break;
        //     case 2:
        //     System.out.println("Case2: Value is: "+num);
        //     break;
        //     case 3:
        //     System.out.println("Case3: Value is: "+num);
        //     break;
        //     default:
        //     System.out.println("Default: Value is: "+num);
        // }
        // boolean waar = true;
        // while (waar == true)
        // {
        //     System.out.println("Het is waar");
        // }

        // String ternaryExample = "";
        // if (hoi > 4) {
        //     ternaryExample = "dit";
        // } else {
        //     ternaryExample = "dat";
        // }

        //String ternaryExample = hoi > 4 ? "dit" : "dat";
        //System.out.println(ternaryExample);
        
        //System.out.println(arjan.getHoogte());
        //veranderHoogte(arjan);
        // System.out.println(olaf.getHoogte());
        // System.out.println(arjan.getHoogte());

        // System.out.println(arjan.getHoogte());
        // arjan.setHoogte(182);
        // System.out.println(arjan.getHoogte());
        // boolean iswaar = true;
        // if (iswaar) {
        //     System.out.println(arjan);
        // } else if (false) {
        //     System.out.println("Niet arjan");
        // }
        
        // int[] nummertjes = {1,2,3,4,5};

        // for (int a : nummertjes) {
        //     System.out.println(a);
        // }

        // for (int i = 0; i < 5; i++) {
        //     System.out.println(i);
        //   }


    }

    public static void veranderHoogte(Persoon persoon) {
        persoon.setHoogte(150);
    }
}
