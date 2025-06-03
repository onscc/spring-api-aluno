package com.exemplo.aluno;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AlunoServiceTest {

    @Autowired
    private AlunoService alunoService;

    @Test
    public void testSalvarAluno() {
        Aluno aluno = new Aluno("Maria", "maria@email.com");
        Aluno salvo = alunoService.salvar(aluno);
        assertNotNull(salvo.getId());
    }
}
