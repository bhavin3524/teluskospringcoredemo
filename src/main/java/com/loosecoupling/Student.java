package com.loosecoupling;

import com.loosecoupling.Cheat.Cheat;

public class Student {

    private Cheat cheat;

    public Cheat getCheat() {
        return cheat;
    }

    public void setCheat(Cheat cheat) {
        this.cheat=cheat;
    }

    public void cheating()
    {
        cheat.cheat();
    }
}
