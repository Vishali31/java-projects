package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Operations {

	List<String> getPersonListSortedByNameInUpperCase(String[] personList) {

		if (personList == null)
			return null;

		Arrays.sort(personList);
		for (int i = 0; i < personList.length; i++) {
			personList[i] = personList[i].toUpperCase();
		}

		List<String> personLists = List.of(personList);

		return personLists;

	}

	public Set<String> getDistinctPersonNamesSortedInDescendingOrder(List<String> personList) {
		if (personList == null || personList.isEmpty())
			return Collections.emptySet();

		Set<String> distinctNames = personList.stream().distinct().sorted(Comparator.reverseOrder())
				.collect(Collectors.toCollection(LinkedHashSet::new)); 
		return distinctNames;
	}

	String searchPerson(String[] personList, String nameToSearch) {

		if (personList == null || nameToSearch == null)
			return null;

		for (String i : personList) {

			if (i.equalsIgnoreCase(nameToSearch)) {
				return "Person found";
			}
		}

		return "Not Person found";
	}

	List<String> getPersonListSortedByLengthWithNameLengthGreaterThanFive(String[] personList) {

		if (personList == null)
			return null;

		List<String> persons = List.of(personList);

		return persons.stream().filter(name -> name.length() > 5).sorted(Comparator.comparingInt(String::length))
				.collect(Collectors.toList());
	}

	String getPersonByMaxAge(Map<String, Integer> ageMap) {
		if (ageMap == null || ageMap.isEmpty())
			return "Give proper input not null";

		Map.Entry<String, Integer> maxAge = ageMap.entrySet().iterator().next();

		for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
			if (entry.getValue() > maxAge.getValue()) {
				maxAge = entry;
			}
		}

		return maxAge.getKey();
	}

}
