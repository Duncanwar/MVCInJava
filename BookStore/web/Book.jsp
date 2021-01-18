<%-- 
    Document   : Book.jsp
    Created on : Jan 17, 2021, 8:18:06 PM
    Author     : duncan
--%>

<%@page import="model.BookModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <% 
        BookModel cmModel = (BookModel)request.getAttribute("cm");
        if(cmModel == null){
            cmModel =  new BookModel();
            request.setAttribute("cm", cmModel);
        }
        %>
        <form action="Book.do" method="POST">
            <table>
                <tr>
                    <td>ISBN</td>
                    <td><input type="number" name="regNo" value="<%= cmModel.getIsbnInput()  %>" /> </td>
                    <td><label><%= cmModel.getIsbnMsg() %></label></td>
                </tr>
                 <tr>
                 <td>book Title</td>
                    <td><input type="text" name="name" value=" <%= cmModel.getTitleInp() %>" /></td>
                    <td><label><%= cmModel.getTitleMsg() %></label></td>
                 </tr
                 <tr>
                 <td>authors</td>
                    <td><input type="text" name="author" value=" <%= cmModel.getAuthorsInput() %>" /></td>
                    <td><label><%= cmModel.getAuthorsMsg() %></label></td>
                 </tr>
                 <td>Publication Date</td>
                    <td><input type="date" name="pubDate" value="<%= cmModel.getPubYearInp() %>" /></td>
                    <td><label></label></td>
                  <tr>
                    <td>category</td>
                    <td>
                       <select name="category" size="1">
                      <option>Education</option>
                      <option>Business</option>
                      <option>Miscellaneous</option>
                        </select></td>
                  </tr>
         
                   
                   <tr>
                    <td>Purchasing Price</td>
                    <td><input type="number" name="purchasePrice" value="<%= cmModel.getPurPriceInp() %>" /></td>
                    <td><label><%= cmModel.getPurPriceMsg() %></label></td>
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
