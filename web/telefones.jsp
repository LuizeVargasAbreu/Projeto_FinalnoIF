<%@page import="java.util.List"%>
<%@page import="modelo.Telefone"%>
<%@page import="dao.TelefoneDAO"%>
<%@include file="cabecalho.jsp"%>
<%
     TelefoneDAO dao = new TelefoneDAO();
     
     List<Telefone> telefone = dao.listar();
%>
    
        <div>
            <h1 class="centro">Telefones</h1>
            
            <div>
                <a href="telefones_cadastrar.jsp">Colocar Algo que eu não sei o que é</a><br />
                <form>
                    <input type="text" />
                    <input type="submit" value="Pesquisar"/><br />
                                      
                </form>
            </div>
        </div>
    </body>
</html>