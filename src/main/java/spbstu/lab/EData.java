package spbstu.lab;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EData implements Serializable {
    @JsonProperty("_index")
    private final String index;
    @JsonProperty("_source")
    private final HHData _source;

    public EData(@JsonProperty("_index") String index,
                 @JsonProperty("_source") HHData _source) {
        this.index = index;
        this._source = _source;
    }

    public String getIndex() {
        return index;
    }

    public HHData get_source() {
        return _source;
    }

    @Override
    public String toString() {
        return "EData{" +
            "index='" + index + '\'' +
            ", source=" + _source +
            '}';
    }
}
