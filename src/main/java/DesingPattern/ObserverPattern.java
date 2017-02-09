package DesingPattern;

/**
 * Created by muthuselvan on 2/7/17.
 */



/*
Behavioural
------------

Def 1 :
Define a one-to-many dependency between objects
so that when one object changes state, all its dependents are notified
and updated automatically.

As name suggest it’s used to observe things.
Suppose you want to notify for change in a particular object than you observer
that object and changes are notified to you.
Object which is being observed is refereed as Subject
and classes which observe subject are called Observer.
This is beautiful pattern and used heavily along with Model View Controller Design pattern
where change in model is propagated to view so that it can render it with modified information.

Problem which is solved by Observer Pattern:
--------------------------------------------
If we have requirement that if particular object change its state
and on depending upon

This changes some or group of objects automatically change their state
we need to implement observer pattern it will reduce coupling between objects.

In real world if try to find example see when we subscribe for
New Phone connection whenever customer is registered with that company
all other departments are notified accordingly and then depending upon
the state the do their jobs like do the verification of their address
then if customer state is verified then dispatch the welcome kit etc.

Implementation:
---------------

1. Public Interface Observer:
Any class who implements this interface must be notified when subject or
observable object change its status.
Update (Observable Ob, Object arg): This method is called when subject is changed.


2.Class Observable:
It’s a subject to whom observer wants to observe.

Some Important Method:
addObserver(Observer o):add Observers in the set of observers for this subject or observalbel object.

deleteObserver(Observer o): delete Observers in the set of observers .
hasChanged():check if object has changed.
clearChanged():this method will indicate that subject has no changes or all the observers has been notified when changes is made.
notifyObservers(): notify all the observers if object has changed .

Ref :
https://dzone.com/articles/observer-pattern-java

 */

import java.util.ArrayList;

public class ObserverPattern {

    public static void main(String[] args) {
        Newspaper printMedia = new Newspaper();
        Internet onlineMedia = new Internet();
        Loan personalLoan = new Loan("Personal Loan", 12.5f,
                "Standard Charterd");
        personalLoan.registerObserver(printMedia);
        personalLoan.registerObserver(onlineMedia);
        personalLoan.setInterest(3.5f);
    }

}
//STEP 1
//Public Interface Observer:
//Any class (Ex : NewsPaper or Internet ) who implements this interface
// must be notified when subject or
//observable object change its status.
interface Observer {
    public void update(float interest);
}

//Note that Observer passed as arg in registerObserver and removeObserver
interface Observable {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(); // just iterate all list
}


class Loan implements Observable {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String type;
    private float interest;
    private String bank;

    public Loan(String type, float interest, String bank) {
        this.type = type;
        this.interest = interest;
        this.bank = bank;
    }
    public float getInterest() {
        return interest;
    }
    public void setInterest(float interest) {
        this.interest = interest;
        notifyObservers();
    }
    public String getBank() {
        return this.bank;
    }
    public String getType() {
        return this.type;
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }
    @Override
    public void notifyObservers() {
        for (Observer ob : observers) {
            System.out
                    .println("Notifying Observers on change in Loan interest rate");
            ob.update(this.interest);
        }
    }
}

class Newspaper implements Observer {
    @Override
    public void update(float interest) {
        System.out.println("Newspaper: Interest Rate updated, new Rate is: "
                + interest);
    }
}

class Internet implements Observer {
    @Override
    public void update(float interest) {
        System.out.println("Internet: Interest Rate updated, new Rate is: "
                + interest);
    }
}
