<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirmation</title>
    <link href="src/main/resources/formatting/index.css" rel="stylesheet">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<section class="testimonial py-5" id="testimonial">
    <div class="container">
        <div class="row ">
            <div class="col-md-4 py-5 bg-primary text-white text-center ">
                <div class=" ">
                    <div class="card-body">
                        <img src="http://www.ansonika.com/mavia/img/registration_bg.svg" style="width:30%">
                        <h2 class="py-3">Confirmation</h2>
                        </p>
                    </div>
                </div>
                <div class=" ">
                    <div class="card-body">
                        <a href="${pageContext.request.contextPath}/add-Product" class="btn btn-info" role="button">Add a product</a>
                    </div>
                </div>
                <div class=" ">
                    <div class="card-body">
                        <a href="${pageContext.request.contextPath}/view/addSupplier.jsp" class="btn btn-info" role="button">Add a supplier</a>
                    </div>
                </div>
                <div class=" ">
                    <div class="card-body">
                        <a href="${pageContext.request.contextPath}/list-product" class="btn btn-info" role="button">List all products</a>
                    </div>
                </div>
                <div class=" ">
                    <div class="card-body">
                        <a href="${pageContext.request.contextPath}/list-supplier" class="btn btn-info" role="button">List all suppliers</a>
                    </div>
                </div>
            </div>
            <div class="col-md-8 py-5 border">
                <h4 class="pb-4">Please fill the details about the product you want to add.</h4>
                <div> operation done successfully </div>
            </div>
        </div>
    </div>
</section>

</html>
