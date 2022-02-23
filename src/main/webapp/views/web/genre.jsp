<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="keywords"
	content="htmlcss bootstrap menu, navbar, hover nav menu CSS examples" />
<meta name="description"
	content="Bootstrap 5 navbar hover examples for any type of project, Bootstrap 5" />

<title>Demo - Bootstrap 5 hover dropdown sample. html code
	example</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet" crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
	crossorigin="anonymous"></script>

<style type="text/css">

/* ============ desktop view ============ */
@media all and (min-width: 992px) {
	.navbar .nav-item .dropdown-menu {
		display: none;
	}
	.navbar .nav-item:hover .nav-link {
		
	}
	.navbar .nav-item:hover .dropdown-menu {
		display: block;
	}
	.navbar .nav-item .dropdown-menu {
		margin-top: 0;
	}
}
/* ============ desktop view .end// ============ */
</style>
</head>
<body>

	<header class="section-header py-4">
		<div class="container">
			<h2>Demo page</h2>
		</div>
	</header>
	<!-- section-header.// -->
	<div class="container">
		<!-- ============= COMPONENT ============== -->
		 <nav class="navbar navbar-expand-lg navbar-light bg-primary">
			<div class="container-fluid">
				<a class="navbar-brand" href="#">Brand</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#main_nav"
					aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="main_nav">
					<ul class="navbar-nav">
						<li class="nav-item dropdown"><a
							class="nav-link  dropdown-toggle" href="#"
							data-bs-toggle="dropdown"> Quốc gia </a>
							<ul class="dropdown-menu">
								<c:forEach var="nation" items="${nations}">
									<li><a class="dropdown-item" href="#">${nation.nationName}</a></li>
								</c:forEach>

							</ul></li>
						<li class="nav-item"><a class="nav-link" href="#"> Phim
								chiếu rạp </a></li>
						<li class="nav-item"><a class="nav-link" href="#"> Phim
								bộ </a></li>
						<li class="nav-item dropdown"><a
							class="nav-link  dropdown-toggle" href="#"
							data-bs-toggle="dropdown"> Thể loại </a>
							<ul class="dropdown-menu">
								<c:forEach var="genre" items="${genres}">
									<li><a class="dropdown-item" href="#">${genre.genreName}</a></li>
								</c:forEach>


							</ul></li>

					</ul>
				</div>
				<!-- navbar-collapse.// -->
			</div>
			<!-- container-fluid.// -->
		</nav>

		<!-- ============= COMPONENT END// ============== -->



	</div>
	<!-- container //  -->

</body>
</html>