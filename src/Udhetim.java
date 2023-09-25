import java.util.UUID;
public class Udhetim {
    // attributes
    private UUID id = UUID.randomUUID();
    private String nisja;
    private String mberritja;
    private float distanca;
    private float sasia;

    // constructor
    public Udhetim(String nisja, String mberritja, float distanca, float sasia) {
        this.nisja = nisja;
        this.mberritja = mberritja;
        this.distanca = distanca;
        this.sasia = sasia;
    }

    // Set and Get for nisja
    public String getNisja() {
        return nisja;
    }
    public void setNisja(String nisja) {
        this.nisja = nisja;
    }

    // Set and Get for mberritja
    public String getMberritja() {
        return mberritja;
    }
    public void setMberritja(String mberritja) {
        this.mberritja = mberritja;
    }

    // Set and Get for distanca
    public float getDistanca() {
        return distanca;
    }
    public void setDistanca(float distanca) {
        this.distanca = distanca;
    }

    // Set and Get for sasia
    public float getSasia() {
        return sasia;
    }
    public void setSasia(float sasia) {
        this.sasia = sasia;
    }

    // display method
    public void Afisho() {
        System.out.println("Nisja: " + nisja);
        System.out.println("Mberritja: " + mberritja);
        System.out.println("Distanca: " + distanca + " km");
        System.out.println("Sasia e ngarkeses: " + sasia + " kg");
    }

    // change method
    public void NdryshoSasi(float sasiaRe) {
        if (sasiaRe < 2000) {
            this.sasia = sasiaRe;
        }
    }
}