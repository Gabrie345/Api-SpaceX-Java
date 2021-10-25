<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>SpaceX</title>
    <!-- <link rel="stylesheet" href="css/css.css" /> -->
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
      crossorigin="anonymous"
    />
</head>
  <body class="p-3 mb-2 bg-dark text-white">
    
    <div class="container">
    <c:forEach items="${listaFoquete}" var="foquete" varStatus="loop">
      <div class="row">
        <h1 class="text-warning mb- mt-5">${foquete.nome}</h1>
        <div class="col-4">
          <p>
          	${foquete.descricao}
          </p>
<!--      Ajuste na data para dd/MM/YYYY -->
          <fmt:parseDate value="${foquete.dataPrimeiroVoo}" type="DATE" pattern="yyyy-MM-dd"  var="dtPrimeiroVoo"/> 
          <p >Data do primeiro lançamento: <span class="text-warning mb- mt-5"><fmt:formatDate value="${dtPrimeiroVoo}" pattern="dd/MM/yyyy"/></span></p>
          
          <div class="col-6">
            <h5 class="text-warning text-center">Valor por lançamento</h5>

            <div class="row mb-1 ">
              <p>
              <img
              style="width: 3rem"
              src="https://exchangenow.net/images/upload/1507908439607.png"
              class="border border-primary"
              />
              US$<span>${foquete.valorPorLancamento}.00</span>
              </p>
            </div>
              
            <div class="row mb-1 ">
              <p>
              <img
              style="width: 3rem"
              src="https://exchangenow.net/img/img-calculadora-nova/brazil.png"
              class="border border-primary"
              />
              <span>R$<span>${foquete.valorPorLancamentoReal},00</span></span>
              </p>
            </div>
          </div>
        </div>
        <div class="col-8">
        <c:forEach items="${foquete.getListaImagens()}" var="imagem" varStatus="loop">
	          <img
	            class="col-4"
	            style="width: 20rem"
	            src="${imagem}"
	            alt="Foquete"
	          />
	    </c:forEach>
	    </div>   
      </div>
    </c:forEach> 
    </div>
  </body>
</html>