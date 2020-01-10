package com.mahmoud.dahdouh.sidebarmotionlayout;

class TextItem {

    private String text;
    private int img;

    public TextItem(String text, int img) {
        this.text = text;
        this.img = img;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
