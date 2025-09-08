package com.example.render;

import java.util.HashMap;
import java.util.Map;

public class GlyphFactory {
    private final Map<String, Glyph> glyphCache = new HashMap<>();

    public Glyph getGlyph(char ch, String font, int size, boolean bold) {
        String key = ch + ":" + font + ":" + size + ":" + bold;
        return glyphCache.computeIfAbsent(key, k -> new Glyph(ch, font, size, bold));
    }
}
