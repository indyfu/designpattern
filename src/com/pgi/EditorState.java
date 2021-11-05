package com.pgi.memento;

public class EditorState {
    private final String content;
    private final double fontSize;
    private final String fontName;

    public EditorState(String content, double fontSize, String fontName) {
        this.content = content;
        this.fontSize = fontSize;
        this.fontName = fontName;
    }

    public String getContent() {
        return content;
    }
    public String getFontName() {
        return fontName;
    }
    public double getFontSize() {
        return fontSize;
    }
}
