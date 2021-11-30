import org.apache.log4j.Logger;
import org.telegram.telegrambots.ApiContextInitializer;

public class App {
    private static final Logger log = Logger.getLogger(App.class);

    public static void main(String[] args) {
        ApiContextInitializer.init();
        Bot test_bot = new Bot("New_test_task_bot", "2117060759:AAFTUihHa22MFGJtORI3ttxwmUbB7DQFYGs");
        test_bot.botConnect();


    }
}