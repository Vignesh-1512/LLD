package ObserverPattern.Observer;

import ObserverPattern.Observable.StockStausAmazonObservable;

public class EmailAlretObserverImpl implements NotificationAlertObserver {

    String emailId;
    StockStausAmazonObservable observable;

    public EmailAlretObserverImpl(String emailId,StockStausAmazonObservable observable){
        this.emailId=emailId;
        this.observable=observable;
    }
    @Override
    public void update() {
        sendMail(emailId,"Product is in Stock now, so hurry up!");
    }

    public void sendMail(String emailId,String msg){
        System.out.println("Email sent to :"+emailId+"with the message :"+msg);
    }
}
