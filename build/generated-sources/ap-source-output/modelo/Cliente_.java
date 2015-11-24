package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Telefone;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-24T16:01:53")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile ListAttribute<Cliente, Telefone> telefoneList;
    public static volatile SingularAttribute<Cliente, Date> dataNasc;
    public static volatile SingularAttribute<Cliente, Long> cCodigo;
    public static volatile SingularAttribute<Cliente, String> cpf;
    public static volatile SingularAttribute<Cliente, String> nome;
    public static volatile SingularAttribute<Cliente, String> email;

}