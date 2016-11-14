package ru.ildar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Ildar Saifeev
 * @since 2016-11-15
 */
@Service
public class CurrencyService {

    @Value("${currency.name}")
    private String currencyName;

    @Value("${currency.rate}")
    private Double rate;

    public ExchangeRate calculateExchangeRate(String mainCurrency, Double count) {
        return ExchangeRate.builder()
                .firstCurrency(mainCurrency)
                .secondCurrency(currencyName)
                .exchangeRate(rate)
                .exchangeResult(count * rate)
                .build();
    }
}
