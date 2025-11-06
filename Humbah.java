public class Humbah extends SupremeBoohbah{

    private String name;
    Humbah(){
        super();
        this.name = "Humbah";
        System.out.println(this.name + " buys out most of the Playskool BoohBah Spinning Tops Set");
    }

    @Override
    public void command(){
        super.command();
        System.out.println(this.name + " will happily spend $100 to please the Boohbah supreme");
    }


}
