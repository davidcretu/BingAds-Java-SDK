package com.microsoft.bingads.v13.bulk.entities;

import java.util.Collections;

import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.campaignmanagement.ProfileCriterion;
import com.microsoft.bingads.v13.campaignmanagement.ProfileType;

/**
 * Represents a industry criterion that is assigned to an ad group. Each industry criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group Industry Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupIndustryCriterion extends BulkAdGroupProfileCriterion {

    @Override
    public void setProfileType(ProfileCriterion criterion) {
        criterion.setProfileType(Collections.singleton(ProfileType.INDUSTRY));
    }
    
}
