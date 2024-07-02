//package poo.Parciales.P1.C1_2021.ej1;
//
//public class Ej2 {
//
//    public class TVShow {
//
//        private final String name;
//        private final double rating;
//
//        public TVShow(String name, double rating) {
//            this.name = name;
//            if(!validateRating(rating)) {
//                throw new IllegalArgumentException();
//            }
//            this.rating = rating;
//        }
//
//        public static boolean validateRating(double rating) {
//            return rating >= 0 && rating <= 10;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public double getRating() {
//            return rating;
//        }
//
//        @Override
//        public String toString() {
//            return String.format("### %20s : %.2f ###", name, rating);
//        }
//    }
//
//    public interface TVCatalog {
//
//        TVCatalog addTVShow(String name, double rating);
//
//        void setRatingRange(double min, double max);
//
//    }
//
//    public class ArrayTVCatalog implements TVCatalog, Iterable<TVResponse>{
//
//        private static final int INITIAL_DIM=5;
//        private int dim;
//        private TVShow[] tvShows;
//        private double minimumRatingRange;
//        private double maximumRatingRange;
//
//        public ArrayTVCatalog(){
//            tvShows = new TVShow[INITIAL_DIM];
//            setRatingRange(0, 10);
//        }
//
//        @Override
//        public TVCatalog addTVShow(String name, double rating){
//            if(dim == tvShows.lenght){
//                resize();
//            }
//            tvShows[dim++] = new TVShow(name, rating);
//        }
//
//        @Override
//        public void setRatingRange(double min, double max){
//            this.minimumRatingRange=min;
//            this.maximumRatingRange=max;
//        }
//
//        private void resize(){
//            tvShows = Arrays.copyOf(tvShows, dim + INITIAL_DIM);
//        }
//
//        @Override
//        public Iterator<TVResponse> iterator(){
//            return new TVCatalogIterator;
//        }
//
//        private class TVCatalogIterator implements Itertator<TVResponse>{
//            private int current;
//
//            @Override
//            public boolean hasNext(){
//                return current<dim;
//            }
//            @Override
//            public TVResponse next(){
//                if(!hasNext()){
//                    throw new NoSuchElementEsception();
//                }
//                boolean inRange=true;
//                if (tvShows[current++].getRating > maximum || tvShows[current++] < minimum) {
//                    inRange = false;
//                }
//                TVResponse toReturn = new TVResponse(tvShows[current++], inRange);
//                return toReturn;
//            }
//        }
//    }
//    public class TVResponse{
//
//        private TVShow tvShow;
//        private boolean inRange;
//
//        public TVResponse(TVShow tvShow, boolean inRange){
//            this.tvShow=tvShow;
//            this.inRange=inRange;
//        }
//        @Override
//        public String toString(){
//            return "### %s : %d ### %s".formatted(tvShow.getName, tvShow.getRating, inRange ? "In Range" : "Out of Range")
//        }
//    }
//}
