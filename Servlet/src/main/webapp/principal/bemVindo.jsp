<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="xm" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pagina JSP sendo carregada</title>
</head>
<body>

	<jsp:include page="cabecalho.jsp" />

	    <h1>Listando atributos</h1>
	    
		    ${nome}
	    
	    <div id="dataFormatada">
	    	<p>Data não formatada : ${dataAtual}</p> 
	    	<p>Data formatada : <fmt:formatDate value="${dataAtual}" pattern="dd/MM/yyyy" /> </p>	

	    </div>
    
    <jsp:include page="rodape.jsp" />
    
  </body>
</html>