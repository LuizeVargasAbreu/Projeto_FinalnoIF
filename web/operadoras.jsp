<%@page import="java.util.List"%>
<%@page import="modelo.Operadora"%>
<%@page import="dao.OperadoraDAO"%>
<%@include file="cabecalho.jsp"%>
<%
     OperadoraDAO dao = new OperadoraDAO();
     
     List<Operadora> operadora = dao.listar();
%>
    
        <div>
            <h1 class="centro">Operadoras</h1>
            
            <div>
                <a href="operadoras_cadastrar.jsp">Colocar Algo que eu n�o sei o que �</a><br />
                <form>
                    <input type="text" />
                    <input type="submit" value="Pesquisar"/><br />
                                      
                </form>
            </div>
        </div>
    </body>
</html>