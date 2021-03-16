package br.com.zup.autores

import javax.persistence.Embeddable

@Embeddable
class Endereco(enderecoResponse: EnderecoResponse, numero: String) {

    val rua = enderecoResponse.rua
    val cidade = enderecoResponse.cidade
    val estado = enderecoResponse.estado

}
