<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<body>
<h2>In WEB_INF</h2>
<p>
    <%
        String name = (String) request.getAttribute("name");
        if (name != null) {
            out.println(name);
        }
    %>
</p>
</body>
</html>
