<%-- 
    Document   : CompanyReq
    Created on : Jan 17, 2021, 11:50:03 AM
    Author     : duncan
--%>

<%@page import="reg.model.CompanyModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
        CompanyModel cmModel = (CompanyModel)request.getAttribute("cm");
        if(cmModel == null){
            cmModel =  new CompanyModel();
            request.setAttribute("cm", cmModel);
        }
        %>
        <h1>Hello World!</h1>
        <form action="Company.do" method="POST">
            <table>
                <tr>
                    <td>Registration Id</td>
                    <td><input type="number" name="regNo" value="<%= cmModel.getIdInput() %>" /> </td>
                    <td><label><%= cmModel.getidMsg() %></label></td>
                </tr>
                 <tr>
                 <td>Company Name</td>
                    <td><input type="text" name="name" value=" <%= cmModel.getNameInp() %>" /></td>
                    <td><label></label></td>
                 </tr>
                  <tr>
                    <td>category</td>
                    <td>
                       <select name="category" size="1">
                      <option>Small</option>
                      <option>Medium</option>
                      <option>Corporate</option>
                        </select></td>
                  </tr>
                   <tr>
                    <td>Owner</td>
                    <td><input type="text" name="owner" value="<%= cmModel.getOwnerInp() %>" /></td>
                    <td><label></label></td>
                    
                   </tr>
                   <tr>
                    <td>Starting Date</td>
                    <td><input type="date" name="startDate" value="<%= cmModel.getStartInp() %>" /></td>
                    <td><label></label></td>
                   </tr>
                    <tr>
                    <td>Capital</td>
                    <td><input type="number" name="capital" value="<%= cmModel.getCapitalInp() %>" /></td>
                    <td><label><%= cmModel.getCapitalMsg() %></label></td>
                   </tr>
                     <tr>
                    <td></td>
                    <td> <input type="submit"  name="action" value="Save"/></td>
                    <td></td>
                </tr>
                 
            </table>
        </form>
    </body>
</html>
