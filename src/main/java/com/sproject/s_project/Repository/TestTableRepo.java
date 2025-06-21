package com.sproject.s_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sproject.s_project.Entity.TestTable;

public interface TestTableRepo extends JpaRepository<TestTable, String> {
}
