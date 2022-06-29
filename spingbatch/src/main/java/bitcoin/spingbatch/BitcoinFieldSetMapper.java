package bitcoin.spingbatch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class BitcoinFieldSetMapper implements FieldSetMapper<Bitcoin> {
    @Override
    public Bitcoin mapFieldSet(FieldSet fieldSet) throws BindException {
        return new Bitcoin(
                fieldSet.readString("unix_timestamp"),
                fieldSet.readString("datetime"),
                fieldSet.readString("open"),
                fieldSet.readString("high"),
                fieldSet.readString("low"),
                fieldSet.readString("close"),
                fieldSet.readString("volume_btc"),
                fieldSet.readString("volume_currency"),
                fieldSet.readString("weighted_price"));
    }
}
