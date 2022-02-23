<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/common/taglib.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Dashboard - SB Admin</title>
<link
	href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css"
	rel="stylesheet" />
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="<c:url value='/template/admin/css/styles.css' />" />





</head>
<body class="sb-nav-fixed">
	<!-- header -->
	<%@ include file="/common/admin/header.jsp"%>

	<div id="layoutSidenav"></div>
	<!-- body -->
	<%@ include file="/views/admin/home.jsp"%>



	<!-- footer -->
	<%@ include file="/common/admin/footer.jsp"%>




<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

	<script src="<c:url value = '/template/admin/js/scripts.js'/>"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js"></script>
	<script 
		src="https://cdn.jsdelivr.net/npm/simple-datatables@latest"></script>
	<script
		src="<c:url value ='/template/admin/assets/demo/chart-area-demo.js'/>">
		
	</script>
	<script
		src="<c:url value ='/template/admin/assets/demo/chart-bar-demo.js'/>">
		
	</script>
	<script
		src="<c:url value ='/template/admin/assets/demo/chart-pie-demo.js'/>">
		
	</script>

	<script
		src="<c:url value ='/template/admin/js/datatables-simple-demo.js'/>">
		
	</script>
</body>
</html>