package src.InterfaceDemo;

interface Message
{
    public static void staticMethod()
    {
        System.out.println("static method");
    }

    public default void init()
    {
        System.out.println("Default init method");
    }

    void printMessage(String message);
}

class ConsoleMessage implements Message
{
    public void init()
    {
        System.out.println("Overridden init method");
    }
    public void printMessage(String message)
    {
        System.out.println(message);
    }
}

class LoggerMessage implements Message
{
    public void printMessage(String message)
    {
        System.out.println(message);
    }
}

class InterfaceDemoWIthJava8Members
{
    public static void main(String args[])
    {
        Message consoleMessage = new ConsoleMessage();
        consoleMessage.printMessage("Console Message");
        consoleMessage.init();

        Message loggerMessage = new LoggerMessage();
        loggerMessage.printMessage("Logger Message");
        loggerMessage.init();

        Message.staticMethod();
    }
}