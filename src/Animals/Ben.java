package Animals;

public class Ben extends Dog {

    private boolean chance;

    public Ben(boolean chance) {
        this.chance = chance;
    }

    @Override
    public void Voice() {
        if(chance) {
            voiceYes();
        }
        else  {
            voiceNo();
        }
    }
    private void voiceYes() {
        System.out.println("Ho-ho-ho, yes");
    }

    private void voiceNo() {
        System.out.println("No!");
    }
}
