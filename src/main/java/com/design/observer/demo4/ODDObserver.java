package com.design.observer.demo4;

import java.util.Observable;
import java.util.Observer;

/**
 * ODDObserver
 *
 * @author dk
 * @date 2016/11/30
 */
public class ODDObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if((Integer)arg == NumsObservable.ODD){
            NumsObservable myObserable = (NumsObservable) o;
            System.out.println("OddObserver:Data has changed to " + myObserable.getData());
        }
    }
}
