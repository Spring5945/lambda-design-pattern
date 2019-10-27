package com.zhengyu.lambda.filterchain;

import java.math.BigDecimal;

/**
 * @author zhengyu.nie
 * 2019.10.27
 */
public class Company {
    private String name;
    private BigDecimal profit;
    private BigDecimal expenditure;

    private Company(Builder builder) {
        name = builder.name;
        profit = builder.profit;
        expenditure = builder.expenditure;
    }


    public static final class Builder {
        private String name;
        private BigDecimal profit;
        private BigDecimal expenditure;

        public Builder() {
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder profit(BigDecimal val) {
            profit = val;
            return this;
        }

        public Builder expenditure(BigDecimal val) {
            expenditure = val;
            return this;
        }

        public Company build() {
            return new Company(this);
        }
    }

    public String getName() {
        return name;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public BigDecimal getExpenditure() {
        return expenditure;
    }
}
