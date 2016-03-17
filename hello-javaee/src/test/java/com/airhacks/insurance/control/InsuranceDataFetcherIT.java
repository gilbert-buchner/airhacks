package com.airhacks.insurance.control;

import com.airhacks.insurance.entity.InsuranceData;
import com.airhacks.rulz.em.EntityManagerProvider;
import java.util.List;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/**
 *
 * @author airhacks.com
 */
public class InsuranceDataFetcherIT {

    InsuranceDataFetcher cut;
    @Rule
    public EntityManagerProvider provider = EntityManagerProvider.persistenceUnit("it");

    @Before
    public void init() {
        this.cut = new InsuranceDataFetcher();
        this.cut.em = provider.em();
        provider.tx().begin();
        this.cut.em.merge(new InsuranceData(System.currentTimeMillis()));
        provider.tx().commit();
    }

    @Test
    public void findAll() {

        List<InsuranceData> amount = this.cut.amount();
        assertFalse(amount.isEmpty());
    }

}
