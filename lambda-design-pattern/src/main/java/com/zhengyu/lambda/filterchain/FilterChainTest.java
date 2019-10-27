package com.zhengyu.lambda.filterchain;

import com.google.common.base.Preconditions;

import java.math.BigDecimal;
import java.util.function.Predicate;

/**
 * @author zhengyu.nie
 * 2019.10.27
 */
public class FilterChainTest {
    public static void main(String[] args) {
        Company company = new Company.Builder()
                .name("test").expenditure(BigDecimal.TEN).profit(BigDecimal.ZERO)
                .build();


        Preconditions.checkArgument(
                nameRuleCheckPredicate()
                        .and(financeCheckPredicate())
                        .and(financeWellCheckPredicate())
                        .test(company),
                "The company is not running well"
        );
    }

    private static Predicate<Company> nameRuleCheckPredicate() {
        return company -> company.getName() != null;
    }

    private static Predicate<Company> financeCheckPredicate() {
        return company -> company.getProfit().compareTo(BigDecimal.ZERO) > 0;
    }

    private static Predicate<Company> financeWellCheckPredicate() {
        return company -> company.getProfit().compareTo(company.getExpenditure()) > 0;
    }
}
