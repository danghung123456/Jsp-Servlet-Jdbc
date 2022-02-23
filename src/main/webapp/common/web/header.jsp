<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
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
   <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container px-4 px-lg-5">
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
                
                        <button class="btn btn-outline-dark" type="submit">
                            <i class="bi bi-film"></i>
                           Add movie
                            <span class=""></span>
                        </button>
                    
                </div>
            </div>
        </nav>
</body>
</html>