package il.co.naya.messages.dto;

import lombok.ToString;


public enum Receiver {
    FACEBOOK, TWITTER, WHATSAPP;

    @Override
    public String toString() {
        return this.name();
    }
}
