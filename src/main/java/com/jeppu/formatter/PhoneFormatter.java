package com.jeppu.formatter;

import com.jeppu.model.Phone;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Locale;

public class PhoneFormatter implements Formatter<Phone> {
    @Override
    public Phone parse(String s, Locale locale) throws ParseException {
        //s =641-333-11111
        String[] phoneNos = s.split("-");
        System.out.println(Arrays.toString(phoneNos));
        System.out.println("Length - "+phoneNos.length);
        Phone phone = new Phone();
        phone.setAreaCode(phoneNos[0]);
        phone.setPrefix(phoneNos[1]);
        phone.setNumber(phoneNos[2]);
        System.out.println("PhoneFormatter.parse() = Phone : "+phone);
        return phone;
    }

    @Override
    public String print(Phone phone, Locale locale) {
        return null;
    }
}
