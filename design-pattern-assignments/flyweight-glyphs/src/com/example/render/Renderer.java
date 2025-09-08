package com.example.render;

public class Renderer {
    private final GlyphFactory glyphFactory = new GlyphFactory();

    public int render(String text) {
        int cost = 0;
        for (char c : text.toCharArray()) {
            // Use flyweight glyphs from the factory
            Glyph g = glyphFactory.getGlyph(c, "Inter", 14, (c % 7 == 0));
            cost += g.drawCost();
        }
        return cost;
    }
}
