/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nelioalves.cursomc.domain.enums;

/**
 *
 * @author Lucas
 */
public enum TipoCliente {
    
    PESSOAFISICA(1, "Pessoa Física"),
    PESSOAJURIDICA(2, "Pessoa Jurídica");
    
    private final int cod;
    private final String descricao;

    private TipoCliente(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public static TipoCliente toEnum(Integer id) {
        if (id == null) {
            return null;
        }
        for (TipoCliente x : TipoCliente.values()) {
            if (id.equals(x.getCod())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Id inválido " + id);
    }

}
