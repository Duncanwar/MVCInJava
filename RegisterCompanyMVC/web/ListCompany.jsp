<%@page import="java.util.List"%>
<%@page import="reg.domain.Companies"%>
<%@page import="reg.domain.GenericDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List of Marks</h1>
        
<%--<jsp:forward page="CompanyReq.jsp" />--%> 
        <table border="1">
            <thead>
                <tr>
                    <th>Registration ID</th>
                    <th>Company Names</th>
                    <th>Marks</th>
                    <!--<th colspan="2">Actions</th>-->
                </tr>
            </thead>
            <tbody>
                <% 
               GenericDao<Companies> mkDao = new GenericDao<Companies>(Companies.class);
               List<Companies> mkList = mkDao.findAll();
               for(Companies mk: mkList){ 
                 %>
                <tr>
                    <td><%= mk.getRegistrationNo() %></td>
                    <td><%= mk.getCompanyName() %></td>
                    <td><%= mk.getCapital() %></td>                            
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>

    </body>
</html>