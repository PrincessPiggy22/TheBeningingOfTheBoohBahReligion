public class SupremeBoohbah {

    private String name;
    SupremeBoohbah(){
        this.name = "Zing Zing Zingbah";
        System.out.println("The Boohbah Supreme has awakened");
    }

    public void command(){
        System.out.println(this.name + ", the Boohbah Supreme, commands all to buy the Playskool BoohBah Spinning Tops Set or PERISH PAINFULLY");
    }

    public void command(String message, boolean e){ // w/ out the boolean the overload in Jingbah wouldn't work bc in the Arraylist, Jingbah was a SupremeBoohbah and wouldn't use any Jingbah stuff
        System.out.println(message);
    }

}
