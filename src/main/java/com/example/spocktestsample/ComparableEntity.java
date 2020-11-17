package com.example.spocktestsample;

import java.time.LocalDateTime;
import java.util.Objects;

public class ComparableEntity implements Comparable<ComparableEntity> {
    private String message;
    private LocalDateTime localDateTime;

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public ComparableEntity(String message, LocalDateTime localDateTime) {
        this.message = message;
        this.localDateTime = localDateTime;
    }

    @Override
    public int compareTo(ComparableEntity o) {
        return localDateTime.compareTo(o.getLocalDateTime());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComparableEntity that = (ComparableEntity) o;
        return message.equals(that.message) &&
                localDateTime.equals(that.localDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, localDateTime);
    }
}
