<%@include file="cabecalho.jsp"%>
        <div>
            <h1 class="centro">Cadastro de Clientes</h1>
            
            <div>
                
                <form action="clientes_cadastraado.jsp" method="post">
                    <label>Nome:</label><input type="text" name="txtNome" /><br />
                    <label>Data Nasc.:</label><input type="text" name="txtData" /><br />
                    <label>CPF: </label><input type="text" name="txtCPF" /><br/>
                    <label>Email: </label><input type="text" name="txtEmail" /><br/>
                   
                    <input type="reset" value="Limpar" />
                    <input type="submit" value="Cadastrar" />
                </form>
            </div>
        </div>



    </body>
</html>
