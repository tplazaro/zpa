insert into code_detail (empno, ename, job, mgr, hiredate, sal, comm, deptno) -- Noncompliant {{Use LLLRMSCST.LLL_CODE_DETAIL_CST or equivalent instead.}}
--          ^^^^^^^^^^^
    values(  
     test_empno, test_ename, test_job, null,  
     sysdate,  
     test_sal, null, test_deptno); 