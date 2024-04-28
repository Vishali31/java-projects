package com.main;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Optional {
	//getPersonListSortedByNameInUpperCase(List<String>) {
		
	}

//    public Set<String> getDistinctPersonNamesSortedInDescendingOrder(List<String> personList) {
//        if (personList == null || personList.isEmpty())
//            return Collections.emptySet();
//
//        Set<String> distinctNames = personList.stream()
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toCollection(LinkedHashSet::new)); // Preserve insertion order
//        return distinctNames;
//    }
//
//    public String searchPerson(List<String> personList, String nameToSearch) {
//        if (personList == null || personList.isEmpty() || nameToSearch == null || nameToSearch.isEmpty())
//            return "List or name to search cannot be null";
//
//        if (personList.stream().anyMatch(name -> name.equalsIgnoreCase(nameToSearch)))
//            return "Person found";
//        else
//            return "Person not found";
//    }
//
//    public List<String> getPersonListSortedByLengthWithNameLengthGreaterThanFive(List<String> personList) {
//        if (personList == null || personList.isEmpty())
//            return Collections.emptyList();
//
//        return personList.stream()
//                .filter(name -> name.length() > 5)
//                .sorted(Comparator.comparingInt(String::length))
//                .collect(Collectors.toList());
//    }
//
//    public String getPersonByMaxAge(Map<String, Integer> ageMap) {
//        if (ageMap == null || ageMap.isEmpty())
//            return "Give proper input not null";
//
//        Optional<Map.Entry<String, Integer>> maxEntry = ageMap.entrySet()
//                .stream()
//                .max(Map.Entry.comparingByValue());
//        return maxEntry.map(Map.Entry::getKey).orElse("");
//    }


