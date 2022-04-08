// your solution here
//fix all the errors including package errors


public class Main {

    public static void main(String[] args) {
        Buttons firstBut = new Buttons();
        Stocks stocks = new Stocks();
        firstBut.setCommand(new BuyCommand(stocks));
        firstBut.executeButtons();
        firstBut.setCommand(new SellCommand(stocks));
        firstBut.executeButtons();
    }
}

interface Command{
    void doCommand();
}

class Stocks{

    public void buy(){
        System.out.println("you successfully bought the stocks.");
    }

    public void sell(){
        System.out.println("you successfully sold the stocks.");
    }

}

class BuyCommand implements Command{

    Stocks stocks;

    public BuyCommand(Stocks bt){
        this.stocks=bt;
    }

    @Override
    public void doCommand() {
        stocks.buy();
    }

}

class SellCommand implements Command{

    Stocks stocks;

    public SellCommand(Stocks bt){
        this.stocks=bt;
    }

    @Override
    public void doCommand() {
        stocks.sell();
    }
}

class Buttons{
    Command command;

    public void setCommand(Command yourCommand){
        command=yourCommand;
    }

    public void executeButtons(){
        command.doCommand();
    }
}
