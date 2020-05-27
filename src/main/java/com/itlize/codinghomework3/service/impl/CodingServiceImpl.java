package com.itlize.codinghomework3.service.impl;

import com.itlize.codinghomework3.service.CodingService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Service
public class CodingServiceImpl implements CodingService {

    @Override
    public ResponseEntity<?> codingTestOne(String path) throws IOException {
        File filename = new File(path);
        InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
        BufferedReader br = new BufferedReader(reader);
        String line = br.readLine();

        while (line != null) {
            String[] numbers = line.split(",");
            if (((Integer.parseInt(numbers[0]) >>> Integer.parseInt(numbers[1])-1) & 1) == ((Integer.parseInt(numbers[0]) >>> Integer.parseInt(numbers[2])-1) & 1)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            line = br.readLine();
        }
        return null;
    }

    @Override
    public ResponseEntity<?> codingTestTwo(String path) throws IOException {
        File filename = new File(path);
        InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
        BufferedReader br = new BufferedReader(reader);
        String line = br.readLine();

        while (line != null) {
            String[] game = line.split("\\|");
            Integer number = Integer.parseInt(game[1].replace(" ",""));
            String[] names = game[0].split(" ");
            List<String> namelist = new ArrayList<>();
            for (int i=0; i<names.length; i++) {
                namelist.add(names[i]);
            }

            while (namelist.size() != 1) {
                int index = (number%namelist.size())-1;
                if (index == -1) {
                    namelist.remove(namelist.size()-1);
                } else {
                    namelist.remove(index);
                }

            }
            System.out.println(namelist.get(0));
            line = br.readLine();
        }
        return null;
    }

    @Override
    public ResponseEntity<?> codingTestThree(String path) throws IOException {
        File filename = new File(path);
        InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
        BufferedReader br = new BufferedReader(reader);
        String line = br.readLine();

        while (line != null) {
            String[] cords = line.split("\\) \\(");
            cords[0] = cords[0].replace(" ","").replace("(","");
            cords[1] = cords[1].replace(" ","").replace(")","");
            String[] number1 = cords[0].split(",");
            String[] number2 = cords[1].split(",");
            int dissequare = (Integer.parseInt(number1[0])-Integer.parseInt(number2[0]))
                    *(Integer.parseInt(number1[0])-Integer.parseInt(number2[0]))
                    +(Integer.parseInt(number1[1])-Integer.parseInt(number2[1]))
                    *(Integer.parseInt(number1[1])-Integer.parseInt(number2[1]));
            int distance = (int) Math.sqrt(dissequare);
            System.out.println(distance);
            line = br.readLine();
        }
        return null;
    }
}