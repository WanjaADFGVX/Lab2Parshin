package ru.mirea.lab2;

public class Blogger extends Author {
    private String channel;

    public Blogger(String name, String email, char gender, String channel) {
        super(name, email, gender);
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Blogger{" +
                "channel='" + channel + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
