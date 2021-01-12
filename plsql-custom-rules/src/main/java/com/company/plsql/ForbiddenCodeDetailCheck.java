package com.company.plsql;

import org.sonar.check.Priority;
import org.sonar.check.Rule;
import org.sonar.plugins.plsqlopen.api.annnotations.ActivatedByDefault;
import org.sonar.plugins.plsqlopen.api.annnotations.ConstantRemediation;
import org.sonar.plugins.plsqlopen.api.checks.PlSqlCheck;
import org.sonar.plugins.plsqlopen.api.DmlGrammar;
import org.sonar.plugins.plsqlopen.api.sslr.AstNode;


@Rule(
    name = "Avoid insert on table CODE_DETAIL",
    description = "You should use another custom table under LLLRMSCST instead.",
    key = "ForbiddenCodeDetailCheck",
    priority = Priority.MAJOR
)
@ConstantRemediation("10min")
@ActivatedByDefault
public class ForbiddenCodeDetailCheck extends PlSqlCheck {
    
    @Override
    public void init() {
        subscribeTo(DmlGrammar.INSERT_EXPRESSION);
    }

    @Override
    public void visitNode(AstNode node) {
        AstNode table = node.getFirstChild(DmlGrammar.TABLE_REFERENCE);
        
        if (table != null && table.getTokenOriginalValue().equalsIgnoreCase("code_detail")) {
            addIssue(table, "Use LLLRMSCST.LLL_CODE_DETAIL_CST or equivalent instead.");
        }
    }

}
