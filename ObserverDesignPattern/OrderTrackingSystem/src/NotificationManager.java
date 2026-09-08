import java.util.HashMap;
import java.util.HashSet;

public class NotificationManager {
    private HashMap<NotificationType, HashSet<Notification>> hs;
    public NotificationManager(){
        hs=new HashMap<>();
    }

    public void notify(NotificationType event,Order order){
        if(hs.get(event)==null)
            return;

        for(Notification notification:hs.get(event)){
            notification.update(order);
        }
    }

    public void subscribe(NotificationType event, Notification notification){
        HashSet<Notification> notifications=hs.getOrDefault(event, new HashSet<>());
        notifications.add(notification);
        hs.put(event,notifications);
    }

    public void unSubscribe(NotificationType event, Notification notification){
        HashSet<Notification> notifications=hs.get(event);
        if(notifications.size()==0)
            return;

        notifications.remove(notification);
    }

}
