package com.company.plsql;

import org.junit.Test;
import org.sonar.plsqlopen.checks.verifier.PlSqlCheckVerifier;

public class ForbiddenCodeHeadCheckTest {

    @Test
    public void test() {
        PlSqlCheckVerifier.verify("src/test/resources/forbidden-code-head.sql", new ForbiddenCodeHeadCheck());
    }
    
}
