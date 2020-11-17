package com.example.spocktestsample

import spock.lang.Specification
import spock.lang.Unroll

import java.time.LocalDateTime

@Unroll
class ComparableEntityTest extends Specification {
    private static LocalDateTime date1 = LocalDateTime.now();
    private static LocalDateTime date2 = date1.plusDays(1);

    def "use '==' to compare"(ComparableEntity entity1, ComparableEntity entity2, boolean result) {
        expect:
        result == (entity1 == entity2)

        where:
        entity1                              | entity2                              | result
        new ComparableEntity("Test1", date1) | new ComparableEntity("Test1", date1) | true
        new ComparableEntity("Test1", date1) | new ComparableEntity("Test1", date2) | false
        new ComparableEntity("Test1", date1) | new ComparableEntity("Test2", date1) | true
        new ComparableEntity("Test1", date1) | new ComparableEntity("Test2", date2) | false
    }

    def "use 'equals()' to compare"() {
        expect:
        result == entity1.equals(entity2)

        where:
        entity1                              | entity2                              | result
        new ComparableEntity("Test1", date1) | new ComparableEntity("Test1", date1) | true
        new ComparableEntity("Test1", date1) | new ComparableEntity("Test1", date2) | false
        new ComparableEntity("Test1", date1) | new ComparableEntity("Test2", date1) | false
        new ComparableEntity("Test1", date1) | new ComparableEntity("Test2", date2) | false
    }
}
