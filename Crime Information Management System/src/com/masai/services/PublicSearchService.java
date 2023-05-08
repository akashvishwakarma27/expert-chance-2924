package com.masai.services;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import bean.Crime;
import bean.Criminal;

public abstract class PublicSearchService {
    abstract Map<String, Integer> getTotalCrimeByPoliceStationArea(Date startDate, Date endDate);
    abstract Map<String, Integer> getTotalCrimeByType(Date startDate, Date endDate);
    abstract List<Criminal> searchCriminalsByName(String name);
    abstract List<Crime> searchCrimeByDescription(String description);
}
