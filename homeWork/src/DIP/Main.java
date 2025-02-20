package DIP;

public class Main {
    public static void main(String[] args) {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        App appWithConsoleLogger = new App(consoleLogger);
        appWithConsoleLogger.start();
    }
}

