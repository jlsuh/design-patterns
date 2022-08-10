package main.java.adapter;

public class StockTradeAdapter implements StockTrade {
    private StockTradeMarket stockTradeMarket;

    private JSON XMLToJSON(XML xml) {
        return new JSON();
    }

    @Override
    public void emitStockOp(XML xml) {
        JSON json = this.XMLToJSON(xml);
        this.stockTradeMarket.publishStockOp(json);
    }
}
