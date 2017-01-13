package com.company;

/**
 * Created by Matthew on 1/12/17.
 */
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
//        getMonitor().drawPixelAt(1200,50, "yellow");
        monitor.drawPixelAt(1200,50,"yellow");
    }

}
