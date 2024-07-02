package poo.Parciales.P1.C2_2022.ej1;
import java.util.Arrays;
import java.util.Comparator;
public class TVSeason {
    private final TVEpisode[] tvEpisodes;

    public TVSeason(TVEpisode[] tvEpisodes) {
        this.tvEpisodes = tvEpisodes;
    }

    public TVEpisode[] getCustomOrderCopy(Comparator<TVEpisode> comparator) {
        TVEpisode[] aux = Arrays.copyOf(tvEpisodes, tvEpisodes.length);
        Arrays.sort(aux, comparator);
        return aux;
    }

    public TVEpisode[] getDateOrderCopy() {
        return getCustomOrderCopy(new Comparator<TVEpisode>() {
            @Override
            public int compare(TVEpisode o1, TVEpisode o2) {
                int cmp = o2.getAiredDate().compareTo(o1.getAiredDate());
                if (cmp == 0) {
                    cmp = o1.compareTo(o2);
                }
                return cmp;
            }
        });
    }

    public TVEpisode[] getNameOrderCopy() {
        return getCustomOrderCopy(new Comparator<TVEpisode>() {
            @Override
            public int compare(TVEpisode o1, TVEpisode o2) {
                int cmp = o1.getTitle().compareTo(o2.getTitle());
                if (cmp == 0) {
                    cmp = o1.compareTo(o2);
                }
                return cmp;
            }
        });
    }

    public TVEpisode[] getRatingOrderCopy() {
        return getCustomOrderCopy(new Comparator<TVEpisode>() {
            @Override
            public int compare(TVEpisode o1, TVEpisode o2) {
                int cmp = Double.compare(o2.getRating(), o1.getRating());
                if (cmp == 0) {
                    cmp = o1.compareTo(o2);
                }
                return cmp;
            }
        });
    }
}

