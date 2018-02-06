package SpringDemo.SpringAWForSetter.AnnodationAutowireWithBean;

public class Robot {


    public void speak() {
        System.out.println("Speaking ..");
    }


    public String getSpeak_lang() {
        return speak_lang;
    }

    public void setSpeak_lang(String speak_lang) {
        this.speak_lang = speak_lang;
    }

    private String speak_lang ;



}
