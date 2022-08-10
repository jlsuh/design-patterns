package main.java.adapter;

import java.util.ArrayList;
import java.util.List;

public class StockTradeMarket {
    private List<JSON> publishedStockOps;

    public StockTradeMarket() {
        this.publishedStockOps = new ArrayList<>();
    }

    public void publishStockOp(JSON json) {
        this.publishedStockOps.add(json);
    }
}
