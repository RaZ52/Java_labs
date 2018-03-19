package lab1;

/**
 * Created by Admin on 10/4/2017 at 12:09 PM
 **/
public interface IMessager {
    public void subscribe(IListener l);
    public void notify_message();
}
