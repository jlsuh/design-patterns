package main.java.adapter;

public class StockTradeApp {
    private StockTrade stockTrade;

    public XML buildStockOpXML(StockOp stockOp) {
        return new XML(stockOp);
    }

    public void publishStockOp(StockOp stockOp) {
        XML xml = this.buildStockOpXML(stockOp);
        this.stockTrade.emitStockOp(xml);
    }
}
