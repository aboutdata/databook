<%-- 
    Document   : list
    Created on : 2015-6-29, 16:21:43
    Author     : Administrator
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <title>dubbo bootstrap</title>
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" />
        <style>
            body {
                background: #eeeeee;
            }
            .main-container {
                padding-top: 72px;
            }
            .navbar-inverse {
                background-color: #438EB9;
                border-bottom-color: rgba(0,0,0,0.33);
            }
            .navbar-inverse .navbar-brand {
                color: #EEE;
            }

            hr {
                border-width: 0;
                margin-top: 6px;
                margin-bottom: 6px;
            }
        </style>
    </head>
    <body> <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header pull-left">
                    <a class="navbar-brand" href="${pageContext.request.contextPath}">
                        &nbsp;<i class="glyphicon glyphicon-leaf"></i>&nbsp;
                        北京联创兄弟测试代码 <span class="smaller-75">(v1.0)</span>
                    </a>
                </div>

            </div>
        </div>

        <div class="container main-container">
            <div class="row">
                <div class="col-xs-3">
                    <div class="list-group">
                        <a href="#" class="list-group-item active">ibatis test unit </a>
                        <a href="#" class="list-group-item">显示角色记录</a>
                    </div>
                </div>
                <div class="col-xs-9">
                    <div class="panel panel-default">
                        <div class="panel-heading">显示用户记录</div>
                        <div class="panel-body">
                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>用户名</th>
                                        <th>部门</th>
                                        <th>姓名</th>
                                        <th>电子邮件</th>
                                        <th>是否可用</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${lists}" var="admin">
                                        <tr>
                                            <th scope="row">1</th>
                                            <td> 
                                                <a href="${pageContext.request.contextPath}/admin/role/details/${admin.id}.do">
                                                    ${admin.username}
                                                </a>
                                            </td>
                                            <td>${admin.department}</td>
                                            <td>${admin.name}</td>
                                            <td>${admin.email}</td>
                                            <td>${admin.isEnabled}</td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table><!--Table END //-->
                        </div>
                    </div>
                </div>
                <!--col 9 end-->
            </div>
        </div>
    </body>
</html>
