package com.hms.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.hms.entities.Candidates;
import com.hms.entities.Domain;

public class MainTest {
	
	public static void main(String[] args) {
		
		String file = "D:\\CSVDemo.csv";
		Path pathToFile = Paths.get(file);
		List<Candidates> candList = new ArrayList<>();
		try(BufferedReader br = Files.newBufferedReader(pathToFile)) {
			
			String row = br.readLine();
			while(row!=null) {
				String [] attributes = row.split(",");
				Candidates cand = getOneCandidate(attributes);
				candList.add(cand);
				row=br.readLine();
			}
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Candidates getOneCandidate(String[] attr) {
		
		Candidates can = new Candidates();
		can.setName(attr[0]);
		int exp = Integer.parseInt(attr[1]);
		can.setExp(exp);
		can.setCandidate_skills(attr[2]);
		can.setEmail(attr[3]);
		can.setContact_no(attr[4]);
		can.setCompany_name(attr[5]);
		can.setCandidates_location(attr[6]);
		
		Domain d = new Domain();
		d.setDomain_id(Integer.parseInt(attr[7]));
		can.setDomain(d);
		System.out.println(can);
		return can;
	}
}
