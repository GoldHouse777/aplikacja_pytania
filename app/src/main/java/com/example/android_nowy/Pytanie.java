package com.example.android_nowy;

public class Pytanie {
    private String tresc;
    private boolean poprawnaOdpowiedz;
    private String podpowiedz;
    private boolean czyOdpPop;

    public Pytanie(String tresc, boolean poprawnaOdpowiedz, String podpowiedz) {
        this.tresc = tresc;
        this.poprawnaOdpowiedz = poprawnaOdpowiedz;
        this.podpowiedz = podpowiedz;
        czyOdpPop = false;
    }

    public void setCzyOdpPop(boolean czyOdpPop) {
        this.czyOdpPop = czyOdpPop;
    }

    public String getTresc() {
        return tresc;
    }

    public boolean isPoprawnaOdpowiedz() {
        return poprawnaOdpowiedz;
    }

    public String getPodpowiedz() {
        return podpowiedz;
    }

    public boolean isCzyOdpPop() {
        return czyOdpPop;
    }
}

