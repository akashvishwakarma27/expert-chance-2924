package com.masai.services;

import java.sql.Date;

import exception.InvalidDataException;

public interface AdminService {
    void addCrimeDetails(String type, String description, String ps_area, Date date, String victimName) throws InvalidDataException;
    void updateCrimeDetails(int crimeId, String type, String description, String psArea, Date date, String victimName) throws InvalidDataException;
    void addCriminalDetails(String name, Date dob, String gender, String identifyingMark, Date firstArrestDate, String arrestedFromPsArea) throws InvalidDataException;
    void updateCriminalDetails(int criminalId, String name, Date dob, String gender, String identifyingMark, Date firstArrestDate, String arrestedFromPsArea) throws InvalidDataException;
    void assignCriminalToCrime(int criminalId, int crimeId) throws InvalidDataException;
    void removeCriminalFromCrime(int criminalId, int crimeId) throws InvalidDataException;
    void deleteCrime(int crimeId) throws InvalidDataException;
    void deleteCriminal(int criminalId) throws InvalidDataException;
}
