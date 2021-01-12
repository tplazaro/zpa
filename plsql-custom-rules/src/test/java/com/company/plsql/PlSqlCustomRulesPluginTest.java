package com.company.plsql;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PlSqlCustomRulesPluginTest {

    @Test
    public void testRepository() {
        PlSqlCustomRulesDefinition plugin = new PlSqlCustomRulesDefinition();
        assertThat(plugin.repositoryName()).isEqualTo("Lululemon");
        assertThat(plugin.repositoryKey()).isEqualTo("invsys-rules");
        assertThat(plugin.checkClasses().length).isEqualTo(1);
    }

}
