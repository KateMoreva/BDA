package spbstu.lab;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataResponce {
    public final HHDataResords hits;
    public final Integer took;

    public DataResponce(@JsonProperty("hits") HHDataResords hits,
                        @JsonProperty("took") Integer took) {
        this.hits = hits;
        this.took = took;
    }

    @Override
    public String toString() {
        return "DataResponce{" +
            "hits=" + hits +
            ", took=" + took +
            '}';
    }
}
