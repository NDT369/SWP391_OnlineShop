<%-- 
    Document   : sliderdetail
    Created on : Jun 28, 2022, 5:22:56 AM
    Author     : Pham Minh Giang
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/elegant-icons.css" rel="stylesheet" type="text/css"/>
        <link href="../css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/jquery-ui.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/nice-select.css" rel="stylesheet" type="text/css"/>
        <link href="../css/owl.carousel.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/slicknav.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>
        <link href="../css/themify-icons.css" rel="stylesheet" type="text/css"/>
        <link href="css/manager.css" rel="stylesheet" type="text/css"/>

        <style>
            img{
                width: 200px;
                height: 180px;
            }
            #head form{
                display: inline-block;
                align-items: center;
            }
            #sort{
                float: right;
            }
            #filter{
                margin-left: 400px;
            }
            #order span{
                color: greenyellow;
            }
        </style>

    </head>
    <body>

        <div class="container">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="col-sm-6" id="order">
                            <h1>Slider <b>Detail</b></h1><br>

                            <c:set value="${requestScope.slider}" var="s"/>
                            <h4>SliderID: <span>${s.id}</span></h4>

                        </div>
                        <div class="col-sm-6">
                        </div>
                    </div>
                </div>

                <form action="editslider">
                    <div class="modal-body">	
                        <input  name="id" value="${s.id}" hidden> 
                        <div class="form-group">
                            <label>Title</label>
                            <input type="text" class="form-control" required name="title" value="${s.title}">
                        </div>
                        <div class="form-group">
                            <label>Image</label>
                            <input  name="image" type="file" class="form-control" hidden="${s.imgURL}">
                            <img src="img/${s.imgURL}">
                        </div>
                        <div class="form-group">
                            <label>Content</label>
                            <textarea class="form-control" name="content" required >${s.content}</textarea>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                        <input type="submit" class="btn btn-info" value="Save">
                    </div>
                </form>
            </div>
            <a href="slidermanage"><button type="button" class="btn btn-primary">Back to Slider manage</button></a><br><br>

        </div>

        <script src="../js/bootstrap.min.js" type="text/javascript"></script>
        <script src="../js/imagesloaded.pkgd.min.js" type="text/javascript"></script>
        <script src="../js/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="../js/jquery-ui.min.js" type="text/javascript"></script>
        <script src="../js/jquery.countdown.min.js" type="text/javascript"></script>
        <script src="../js/jquery.dd.min.js" type="text/javascript"></script>
        <script src="../js/jquery.slicknav.js" type="text/javascript"></script>
        <script src="../js/jquery.nice-select.min.js" type="text/javascript"></script>
        <script src="../js/jquery.zoom.min.js" type="text/javascript"></script>
        <script src="../js/main.js" type="text/javascript"></script>
        <script src="../js/manager.js" type="text/javascript"></script>
        <script src="../js/owl.carousel.min.js" type="text/javascript"></script>
    </body>

</html>