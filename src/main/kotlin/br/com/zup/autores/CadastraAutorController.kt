package br.com.zup.autores

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import javax.transaction.Transactional
import javax.validation.Valid
import io.micronaut.http.HttpResponse
import io.micronaut.http.uri.UriBuilder

@Validated
@Controller("/autores")
class CadastraAutorController(val autorRepository: AutorRepository) {

    @Post
    @Transactional
    fun cadastra(@Body @Valid request: NovoAutorRequest): HttpResponse<Any> {

        val autor = request.paraAutor()
        autorRepository.save(autor)

        val uri = UriBuilder.of("/autores/{id}").expand(mutableMapOf(Pair("id", autor.id)))

        println("Autor => ${autor.nome}")

        return HttpResponse.created(uri)
    }
}