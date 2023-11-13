package spbstu.lab;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HHDataResords {
    private final BigDecimal max_score;
    private final List<EData> hits;

    public HHDataResords(@JsonProperty("max_score") BigDecimal maxScore,
                         @JsonProperty("hits") List<EData> hits) {
        this.hits = hits;
        this.max_score = maxScore;
    }

    public BigDecimal getMax_score() {
        return max_score;
    }

    public List<EData> getHits() {
        return hits;
    }

    @Override
    public String toString() {
        return "HHDataResords{" +
            "hits=" + hits +
            ", maxScore=" + max_score +
            '}';
    }
}
