package com.airhacks.insurance.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 *
 * @author airhacks.com
 */
@Entity
@NamedQuery(name = InsuranceData.findAll, query = "SELECT i FROM InsuranceData i")
public class InsuranceData {

    private static final String PREFIX = "com.airhacks.insurance.entity.InsuranceData.";
    public static final String findAll = PREFIX + "findAll";
    @Id
    @GeneratedValue
    private long id;

    private long amount;

    public InsuranceData(long amount) {
        this.amount = amount;
    }

    public InsuranceData() {
    }

    public long getAmount() {
        return amount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 41 * hash + (int) (this.amount ^ (this.amount >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InsuranceData other = (InsuranceData) obj;
        if (this.amount != other.amount) {
            return false;
        }
        return true;
    }

}
