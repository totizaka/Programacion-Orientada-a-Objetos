//package poo.Parciales.P1.C1_2021.ej1;
//
//public class Ej1 {
//
//    public class Item implements Comparable<Item>{
//
//        private final String name;
//        private final double price;
//
//        public Item(String name, double price) {
//            this.name = name;
//            this.price = price;
//        }
//        public int getPrice(){
//            return price;
//        }
//        public String getName(){
//            return name;;
//        }
//        @Override
//                public int toCompare(Item o){
//            int cmp = Integer.compare(getPrice(), (o.getPrice());
//            if(cmp==0){
//                cmp = getName().compareTo(o.getName());
//            }
//            return cmp;
//        }
//
//    }
//
//    public class Inventory{
//
//        private Item[] items;
//
//        public Inventory(Item[] items){
//            this.items = items;
//        }
//
//        public Item[] getItems(Comparator<Item> cmp){
//            Item[] toReturn = Arrays.copyOf(items, itmes.lenght);
//            Arrays.sort(toReturn, cmp);
//            return toReturn;
//        }
//
//        public Item[] getItems(){
//            return getItems(Comparator.naturalOrder());
//        }
//    }
//
//            @Override
//            public int compare(Item o1, Item o2){
//                int cmp = Integer.compare(o1.getPrice(), o2.getPrice());
//                if(cmp==0){
//                    cmp = o1.getName.compareTo(o2.getName());
//                }
//                return cmp;
//                }
//
//}
