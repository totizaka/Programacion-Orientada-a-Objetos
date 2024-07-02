package poo.Parciales.P1.C2_2022.ej2;

import java.util.function.Predicate;

public class StockResult{
    private final StockProduct stockProduct;
    private final boolean lowStock;
    public StockResult(StockProduct stockProduct, boolean lowStock){
        this.stockProduct = stockProduct;
        this.lowStock = lowStock;
    }
    @Override
    public String toString() {
        return String.format("%s <> %s", stockProduct, lowStock ? "Low Stock!" : "Stock OK");
    }
}
