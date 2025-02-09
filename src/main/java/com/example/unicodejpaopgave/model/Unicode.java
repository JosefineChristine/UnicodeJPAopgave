package com.example.unicodejpaopgave.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Unicode {

    @Id
    private int unicode;
    private char bogstav;


    public int getUnicode() {
        return unicode;
    }

    public char getBogstav() {
        return bogstav;
    }

    public void setUnicode(int unicode) {
        this.unicode = unicode;
    }

    public void setBogstav(char bogstav) {
        this.bogstav = bogstav;
    }
}
