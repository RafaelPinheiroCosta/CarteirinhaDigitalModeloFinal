package com.rafaelcosta.carteirinhadigital_4devm_t1.feature.carteirinha.data.repository

import com.rafaelcosta.carteirinhadigital_4devm_t1.feature.carteirinha.domain.model.Carteirinha
import kotlinx.coroutines.delay

class FakeCarteirinhaRepository : CarteirinhaRepository {
    override suspend fun buscarCarteirinha(): Result<Carteirinha> {
        delay(1500)

        return Result.success(
            Carteirinha(
                nome = "Rafael Costa",
                curso = "Técnico em Desenvolvimento de Sistemas",
                turma = "4DEVM-T1",
                matricula = "20260001",
                unidade = "SENAI Anchieta",
                status = "Ativo",
                qrCodeContent = "MATRICULA:20260001;ALUNO:Rafael Costa;TURMA:4DEVM-T1"
            )
        )
    }
}
