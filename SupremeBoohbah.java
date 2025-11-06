public class SupremeBoohbah {

    private String name;
    SupremeBoohbah(){
        this.name = "Zing Zing Zingbah";
        System.out.println("The Boohbah Supreme has awakened");
    }

    public void command(){
        System.out.println(this.name + ", the Boohbah Supreme, commands all to buy the Playskool BoohBah Spinning Tops Set or PERISH PAINFULLY");
    }

    public void command(String message){
        System.out.println(message);
    }

}
