package com.example.demo.registration;

import com.sun.xml.bind.v2.TODO;
import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class EmailValidator implements Predicate<String> {

    @Override
    public boolean test(String s) {

        //TODO: Regex to validate email
        return true;
    }

    @Override
    public Predicate<String> and(Predicate<? super String> other) {
        return null;
    }

    @Override
    public Predicate<String> negate() {
        return null;
    }

    @Override
    public Predicate<String> or(Predicate<? super String> other) {
        return null;
    }
}
