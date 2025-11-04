package proeftentamen.luchtvaartmaatschappij;

// Demo klasse voor proeftentamen - opgaven 3.2 en 3.3

public class Application {
    public static void main(String[] args) throws Exception{
        try {
            LvmManager manager = new LvmManager();
            LuchtvaartMaatschappij lvm = manager.lvmInladen("lvm.obj");

            System.out.println(lvm);

            if (!lvm.heeftVliegtuig("Boeing 747")) {
                lvm.voegVliegtuigToe(new Vliegtuig("Boeing 747", 4, "PH-BFC"));
                lvm.voegVliegtuigToe(new Vliegtuig("Boeing 747", 4, "PH-BFC"));
            }

            System.out.println(lvm);
        } catch (Exception e) {
            System.out.println("De luchtvaartmaatschappij kon niet gelezen worden: " + e.getMessage());
        }
    }
}
