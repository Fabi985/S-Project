package com.sproject.s_project.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TestTable")
public class TestTable {

    @Id
    private String TestField;

    public TestTable() {}

    public String getTestField() {
        return TestField;
    }
}