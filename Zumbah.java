public class Zumbah extends SupremeBoohbah{

    private String name;
    Zumbah(){
        super();
        this.name = "Zumbah";
        System.out.println(this.name + " buys the rest of the Playskool BoohBah Spinning Tops Set to up the price to become rich so they can be the Boohbah Supreme >:D");
    }

    @Override
    public void command(){
        super.command();
        System.out.println(this.name + " will buy a few, however for their own plans");
    }

}
