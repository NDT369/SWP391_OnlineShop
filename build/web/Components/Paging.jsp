<%-- 
    Document   : Paging
    Created on : Jun 6, 2022, 10:24:10 AM
    Author     : Pham Minh Giang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="clearfix">
    <ul class="pagination">
        <li class="page-item"><a href="#" class="page-link">Previous</a></li>
        <c:forEach begin="1" end="${requestScope.page}" var="i">
            <li class="page-item"><a href="product?index=${i}" class="page-link">${i}</a></li>
        </c:forEach>
        <li class="page-item"><a href="#" class="page-link">Next</a></li>
    </ul>
</div>
