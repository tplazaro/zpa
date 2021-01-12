package com.company.plsql;

import org.sonar.plugins.plsqlopen.api.CustomPlSqlRulesDefinition;

public class PlSqlCustomRulesDefinition extends CustomPlSqlRulesDefinition {
    
    @Override
    public String repositoryName() {
        return "Lululemon";
    }

    @Override
    public String repositoryKey() {
        return "invsys-rules";
    }

    @Override
    public Class[] checkClasses() {
        return new Class[] {
        	ForbiddenCodeDetailCheck.class
        };
    }
}
