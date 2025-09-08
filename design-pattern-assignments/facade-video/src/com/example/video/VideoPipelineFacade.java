package com.example.video;

import java.nio.file.Path;

public class VideoPipelineFacade {
    public static Path process(Path input, Path output, boolean grayscale, double scale, boolean sharpen, int sharpenStrength) {
        Decoder decoder = new Decoder();
        FilterEngine filterEngine = new FilterEngine();
        Encoder encoder = new Encoder();
        LegacySharpen legacySharpen = new LegacySharpen();

        // Decode
        Frame[] frames = decoder.decode(input);

        // Apply grayscale if needed
        if (grayscale) {
            frames = filterEngine.grayscale(frames);
        }

        // Apply scaling if needed
        if (scale > 0 && scale != 1.0) {
            frames = filterEngine.scale(frames, scale);
        }

        // Apply legacy sharpen if needed
        if (sharpen) {
            // Simulate conversion to handle and back
            String handle = framesToHandle(frames);
            handle = legacySharpen.applySharpen(handle, sharpenStrength);
            frames = handleToFrames(handle);
        }

        // Encode
        return encoder.encode(frames, output);
    }

    // Dummy conversion methods for legacy API
    private static String framesToHandle(Frame[] frames) {
        return "HANDLE:frames";
    }
    private static Frame[] handleToFrames(String handle) {
        // In real code, convert handle back to frames
        return new Frame[] { new Frame(1920, 1080), new Frame(1920, 1080) };
    }
}
