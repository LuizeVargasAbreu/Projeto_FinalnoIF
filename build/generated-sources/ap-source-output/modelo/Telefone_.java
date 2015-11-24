package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Cliente;
import modelo.Operadora;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-24T16:01:53")
@StaticMetamodel(Telefone.class)
public class Telefone_ { 

    public static volatile SingularAttribute<Telefone, String> tipo;
    public static volatile SingularAttribute<Telefone, String> numero;
    public static volatile SingularAttribute<Telefone, Cliente> cCodigo;
    public static volatile SingularAttribute<Telefone, Operadora> oCodigo;
    public static volatile SingularAttribute<Telefone, Long> tCodigo;

}