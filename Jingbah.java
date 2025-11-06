public class Jingbah extends SupremeBoohbah{

    private String name;
    Jingbah(){
        super();
        this.name = "Jingbah";
        System.out.println(this.name + " really doesn't want everyone to get so involved in any of this and wishes they could all dance together like they used to");
    }

    @Override
    public void command(){
        super.command();
        System.out.println(this.name + " just wants everyone to chill");
    }
    public void command(String message, boolean whisper){
        if(whisper){
            System.out.println(this.name + " whispers " + "\"" + message.toLowerCase() + "\"");
        } else {
            System.out.println(this.name + " shouts " + "\"" + message.toUpperCase() + "\"");
        }

    }

}
