package com.loosecoupling;

import com.loosecoupling.Cheat.Cheat;

public class ScienceCheat implements Cheat {
    @Override
    public void cheat() {
        System.out.println("Science Cheat is created using interface loose coupling");
    }
}
