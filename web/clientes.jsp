<%@page import="java.util.List"%>
<%@page import="modelo.Cliente"%>
<%@page import="dao.ClienteDAO"%>
<%@include file="cabecalho.jsp"%>
<%
     ClienteDAO dao = new ClienteDAO();
     
     List<Cliente> cliente = dao.listar();
%>
    
        <div>
            <h1 class="centro">Clientes</h1>
            
            <div>
                <a href="clientes-cadastrar.jsp">+ Novo Cliente</a><br />
                <form>
                    <input type="text" />
                    <input type="submit" value="Pesquisar"/><br />
                    <table>
                        <tr>
                            <th>Nome</th>
                            <th>Data Nasc.</th>
                            <th>CPF</th>
                            <th>Email</th>
                        </tr>
                        <%
                          for(Cliente clientes : cliente)
                        {    
                        %>
       
                        <tr>
                            <td><%=clientes.getNome()%></td>
                            <td><%=clientes.getDataNasc()%></td>
                            <td><%=clientes.getCpf()%></td>
                            <td><%=clientes.getEmail()%></td>
<!--        //                     <td><a href="clientes-atualizar.jsp?matricula=">Editar</a>
                                <a href="clientes-excluir-ok.jsp?matricula=">Excluir</a>-->
                            </td>
                            
                        </tr>
                        <%
                        }
                        %>
                    </table>
                    
                </form>
            </div>
        </div>
    </body>
</html>