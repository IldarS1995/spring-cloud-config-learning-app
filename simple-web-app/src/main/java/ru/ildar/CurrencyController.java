package ru.ildar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ildar Saifeev
 * @since 2016-11-15
 */
@RestController
@RequestMapping(value = "/currency_rate",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @RequestMapping(value = "/dollars/{count}", method = RequestMethod.GET)
    public ResponseEntity<ExchangeRate> countExchangeRate(@PathVariable Double count) {
        return ResponseEntity.ok(currencyService.calculateExchangeRate("dollar", count));
    }
}
