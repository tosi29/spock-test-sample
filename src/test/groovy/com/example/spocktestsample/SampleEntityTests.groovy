package com.example.spocktestsample

import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class SampleEntityTests extends Specification {

    def setup() {

    }

    def "toString_#testcase"(String testcase, String expected, String name, String address) {
        setup:
        SampleEntity entity = new SampleEntity(name, address)

        expect:
        expected == entity.toString()

        where:
        testcase || expected         || name             | address
        "test1"  || "name1 address1" || "name1"          | "address1"
        "test2"  || "name2 address2" || "name2"          | "address2"
    }

}

