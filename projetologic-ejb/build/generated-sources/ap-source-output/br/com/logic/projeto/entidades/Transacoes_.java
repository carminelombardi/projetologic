package br.com.logic.projeto.entidades;

import br.com.logic.projeto.entidades.Tipoconta;
import br.com.logic.projeto.entidades.Tipotransacao;
import br.com.logic.projeto.entidades.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-26T22:49:33")
@StaticMetamodel(Transacoes.class)
public class Transacoes_ { 

    public static volatile SingularAttribute<Transacoes, Date> data;
    public static volatile SingularAttribute<Transacoes, Tipoconta> idtipoconta;
    public static volatile SingularAttribute<Transacoes, Tipotransacao> idtipotransacao;
    public static volatile SingularAttribute<Transacoes, BigDecimal> valor;
    public static volatile SingularAttribute<Transacoes, Integer> id;
    public static volatile SingularAttribute<Transacoes, Usuario> idusuario;

}