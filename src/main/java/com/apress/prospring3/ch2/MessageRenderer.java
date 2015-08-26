package com.apress.prospring3.ch2;

public interface MessageRenderer {
    public void setMessageProvider(MessageProvider provider);
    public void render();
}
