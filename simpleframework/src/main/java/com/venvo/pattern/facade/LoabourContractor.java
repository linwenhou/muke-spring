package com.venvo.pattern.facade;

import com.venvo.pattern.facade.subclasses.BrickWorker;
import com.venvo.pattern.facade.subclasses.Mason;
import com.venvo.pattern.facade.subclasses.BrickLayer;

public class LoabourContractor {

    private Mason worker1  =new Mason();
    private BrickWorker worker2= new BrickWorker();
    private BrickLayer worker3 = new BrickLayer();
    public void buildHouse() {
        worker1.mix();
        worker2.carry();
        worker3.neat();
    }
}
