package chordtones;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVPrinter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class CSVReader {
    private static final String SAMPLE_CSV_FILE_PATH = "/src/main/resources/users.csv";
    private static Chords chords;

    public static void readCSV() throws IOException {
        try (
            Reader reader = Files.newBufferedReader(Paths.get(new File("").getAbsolutePath() + SAMPLE_CSV_FILE_PATH));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase()
                .withTrim());

        ) {
            Iterable<CSVRecord> csvRecords = csvParser.getRecords();
            chords = new Chords();
            for (CSVRecord csvRecord : csvRecords) {
                // Accessing values by Header names


                String name = csvRecord.get("Name");
                String root = csvRecord.get("Root");
                String third = csvRecord.get("Third");
                String fifth = csvRecord.get("Fifth");
                String seventh = csvRecord.get("Seventh");

                Chord c = new Chord(name, root, third, fifth, seventh);

                chords.addChord(c);

            }
        }
    }

    public Chords getChords() {
            return chords;
    }


    public void writeContentToCSV(Chords chords, Chord chordToAdd) throws IOException {
    try (
        BufferedWriter writer = Files.newBufferedWriter(Paths.get(new File("").getAbsolutePath() + SAMPLE_CSV_FILE_PATH));

        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                .withHeader("Name", "Root", "Third", "Fifth", "Seventh"))) {
            
            for (Chord c : chords.getChords()) {
                csvPrinter.printRecord(c.getName(), c.getRoot(), c.getThird(),
                    c.getFifth(), c.getSeventh());
            } 
         csvPrinter.flush();            
        }
    }
}
