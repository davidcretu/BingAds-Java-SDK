package com.microsoft.bingads.v13.api.test.entities.adgroup.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v13.campaignmanagement.CoOpSetting;

@RunWith(Parameterized.class)
public class BulkAdGroupWriteToRowValuesCoOpMaximumBidTests extends BulkAdGroupTest {

    @Parameter(value = 1)
    public double propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"123.4", 123.4},
        });
    }

    @Test
    public void testWrite() {
        this.<Double>testWriteProperty("Maximum Bid", this.datum, this.propertyValue, new BiConsumer<BulkAdGroup, Double>() {
            @Override
            public void accept(BulkAdGroup c, Double v) {
                CoOpSetting setting = new CoOpSetting();
                setting.setType(CoOpSetting.class.getSimpleName());
                setting.setBidMaxValue(v);
                c.addAdGroupSetting(setting);
            }
        });
    }
}
