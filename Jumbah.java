public class Jumbah extends SupremeBoohbah{

    private String name;
    Jumbah(){
        super();
        this.name = "Jumbah";
        System.out.println(this.name + " does everything they can to prevent the Boohbah Supreme's power of capitalism from corrupting Boohbahland");
    }

    @Override
    public void command(){
        System.out.println(this.name + " refuses to buy the overpriced Top Turner");
    }

}
