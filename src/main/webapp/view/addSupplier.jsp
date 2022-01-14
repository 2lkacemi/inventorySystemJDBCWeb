<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add a product</title>
    <link href="${pageContext.request.contextPath}/resources/formatting/index.css" rel="stylesheet">
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
                        <h2 class="py-3">Add supplier</h2>
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
                <h4 class="pb-4">Please fill the details about the supplier you want to add.</h4>
                <form method="post" action="../supplier-servlet">
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <input id="name" name="name" placeholder="Store's name" class="form-control" type="text">
                        </div>
                        <div class="form-group col-md-6">
                            <input name="city" class="form-control" id="city" placeholder="City">
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group">
                            <div class="form-group">
                                <div class="form-check">
                                    <input class="form-check-input" type="checkbox" value="" id="invalidCheck2" required>
                                    <label class="form-check-label" for="invalidCheck2">
                                        <small>By clicking Submit, you agree to our Terms & Conditions,.</small>
                                    </label>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <button type="submit" value="Submit" class="btn btn-danger">Submit</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>

</html>
