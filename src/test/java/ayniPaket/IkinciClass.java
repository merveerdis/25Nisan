package ayniPaket;

public class IkinciClass {

    public static void method2(String a){

        System.out.println("Ikinci Class **********************");
        int uzunluk = a.length();
        System.out.println(uzunluk);
        System.out.println(a.contains("A"));
        System.out.println(a.substring(a.indexOf(" "),a.lastIndexOf(" ")));
        System.out.println(a.replaceAll("\\S","*"));
        System.out.println(a.replaceAll("\\d","%"));

    }
}
