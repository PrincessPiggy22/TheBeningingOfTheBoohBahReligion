public class BoohbahRebellionTest {
    public static void main(String[] args) {

        System.out.println("\n");
        SupremeBoohbah[] theBoohbahs = {new Humbah(), new Zumbah(), new Jumbah(), new Jingbah()};

        System.out.println("\nSo begins the battle for the fate of Boohbahland.... \n");

        for (SupremeBoohbah b : theBoohbahs){
            b.command();
        }

        System.out.println("\n---Overloaded Commands---\n");

        theBoohbahs[0].command("Zing Zing Zingbah says: \"Buy the Playskool BoohBah Spinng Tops Set or perish at my hand\"", true);
        //Jingbah j = new Jingbah();
        theBoohbahs[3].command("Can we all please just chill?", true);

    }
}
