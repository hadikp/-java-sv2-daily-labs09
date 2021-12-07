package day01;

import java.time.LocalDateTime;

public class FrontOfStageTicket extends Ticket {

    private int cheaperPrice;

    public FrontOfStageTicket(String bandName, LocalDateTime time, int price, int cheaperPrice) {
        super(bandName, time, price);
        this.cheaperPrice = cheaperPrice;
    }

    @Override
    public int entryTime() {
        return super.entryTime() - 1;
    }

    public int getCheaperPrice() {
        return cheaperPrice;
    }
}
