<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path2" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>샘플 목록</title>
	<!-- 헤드 부분 인클루드 -->
    <jsp:include page="../include/head.jsp"></jsp:include>
</head>
<body>

<div class="content" id="content">
    <div class="row column text-center">
      <h2 class="h1">샘플 목록</h2>
      <hr>
     
      
      	<c:forEach items="${sampleList }" var="sample" varStatus="status">
      		<tr>
      			
      			<td><a href="${path2 }/sample/getSample?=${sample.id }">${sample.id }</a></td>
      			<td>${sample.pw }</td>
      			
      		</tr>
      	</c:forEach>	
      	</tbody>
      </table>
    </div>
	</div>
	</div>
   
</body>
</html>