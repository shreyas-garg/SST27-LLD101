package com.example.report;
import java.nio.file.Path;
import java.util.Map;

public class ReportBundleFacade {
    /**
     * Exports the report as a zipped JSON file and logs the action.
     * @param data The data to write as JSON.
     * @param outDir The output directory for the JSON file.
     * @param fileName The base name for the JSON file (without extension).
     * @param zipPath The path for the output zip file.
     * @return The path to the created zip file.
     */
    public static Path export(Map<String,Object> data, Path outDir, String fileName, Path zipPath) {
        JsonWriter jw = new JsonWriter();
        Zipper z = new Zipper();
        AuditLog log = new AuditLog();
        Path json = jw.write(data, outDir, fileName);
        Path zip = z.zip(json, zipPath);
        log.log("exported " + zip);
        return zip;
    }
}