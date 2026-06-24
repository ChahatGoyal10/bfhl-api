package com.chahat.bfhl.api.service;

import com.chahat.bfhl.api.dto.RequestDTO;
import com.chahat.bfhl.api.dto.ResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BfhlServiceImpl implements BfhlService {

    @Override
    public ResponseDTO process(RequestDTO request) {

        ResponseDTO response = new ResponseDTO();

        List<String> oddNumbers = new ArrayList<>();
        List<String> evenNumbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> specialCharacters = new ArrayList<>();

        long sum = 0;
        StringBuilder allLetters = new StringBuilder();

        for (String item : request.getData()) {

            if (item.matches("\\d+")) {

                int num = Integer.parseInt(item);
                sum += num;

                if (num % 2 == 0) {
                    evenNumbers.add(item);
                } else {
                    oddNumbers.add(item);
                }

            } else if (item.matches("[a-zA-Z]+")) {

                alphabets.add(item.toUpperCase());
                allLetters.append(item);

            } else {

                specialCharacters.add(item);
            }
        }

        String reversed = allLetters.reverse().toString().toLowerCase();

        StringBuilder concatString = new StringBuilder();

        for (int i = 0; i < reversed.length(); i++) {
            if (i % 2 == 0) {
                concatString.append(Character.toUpperCase(reversed.charAt(i)));
            } else {
                concatString.append(reversed.charAt(i));
            }
        }

        response.setIs_success(true);
        response.setUser_id("chahat_goyal_10122005");
        response.setEmail("chahat0146.be23@chitkara.edu.in");
        response.setRoll_number("2310990146");

        response.setOdd_numbers(oddNumbers);
        response.setEven_numbers(evenNumbers);
        response.setAlphabets(alphabets);
        response.setSpecial_characters(specialCharacters);

        response.setSum(String.valueOf(sum));
        response.setConcat_string(concatString.toString());

        return response;
    }
}