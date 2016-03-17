package com.airhacks.insurance.control;

import com.airhacks.insurance.entity.InsuranceData;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author airhacks.com
 */
public class InsuranceDataFetcher {

    @PersistenceContext
    EntityManager em;

    public List<InsuranceData> amount() {
        return this.em.createNamedQuery(InsuranceData.findAll, InsuranceData.class).
                getResultList();

    }

}
