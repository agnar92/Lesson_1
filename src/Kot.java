import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by KomputerK on 10.05.2017.
 */
public class Kot {
    private String imie;
    private String imieOpiekuna;
    private Date dataUrodzenia;
    private float wagaKota;


    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setImieOpiekuna(String imieOpiekuna) {
        this.imieOpiekuna = imieOpiekuna;
    }

    public String getImie() {
        return imie;
    }

    public String getImieOpiekuna() {
        return imieOpiekuna;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;

    }

    public float getWagaKota() {
        return wagaKota;
    }

    public void setWagaKota(float wagaKota) {
        this.wagaKota = wagaKota;
    }
}
