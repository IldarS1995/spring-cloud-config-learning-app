package ru.ildar;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

/**
 * @author Ildar Saifeev
 * @since 2016-11-15
 */
@Value
@Builder
@AllArgsConstructor
public class ExchangeRate {

    String firstCurrency;
    String secondCurrency;
    Double exchangeRate;
    Double exchangeResult;
}
