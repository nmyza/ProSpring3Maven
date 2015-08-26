package com.apress.prospring3.ch2;

public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider provider = null;

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public void render() {
        if (provider == null) {
            throw new RuntimeException("You must ser MessageProvider property.");
        }
        System.out.println(provider.getMessage());
    }
}
