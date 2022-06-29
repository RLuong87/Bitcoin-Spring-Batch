package bitcoin.spingbatch;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Bitcoin {
    private String unix_timestamp;
    private String datetime;
    private String open;
    private String high;
    private String low;
    private String close;
    private String volume_btc;
    private String volume_currency;
    private String weighted_price;

    public String getUnix_timestamp() {
        return unix_timestamp;
    }

    public void setUnix_timestamp(String unix_timestamp) {
        this.unix_timestamp = unix_timestamp;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getVolume_btc() {
        return volume_btc;
    }

    public void setVolume_btc(String volume_btc) {
        this.volume_btc = volume_btc;
    }

    public String getVolume_currency() {
        return volume_currency;
    }

    public void setVolume_currency(String volume_currency) {
        this.volume_currency = volume_currency;
    }

    public String getWeighted_price() {
        return weighted_price;
    }

    public void setWeighted_price(String weighted_price) {
        this.weighted_price = weighted_price;
    }
}
