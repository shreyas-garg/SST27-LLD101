package com.example.imports;

import java.nio.file.Path;
import java.util.List;

/**
 * Adapter: adapts NaiveCsvReader and ProfileService to ProfileImporter interface.
 */
public class CsvProfileImporter implements ProfileImporter {
    private final NaiveCsvReader csvReader;
    private final ProfileService profileService;

    public CsvProfileImporter(NaiveCsvReader csvReader, ProfileService profileService) {
        this.csvReader = csvReader;
        this.profileService = profileService;
    }

    @Override
    public int importFrom(Path csvFile) {
        List<String[]> rows = csvReader.read(csvFile);
        int count = 0;
        for (String[] row : rows) {
            // Expecting: id,email,displayName
            if (row.length >= 3) {
                String id = row[0].trim();
                String email = row[1].trim();
                String displayName = row[2].trim();
                profileService.createProfile(id, email, displayName);
                count++;
            }
        }
        return count;
    }
}