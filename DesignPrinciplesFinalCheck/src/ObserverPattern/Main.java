package ObserverPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observer sai=new Admin("Sai");
		Observer rach=new Admin("Rachana");
		Observer apoorva=new Admin("Apoorva");
		
		INotificationService notificationService=new NotificationService();
		notificationService.addSubscriber(sai);
		notificationService.addSubscriber(rach);
		notificationService.addSubscriber(apoorva);
		notificationService.notifySubscriber();
		notificationService.removeSubscriber(apoorva);
		
		

	}
}
