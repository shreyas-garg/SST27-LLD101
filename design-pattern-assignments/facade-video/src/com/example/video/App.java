package com.example.video;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        // Use the Facade to process the video
        Path out = VideoPipelineFacade.process(
            Path.of("in.mp4"),
            Path.of("out.mp4"),
            true,   // grayscale
            0.5,    // scale
            false,  // sharpen
            0       // sharpenStrength
        );
        System.out.println("Wrote " + out);
    }
}
