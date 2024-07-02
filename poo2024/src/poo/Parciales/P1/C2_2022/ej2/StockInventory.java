package poo.Parciales.P1.C2_2022.ej2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class StockInventory implements Iterable<StockResult>{
    private static final int INITIAL_DIM=5;
    private int dim;
    private StockProduct[] stockProducts;
    private Predicate<Integer> minimumStock;

    public StockInventory(){
        this.stockProducts = new StockProduct[INITIAL_DIM];
        setMinimumStock(new Predicate<Integer>() {
            @Override
            public boolean test(Integer stock) {
                return stock <= 1;
            }
        });
    }

    public void add(String name, int stock){
        if(dim == stockProducts.length){
            resize();
        }
        stockProducts[dim] = new StockProduct(name, stock);
        dim++;
    }
    private void resize(){
        stockProducts = Arrays.copyOf(stockProducts, dim + INITIAL_DIM);
    }
    public void reduceStock(String name){
        for(int i = 0; i < dim; i++) {
            if(stockProducts[i].getProduct().equals(name)) {
                stockProducts[i].reduceStock();
                return;
            }
        }
        throw new IllegalArgumentException("No product found with name " + name);
    }
    public void setMinimumStock(Predicate<Integer> minimumStock){
        this.minimumStock = minimumStock;
    }
    public Iterator<StockResult> iterator(){
        return new IteratorInventory();
    }
    private class IteratorInventory implements Iterator<StockResult>{
        private int current;
        private final Predicate<Integer> currentStockAlert = minimumStock;
        @Override
        public boolean hasNext() {
            return current < dim;
        }
        @Override
        public StockResult next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            StockProduct currentStockProduct = stockProducts[current++];
            boolean lowStock = currentStockAlert.test(currentStockProduct.getStock());
            return new StockResult(currentStockProduct, lowStock);
        }
    }
}
