package com.pgi.memento;

import com.pgi.EditorState;

public class Editor {
    private String content;
    private String fontName;
    private double fontSize;

    public void setContent(String content) {
        if (content != null && !content.isEmpty()) {
            this.content = content;
        } else {
            System.out.println("Content can not be empty");
        }
    }

    public void setFontName(String fontName) {
        if (fontName != null && !fontName.isEmpty()) {
            this.fontName = fontName;
        } else {
            System.out.println("fontName can not be empty");
        }
    }

    public void setFontSize(double fontSize) {
        if (fontSize > 0) {
            this.fontSize = fontSize;
        } else {
            System.out.println("FontSize must be superior to 0");
        }
    }

    public String getContent() {
        return content != null && !content.isEmpty() ? content : "";
    }

    public String getFontName() {
        return fontName != null && !fontName.isEmpty() ? fontName : "";
    }

    public double getFontSize() {
        return fontSize > 0 ? fontSize : 0;
    }

    public EditorState createState() {
        return new EditorState(this.content, this.fontSize, this.fontName);
    }

    public void restaure(EditorState state) {
        this.content = state.getContent();
        this.fontSize = state.getFontSize();
        this.fontName = state.getFontName();
    }
}
