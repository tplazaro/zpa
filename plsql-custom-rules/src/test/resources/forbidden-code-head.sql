insert into code_head (empno, ename, job, mgr, hiredate, sal, comm, deptno) -- Noncompliant {{Use LLLRMSCST.LLL_CODE_HEAD_CST or equivalent instead.}}
--          ^^^^^^^^^
    values(  
     test_empno, test_ename, test_job, null,  
     sysdate,  
     test_sal, null, test_deptno); 