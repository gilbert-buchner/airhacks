package com.airhacks.insurance.entity;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author airhacks.com
 */
public class InsuranceDataIT {

    private EntityManager em;
    private EntityTransaction tx;

    @Before
    public void init() {
        this.em = Persistence.createEntityManagerFactory("it").
                createEntityManager();
        this.tx = this.em.getTransaction();
    }

    @Test
    public void crud() {
        InsuranceData insuranceData = new InsuranceData(42);
        this.tx.begin();
        this.em.merge(insuranceData);
        this.tx.commit();
        List<InsuranceData> results = this.em.createNamedQuery(InsuranceData.findAll, InsuranceData.class).
                getResultList();
        assertThat(results, hasItem(insuranceData));
    }

}
