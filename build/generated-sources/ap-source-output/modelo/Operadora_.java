package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Telefone;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-24T16:01:53")
@StaticMetamodel(Operadora.class)
public class Operadora_ { 

    public static volatile ListAttribute<Operadora, Telefone> telefoneList;
    public static volatile SingularAttribute<Operadora, String> nome;
    public static volatile SingularAttribute<Operadora, Long> oCodigo;

}