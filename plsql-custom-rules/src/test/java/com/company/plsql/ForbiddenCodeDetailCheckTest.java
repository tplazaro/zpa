package com.company.plsql;

import org.junit.Test;
import org.sonar.plsqlopen.checks.verifier.PlSqlCheckVerifier;

public class ForbiddenCodeDetailCheckTest {

    @Test
    public void test() {
        PlSqlCheckVerifier.verify("src/test/resources/forbidden-code-detail.sql", new ForbiddenCodeDetailCheck());
    }
    
}
