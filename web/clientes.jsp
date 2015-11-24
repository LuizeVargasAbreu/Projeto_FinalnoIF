<%@page import="java.util.List"%>
<%@page import="modelo.Cliente"%>
<%@page import="dao.ClienteDAO"%>
<%@include file="cabecalho.jsp"%>
<%
     ClienteDAO dao = new ClienteDAO();
     
     List<Cliente> clientes = dao.listar();
%>
    
        <div>
            <h1 class="centro">Clientes</h1>
            
            <div>
                <a href="clientes_cadastrar.jsp">+ Novo Cliente</a><br />
                <form>
                    <input type="text" />
                    <input type="submit" value="Pesquisar"/><br />
                   
                    
                </form>
            </div>
        </div>
    </body>
</html>