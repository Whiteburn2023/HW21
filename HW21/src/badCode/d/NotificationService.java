package badCode.d;

class NotificationService {
    private Notifier notifier;

    NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    void sendNotification(String recipient, String message) {
            notifier.send(recipient, message);
    }
}
