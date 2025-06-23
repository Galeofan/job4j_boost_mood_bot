package ru.job4j.bmb.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

public class User {
    private Long id;
    private long clientId;
    private long chatId;

    public User(Long id, long clientId, long chatId) {
        this.id = id;
        this.clientId = clientId;
        this.chatId = chatId;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public long getClientId() {
        return clientId;
    }

    public long getChatId() {
        return chatId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;

        return new EqualsBuilder().append(clientId, user.clientId).append(chatId, user.chatId).append(id, user.id).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(clientId).append(chatId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("clientId", clientId)
                .append("chatId", chatId)
                .toString();
    }
}

