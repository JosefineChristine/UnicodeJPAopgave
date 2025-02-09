package com.example.unicodejpaopgave.config;

import com.example.unicodejpaopgave.model.Unicode;
import com.example.unicodejpaopgave.repository.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    UnicodeRepository unicodeRepository;


    //Det lykkedes mig ikke at løse den sidste opgave helt, men metoden herunder var det nærmeste jeg kunne komme.
    //i < 50 er fordi det tog lang tid at gemme i databasen.
    //Den udkommenterede metode nederst var en del af mine forsøg på at løse den.

    @Override
    public void run(String... args) throws Exception {
        Set<Character> unicodebogstaver = new HashSet<>();

        char c = 'a';

        for (int i = 0; i < 50; i++) {
            unicodebogstaver.add((char) i);

            Unicode u = new Unicode();
            u.setUnicode(i);
            u.setBogstav(c);

            unicodeRepository.save(u);

            c++;

        }

    }

//    @Override
//    public void run(String... args) throws Exception {
//        Set<Character> unicodebogstaver = new HashSet<>();
//        char c = 'a';
//        int i = 0;
//        while (unicodebogstaver.add((char) i)) {
//
//            Unicode u = new Unicode();
//            u.setUnicode(i);
//            u.setBogstav((char) i);
//
//            unicodeRepository.save(u);
//
//            c++;
//
//        }
//    }


}

